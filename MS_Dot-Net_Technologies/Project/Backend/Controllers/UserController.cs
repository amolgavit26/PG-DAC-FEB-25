using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using CourierManagementSystem.Data;
using CourierManagementSystem.Models;
using CourierManagementSystem.DTOs;

namespace CourierManagementSystem.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class UserController : ControllerBase
    {
        private readonly ApplicationDbContext _context;
        public UserController(ApplicationDbContext context)
        {
            _context = context;
        }

        
        [HttpGet]
        [Authorize(Roles = "Admin")]
        public IActionResult GetAllUsers()
        {
            var users = _context.Users.ToList();
            return Ok(users);
        }

        
        [HttpGet("{id}")]
        [Authorize]
        public IActionResult GetUserById(int id)
        {
            var user = _context.Users.Find(id);
            if (user == null) return NotFound();
            return Ok(user);
        }

        
        [HttpPut("{id}")]
        [Authorize]
        public IActionResult UpdateUser(int id, [FromBody] UpdateUserDto dto)
        {
            var user = _context.Users.Find(id);
            if (user == null) return NotFound();

            user.Name = dto.Name;
            user.Email = dto.Email;

            _context.SaveChanges();
            return Ok(user);
        }

        
        [HttpPut("{id}/role")]
        [Authorize(Roles = "Admin")]
        public IActionResult UpdateUserRole(int id, [FromBody] string newRole)
        {
            if (string.IsNullOrWhiteSpace(newRole))
            {
                return BadRequest(new { message = "Role is required." });
            }

            var user = _context.Users.Find(id);
            if (user == null)
            {
                return NotFound(new { message = "User not found." });
            }

            user.Role = newRole;
            _context.SaveChanges();

            return Ok(new { message = "User role updated successfully.", user });
        }

        
        [HttpDelete("{id}")]
        [Authorize(Roles = "Admin")]
        public IActionResult DeleteUser(int id)
        {
            var user = _context.Users.Find(id);
            if (user == null) return NotFound();

            _context.Users.Remove(user);
            _context.SaveChanges();
            return Ok(new { message = "User deleted successfully" });
        }
    }
}
