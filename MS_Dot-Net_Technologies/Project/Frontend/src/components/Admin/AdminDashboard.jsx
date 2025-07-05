import React from 'react';
import { Container, Card, Button, Row, Col } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';

export default function AdminDashboard() {
    const navigate = useNavigate();

    return (
        <div style={{
            minHeight: '100vh',
            background: 'linear-gradient(135deg, #ffffff 0%, #f7f9fc 100%)',
            padding: '50px 0'
        }}>
            <Container>
                <h2 className="fw-bold text-center mb-5" style={{ color: '#e91e63', fontSize: '2.3rem' }}>
                    Admin Dashboard
                </h2>
                <Row className="g-4 justify-content-center">
                    <Col md={4} sm={6}>
                        <Card className="shadow-sm rounded-4 border-0 h-100 text-center p-4">
                            <div className="mb-3">
                                <div 
                                    style={{
                                        background: '#f8bbd0', 
                                        width: '60px', 
                                        height: '60px', 
                                        borderRadius: '50%', 
                                        display: 'flex',
                                        alignItems: 'center',
                                        justifyContent: 'center',
                                        margin: '0 auto'
                                    }}
                                >
                                    <i className="bi bi-people-fill text-white fs-3"></i>
                                </div>
                            </div>
                            <Card.Title className="fw-semibold mb-2">Manage Users</Card.Title>
                            <Card.Text className="text-muted">View and delete users</Card.Text>
                            <Button 
                                variant="outline-danger" 
                                className="mt-3 px-4 fw-semibold rounded-pill"
                                onClick={() => navigate('/admin/users')}
                            >
                                Go
                            </Button>
                        </Card>
                    </Col>
                    <Col md={4} sm={6}>
                        <Card className="shadow-sm rounded-4 border-0 h-100 text-center p-4">
                            <div className="mb-3">
                                <div 
                                    style={{
                                        background: '#f8bbd0', 
                                        width: '60px', 
                                        height: '60px', 
                                        borderRadius: '50%', 
                                        display: 'flex',
                                        alignItems: 'center',
                                        justifyContent: 'center',
                                        margin: '0 auto'
                                    }}
                                >
                                    <i className="bi bi-box-seam-fill text-white fs-3"></i>
                                </div>
                            </div>
                            <Card.Title className="fw-semibold mb-2">Manage Orders</Card.Title>
                            <Card.Text className="text-muted">View and update order status</Card.Text>
                            <Button 
                                variant="outline-danger" 
                                className="mt-3 px-4 fw-semibold rounded-pill"
                                onClick={() => navigate('/admin/orders')}
                            >
                                Go
                            </Button>
                        </Card>
                    </Col>
                </Row>
            </Container>
        </div>
    );
}
