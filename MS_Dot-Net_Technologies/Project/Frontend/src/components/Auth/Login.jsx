import React, { useState } from 'react';
import { Form, Button, Card, Alert, Container } from 'react-bootstrap';
import api from '../../services/api';
import { useNavigate } from 'react-router-dom';

export default function Login() {
    const [form, setForm] = useState({ role: 'Default', email: '', password: '' });
    const [message, setMessage] = useState('');
    const [variant, setVariant] = useState('info');
    const navigate = useNavigate();

    const handleChange = e => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = async e => {
        e.preventDefault();
        try {
            const res = await api.post('/auth/login', form);

            localStorage.setItem('token', res.data.token);
            localStorage.setItem('role', res.data.role);
            localStorage.setItem('name', res.data.name);
            localStorage.setItem('userId', res.data.userId);

            setVariant('success');
            setMessage('Login successful! Redirecting...');

            setTimeout(() => {
                if (res.data.role === 'Admin') {
                    navigate('/admin/dashboard');
                } else if (res.data.role === 'User') {
                    navigate('/user/dashboard');
                } else {
                    navigate('/');
                }
            }, 1000);

        } catch (err) {
            setVariant('danger');
            setMessage('Invalid email or password');
        }
    };

    return (
        <div className="login-wrapper">
            <Container style={{ maxWidth: '450px' }}>
                <Card className="shadow-lg border-0 rounded-4">
                    <Card.Body className="p-4">
                        <h3 className="mb-4 text-center text-theme fw-bold">Login</h3>
                        {message && <Alert variant={variant}>{message}</Alert>}
                        <Form onSubmit={handleSubmit}>
                            <Form.Group className="mb-3">
                                <Form.Label>Email</Form.Label>
                                <Form.Control
                                    type="email"
                                    name="email"
                                    value={form.email}
                                    onChange={handleChange}
                                    required
                                    placeholder="Enter your email"
                                />
                            </Form.Group>
                            <Form.Group className="mb-4">
                                <Form.Label>Password</Form.Label>
                                <Form.Control
                                    type="password"
                                    name="password"
                                    value={form.password}
                                    onChange={handleChange}
                                    required
                                    placeholder="Enter your password"
                                />
                            </Form.Group>
                            <Button
                                type="submit"
                                className="w-100 fw-semibold rounded-pill btn-theme shadow-sm"
                                style={{ fontSize: '1.1rem' }}
                            >
                                Login
                            </Button>
                        </Form>
                        <div className="mt-4 text-center">
                            <p>
                                Don't have an account? <a href="/register" className="text-link">Register here</a>
                            </p>
                        </div>
                    </Card.Body>
                </Card>
            </Container>

            <style>{`
                .login-wrapper {
                    min-height: 100vh;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    background: linear-gradient(135deg, #f7f7f7 0%, #ffffff 100%);
                    padding: 40px 20px;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }
                .form-label {
                    color: #3c4e5a;
                    font-weight: 500;
                }
                .form-control {
                    border-radius: 8px;
                }
                .text-theme {
                    color: #f54291 !important;
                }
                .btn-theme {
                    background-color: #f54291;
                    border: none;
                }
                .btn-theme:hover {
                    background-color: #d63384;
                }
                .text-link {
                    color: #f54291;
                    text-decoration: none;
                    font-weight: 500;
                }
                .text-link:hover {
                    text-decoration: underline;
                }
            `}</style>
        </div>
    );
}
