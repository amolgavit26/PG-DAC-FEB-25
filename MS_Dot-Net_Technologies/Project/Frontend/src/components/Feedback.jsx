import React, { useState } from 'react';
import { Container, Form, Button, Alert, Card } from 'react-bootstrap';

export default function Feedback() {
    const [form, setForm] = useState({ subject: '', message: '' });
    const [success, setSuccess] = useState('');
    const [error, setError] = useState('');

    const handleChange = e => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = async e => {
        e.preventDefault();
        try {
            // Example: replace this with your real API call
            // await axios.post('/api/feedback', form);
            setSuccess('Thank you for your feedback!');
            setError('');
            setForm({ subject: '', message: '' });
        } catch (err) {
            console.error(err);
            setError('Failed to submit feedback. Please try again.');
            setSuccess('');
        }
    };

    return (
        <div className="feedback-wrapper">
            <Container style={{ maxWidth: '600px' }}>
                <Card className="shadow-lg border-0 rounded-4">
                    <Card.Body className="p-4">
                        <h2 className="mb-4 fw-bold text-center text-theme">Feedback</h2>
                        {success && <Alert variant="success">{success}</Alert>}
                        {error && <Alert variant="danger">{error}</Alert>}
                        <Form onSubmit={handleSubmit}>
                            <Form.Group className="mb-3">
                                <Form.Label>Subject</Form.Label>
                                <Form.Control
                                    type="text"
                                    name="subject"
                                    value={form.subject}
                                    onChange={handleChange}
                                    required
                                    placeholder="Enter subject"
                                />
                            </Form.Group>
                            <Form.Group className="mb-4">
                                <Form.Label>Message</Form.Label>
                                <Form.Control
                                    as="textarea"
                                    rows={4}
                                    name="message"
                                    value={form.message}
                                    onChange={handleChange}
                                    required
                                    placeholder="Write your feedback..."
                                />
                            </Form.Group>
                            <Button
                                type="submit"
                                className="w-100 fw-semibold text-white rounded-pill"
                                style={{
                                    backgroundColor: '#ff4f70',
                                    border: 'none',
                                    fontSize: '1.05rem'
                                }}
                            >
                                Submit Feedback
                            </Button>
                        </Form>
                    </Card.Body>
                </Card>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .feedback-wrapper {
                    min-height: 100vh;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    background: linear-gradient(135deg, #f7f7f7 0%, #ffffff 100%);
                    padding: 40px 20px;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }
                .form-label {
                    font-weight: 500;
                    color: #3c4e5a;
                }
                .form-control {
                    border-radius: 10px;
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
            `}</style>
        </div>
    );
}
