import React, { useState } from 'react';
import axios from 'axios';
import { toast, ToastContainer } from 'react-toastify';
import { useNavigate } from 'react-router-dom';
import 'react-toastify/dist/ReactToastify.css';
import './Signup.css';

const Signup = () => {
  const navigate = useNavigate();

  const [user, setUser] = useState({
    firstName: '',
    lastName: '',
    email: '',
    password: '',
    role: 'USER'
  });

  const handleChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const validateInputs = () => {
    const nameRegex = /^[A-Za-z]{2,}$/;
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const passwordRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;
console.log(passwordRegex.test("cdac123"));
    if (!nameRegex.test(user.firstName)) {
      toast.error("First name should contain only letters and be at least 2 characters.");
      return false;
    }
    if (!nameRegex.test(user.lastName)) {
      toast.error("Last name should contain only letters and be at least 2 characters.");
      return false;
    }
    if (!emailRegex.test(user.email)) {
      toast.error("Invalid email format.");
      return false;
    }
    if (!passwordRegex.test(user.password)) {
      toast.error("Password must be at least 8 characters and contain both letters and numbers.");
      return false;
    }
    return true;
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!validateInputs()) return;

    try {
      await axios.post('http://localhost:8080/auth/signup', user);
      toast.success('Registration successful! Please sign in.');
      navigate('/signin');
    } catch (err) {
      const errorMessage = err.response?.data?.message || 'Registration failed!';
      toast.error(errorMessage);
    }
  };

  return (
    <div className="signup-container">
      <ToastContainer />
      <div className="signup-box">
        <h2>Sign Up</h2>
        <form onSubmit={handleSubmit}>
          <input
            type="text"
            name="firstName"
            placeholder="First Name"
            value={user.firstName}
            onChange={handleChange}
            required
          />
          <input
            type="text"
            name="lastName"
            placeholder="Last Name"
            value={user.lastName}
            onChange={handleChange}
            required
          />
          <input
            type="email"
            name="email"
            placeholder="Email"
            value={user.email}
            onChange={handleChange}
            required
          />
          <input
            type="password"
            name="password"
            placeholder="Password"
            value={user.password}
            onChange={handleChange}
            required
          />
          <select name="role" onChange={handleChange} value={user.role}>
            <option value="USER">User</option>
            <option value="ADMIN">Admin</option>
          </select>
          <button type="submit">Register</button>
        </form>
        <div className="signin-link">
          Already have an account? <a href="/signin">Sign In</a>
        </div>
      </div>
    </div>
  );
};

export default Signup;