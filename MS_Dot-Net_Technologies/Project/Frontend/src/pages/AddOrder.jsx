import React, { useState, useEffect } from 'react';
import { Form, Button, Container, Card } from 'react-bootstrap';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import AOS from 'aos';
import 'aos/dist/aos.css';

export default function AddOrder() {
    const [form, setForm] = useState({
        pickupAddress: '',
        deliveryAddress: '',
        description: ''
    });
    const navigate = useNavigate();

    useEffect(() => {
        AOS.init({ duration: 1000, once: true });
    }, []);

    const handleChange = e => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = async e => {
        e.preventDefault();
        try {
            await axios.post('https://localhost:7279/api/order/create', form, {
                headers: { Authorization: 'Bearer ' + localStorage.getItem('token') }
            });
            navigate('/user/dashboard');
        } catch (err) {
            console.error(err);
            alert('Failed to create order');
        }
    };

    return (
        <div className="addorder-wrapper">
            <Container style={{ maxWidth: '600px' }}>
                <Card 
                    className="shadow-lg rounded-4 border-0 p-4"
                    data-aos="fade-up"
                >
                    <h3 className="fw-bold text-theme text-center mb-4">Add New Order</h3>
                    <Form onSubmit={handleSubmit}>
                        <Form.Group className="mb-3">
                            <Form.Label>Pickup Address</Form.Label>
                            <Form.Control
                                name="pickupAddress"
                                value={form.pickupAddress}
                                onChange={handleChange}
                                required
                                placeholder="Enter pickup address"
                            />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Delivery Address</Form.Label>
                            <Form.Control
                                name="deliveryAddress"
                                value={form.deliveryAddress}
                                onChange={handleChange}
                                required
                                placeholder="Enter delivery address"
                            />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Description</Form.Label>
                            <Form.Control
                                as="textarea"
                                rows={3}
                                name="description"
                                value={form.description}
                                onChange={handleChange}
                                placeholder="Enter description (optional)"
                            />
                        </Form.Group>
                        <Button
                            type="submit"
                            className="w-100 fw-semibold rounded-pill shadow-sm btn-theme"
                            style={{ fontSize: '1.1rem' }}
                        >
                            Submit Order
                        </Button>
                    </Form>
                </Card>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .addorder-wrapper {
                    min-height: 100vh;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    background: linear-gradient(135deg,rgb(255, 255, 255) 0%,rgb(255, 255, 255) 100%);
                    padding: 40px 20px;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }
                .addorder-wrapper .form-label {
                    color: #3c4e5a;
                    font-weight: 500;
                }
                .addorder-wrapper .form-control {
                    border-radius: 8px;
                }
                .text-theme {
                    color: #ff4f70 !important;
                }
                .btn-theme {
                    background-color: #ff4f70;
                    color: white;
                    border: none;
                }
                .btn-theme:hover {
                    background-color: #e03c5d;
                }
                @media (max-width: 768px) {
                    .addorder-wrapper {
                        padding: 20px 10px;
                    }
                }
            `}</style>
        </div>
    );
}
