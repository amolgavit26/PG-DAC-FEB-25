import React, { useState } from "react";
import { Form, Button, Container, Card, InputGroup } from "react-bootstrap";
import { FaUser, FaEnvelope, FaLock } from 'react-icons/fa';
import axios from "axios";
import { useNavigate } from "react-router-dom";

export default function Signup() {
    const navigate = useNavigate();
    const [formData, setFormData] = useState({
        name: "",
        email: "",
        password: "",
        confirmPassword: "",
        role: "User"
    });
    const [error, setError] = useState("");

    const handleChange = (e) => {
        setFormData((prev) => ({
            ...prev,
            [e.target.name]: e.target.value
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        setError("");

        if (formData.password !== formData.confirmPassword) {
            setError("Passwords do not match");
            return;
        }

        try {
            await axios.post("https://localhost:7279/api/auth/register", {
                name: formData.name,
                email: formData.email,
                password: formData.password,
                role: "User"
            });
            navigate("/login");
        } catch (err) {
            setError(err.response?.data?.message || "Registration failed");
        }
    };

    return (
        <div className="signup-wrapper">
            <Container style={{ maxWidth: '500px' }}>
                <Card className="shadow-lg rounded-4 border-0">
                    <Card.Body className="p-4">
                        <h2 className="mb-4 fw-bold text-center text-theme">Create Account</h2>
                        <Form onSubmit={handleSubmit}>
                            <Form.Group controlId="name" className="mb-3">
                                <Form.Label>Name</Form.Label>
                                <InputGroup>
                                    <InputGroup.Text><FaUser className="text-theme" /></InputGroup.Text>
                                    <Form.Control
                                        type="text"
                                        name="name"
                                        value={formData.name}
                                        onChange={handleChange}
                                        required
                                        placeholder="Enter your name"
                                    />
                                </InputGroup>
                            </Form.Group>
                            <Form.Group controlId="email" className="mb-3">
                                <Form.Label>Email</Form.Label>
                                <InputGroup>
                                    <InputGroup.Text><FaEnvelope className="text-theme" /></InputGroup.Text>
                                    <Form.Control
                                        type="email"
                                        name="email"
                                        value={formData.email}
                                        onChange={handleChange}
                                        required
                                        placeholder="Enter your email"
                                    />
                                </InputGroup>
                            </Form.Group>
                            <Form.Group controlId="password" className="mb-3">
                                <Form.Label>Password</Form.Label>
                                <InputGroup>
                                    <InputGroup.Text><FaLock className="text-theme" /></InputGroup.Text>
                                    <Form.Control
                                        type="password"
                                        name="password"
                                        value={formData.password}
                                        onChange={handleChange}
                                        required
                                        placeholder="Enter your password"
                                    />
                                </InputGroup>
                            </Form.Group>
                            <Form.Group controlId="confirmPassword" className="mb-3">
                                <Form.Label>Confirm Password</Form.Label>
                                <InputGroup>
                                    <InputGroup.Text><FaLock className="text-theme" /></InputGroup.Text>
                                    <Form.Control
                                        type="password"
                                        name="confirmPassword"
                                        value={formData.confirmPassword}
                                        onChange={handleChange}
                                        required
                                        placeholder="Confirm your password"
                                    />
                                </InputGroup>
                            </Form.Group>
                            {error && <p className="text-danger text-center fw-semibold">{error}</p>}
                            <Button
                                type="submit"
                                className="w-100 py-2 fw-semibold shadow-sm rounded-pill btn-theme"
                                style={{ fontSize: '1.1rem' }}
                            >
                                Signup
                            </Button>
                        </Form>
                        <div className="mt-3 text-center">
                            <p>Already have an account? <a href="/login" className="text-link">Login here</a></p>
                        </div>
                    </Card.Body>
                </Card>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .signup-wrapper {
                    min-height: 100vh;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    background: linear-gradient(135deg, #f7f7f7 0%, #ffffff 100%);
                    padding: 40px 20px;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }
                .signup-wrapper .form-label {
                    color: #3c4e5a;
                    font-weight: 500;
                }
                .signup-wrapper .form-control {
                    border-radius: 8px;
                }
                .text-theme {
                    color: #ff4f70 !important;
                }
                .btn-theme {
                    background-color: #ff4f70;
                    border: none;
                }
                .btn-theme:hover {
                    background-color: #e03c5d;
                }
                .text-link {
                    color: #ff4f70;
                    text-decoration: none;
                    font-weight: 500;
                }
            `}</style>
        </div>
    );
}
