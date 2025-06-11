package com.carservice.controller;

import com.carservice.dao.UserRepository;
import com.carservice.entity.*;
import com.carservice.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        // Check if email already exists
        if (userRepo.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already registered");
        }

        // Validate role from input, default to USER if invalid or null
        if (user.getRole() == null || (!user.getRole().equals(Role.ADMIN) && !user.getRole().equals(Role.USER))) {
            user.setRole(Role.USER);
        }

        // Encode password
        user.setPassword(encoder.encode(user.getPassword()));

        try {
            userRepo.save(user);
            return ResponseEntity.ok("User registered successfully");
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already registered");
        }
    }


    @PostMapping("/signin")
    public Map<String, String> signin(@RequestBody AuthRequest authRequest) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));

        User user = userRepo.findByEmail(authRequest.getEmail()).orElseThrow();

        // ✅ Updated to include userId in token
        String token = jwtUtil.generateToken(user.getEmail(), user.getRole().name(), user.getId());

        return Map.of("token", token);
    }


    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("You have been logged out. Please discard the token on client side.");
    }
}
