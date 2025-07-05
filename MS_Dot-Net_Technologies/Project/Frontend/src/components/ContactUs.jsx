import React, { useState, useEffect } from 'react';
import { Container, Card, Form, Button, Alert, Row, Col, ListGroup } from 'react-bootstrap';
import AOS from 'aos';
import 'aos/dist/aos.css';
import { Mail, Phone, MapPin, CheckCircle } from 'lucide-react';

export default function ContactUs() {
    const [form, setForm] = useState({ name: '', email: '', message: '' });
    const [success, setSuccess] = useState('');
    const [error, setError] = useState('');

    useEffect(() => {
        AOS.init({ duration: 1000, once: true });
    }, []);

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            // Simulate successful submission
            setSuccess('Your message has been sent! Thank you.');
            setError('');
            setForm({ name: '', email: '', message: '' });
        } catch (err) {
            console.error(err);
            setError('Failed to send your message. Please try again later.');
            setSuccess('');
        }
    };

    return (
        <div className="contact-wrapper">
            <Container>
                <Row className="g-4 justify-content-center">
                    {/* Form Card */}
                    <Col lg={6} data-aos="fade-up">
                        <Card className="shadow-sm border-0 rounded-4 p-4">
                            <h3 className="mb-3 text-theme text-center fw-bold">Contact Us</h3>
                            <p className="text-center text-muted mb-4">
                                We'd love to hear from you! Fill out the form below.
                            </p>

                            {success && <Alert variant="success">{success}</Alert>}
                            {error && <Alert variant="danger">{error}</Alert>}

                            <Form onSubmit={handleSubmit}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Your Name</Form.Label>
                                    <Form.Control
                                        type="text"
                                        name="name"
                                        value={form.name}
                                        onChange={handleChange}
                                        required
                                        placeholder="Enter your name"
                                    />
                                </Form.Group>
                                <Form.Group className="mb-3">
                                    <Form.Label>Your Email</Form.Label>
                                    <Form.Control
                                        type="email"
                                        name="email"
                                        value={form.email}
                                        onChange={handleChange}
                                        required
                                        placeholder="Enter your email"
                                    />
                                </Form.Group>
                                <Form.Group className="mb-3">
                                    <Form.Label>Message</Form.Label>
                                    <Form.Control
                                        as="textarea"
                                        rows={4}
                                        name="message"
                                        value={form.message}
                                        onChange={handleChange}
                                        required
                                        placeholder="Write your message..."
                                    />
                                </Form.Group>
                                <Button
                                    type="submit"
                                    className="w-100 fw-semibold rounded-pill shadow-sm btn-theme"
                                >
                                    Send Message
                                </Button>
                            </Form>
                        </Card>
                    </Col>

                    {/* Contact Info */}
                    <Col lg={4} data-aos="fade-up">
                        <Card className="shadow-sm border-0 rounded-4 p-4 mb-4">
                            <h5 className="fw-bold mb-3">Get in Touch</h5>
                            <ListGroup variant="flush">
                                <ListGroup.Item className="d-flex align-items-center gap-2 border-0 ps-0">
                                    <Mail color="#ff4f70" /> support@sanchara.com
                                </ListGroup.Item>
                                <ListGroup.Item className="d-flex align-items-center gap-2 border-0 ps-0">
                                    <Phone color="#ff4f70" /> +91-9876543210
                                </ListGroup.Item>
                                <ListGroup.Item className="d-flex align-items-center gap-2 border-0 ps-0">
                                    <MapPin color="#ff4f70" /> 123, Courier Street, Mumbai, India
                                </ListGroup.Item>
                            </ListGroup>
                        </Card>

                        {/* Why Choose Us */}
                        <Card className="shadow-sm border-0 rounded-4 p-4">
                            <h5 className="fw-bold mb-3">Why Choose Us?</h5>
                            <ListGroup variant="flush">
                                {[
                                    'Fast and reliable delivery services',
                                    'Real-time package tracking',
                                    '24/7 customer support',
                                    'Secure handling of packages',
                                    'Competitive pricing'
                                ].map((item, idx) => (
                                    <ListGroup.Item
                                        key={idx}
                                        className="d-flex align-items-center gap-2 border-0 ps-0"
                                    >
                                        <CheckCircle size={16} color="#ff4f70" /> {item}
                                    </ListGroup.Item>
                                ))}
                            </ListGroup>
                        </Card>
                    </Col>
                </Row>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .contact-wrapper {
                    min-height: 100vh;
                    display: flex;
                    align-items: center;
                    background: linear-gradient(135deg, #fdfbfb 0%, #ebedee 100%);
                    padding: 60px 20px;
                }
                .text-theme {
                    color: #ff4f70;
                }
                .btn-theme {
                    background-color: #ff4f70;
                    border: none;
                    color: white;
                }
                .btn-theme:hover {
                    background-color: #e84362;
                }
                .contact-wrapper h3 {
                    font-size: 1.8rem;
                }
                .contact-wrapper .form-label {
                    color: #3c4e5a;
                    font-weight: 500;
                }
                .contact-wrapper .form-control {
                    border-radius: 8px;
                }
            `}</style>
        </div>
    );
}
