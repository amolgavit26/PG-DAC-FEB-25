import { Container, Button, Row, Col, Card } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';

export default function Home() {
    const navigate = useNavigate();

    const handleHover = (e, enter) => {
        e.currentTarget.style.transform = enter ? 'scale(1.03)' : 'scale(1)';
        e.currentTarget.style.boxShadow = enter
            ? '0 8px 20px rgba(0, 0, 0, 0.15)'
            : '0 4px 12px rgba(0, 0, 0, 0.1)';
    };

    return (
        <div style={{ background: 'linear-gradient(135deg, #fefeff 0%, #f5f5f5 100%)', padding: '3rem 0' }}>
            <Container className="text-center mb-5">
                <Row className="align-items-center">
                    <Col md={7} className="text-md-start mb-4 mb-md-0">
                        <h1 className="fw-bold mb-3" style={{ color: '#e91e63', fontSize: '2.5rem' }}>
                            Effortless Deliveries, Exceptional Service:
                        </h1>
                        <h2 className="fw-semibold mb-4" style={{ fontSize: '1.9rem', color: '#212529' }}>
                            Transforming Logistics for a Seamless Courier Experience.
                        </h2>
                        <p className="text-muted mb-4 fs-5">
                            <i className="bi bi-truck"></i> Your Packages, Our Priority, Always on Time.
                        </p>
                        <div className="d-flex flex-wrap justify-content-center justify-content-md-start gap-3">
                            <Button
                                variant="danger"
                                className="fw-semibold px-4 py-2 rounded-pill"
                                onClick={() => navigate('/create-order')}
                            >
                                Create Order
                            </Button>
                            <Button
                                variant="outline-danger"
                                className="fw-semibold px-4 py-2 rounded-pill"
                                onClick={() => navigate('/signup')}
                            >
                                Get Started
                            </Button>
                            <Button
                                variant="dark"
                                className="fw-semibold px-4 py-2 rounded-pill"
                                onClick={() => navigate('/login')}
                            >
                                Login
                            </Button>
                        </div>
                    </Col>
                    <Col md={5}>
                        <Card className="border-0 shadow-sm p-3" style={{ background: '#fff', borderRadius: '1.5rem' }}>
                            <div className="d-flex justify-content-center mb-3">
                                <div
                                    style={{
                                        position: 'relative',
                                        width: '80px',
                                        height: '80px',
                                        background: 'linear-gradient(135deg, #ff4081, #f48fb1)',
                                        borderRadius: '50%',
                                        display: 'flex',
                                        alignItems: 'center',
                                        justifyContent: 'center',
                                    }}
                                >
                                    <i className="bi bi-box text-white fs-2"></i>
                                    <div
                                        style={{
                                            position: 'absolute',
                                            top: -8,
                                            right: -8,
                                            background: '#ff9800',
                                            borderRadius: '50%',
                                            width: '25px',
                                            height: '25px',
                                            display: 'flex',
                                            alignItems: 'center',
                                            justifyContent: 'center',
                                        }}
                                    >
                                        <i className="bi bi-truck text-white fs-6"></i>
                                    </div>
                                </div>
                            </div>
                            <div className="text-start">
                                <div className="p-2 rounded mb-2" style={{ background: '#fde4ec' }}>
                                    <i className="bi bi-dot text-pink"></i> Package collected
                                </div>
                                <div className="p-2 rounded mb-2" style={{ background: '#fff3e0' }}>
                                    <i className="bi bi-dot text-warning"></i> In transit
                                </div>
                                <div className="p-2 rounded" style={{ background: '#e8f5e9' }}>
                                    <i className="bi bi-dot text-success"></i> Delivered
                                </div>
                            </div>
                        </Card>
                    </Col>
                </Row>
            </Container>

            <Container className="mb-5">
                <h2 className="fw-bold mb-3 text-center">Welcome to Courier Management System</h2>
                <p className="text-muted text-center mb-4 px-3">
                    Welcome to Courier Management System, where precision meets passion in the world of courier
                    management. Whether you're a customer expecting a package, an administrator overseeing operations, or
                    a delivery person on the move – our comprehensive platform is designed to streamline every aspect of
                    the courier experience.
                </p>
            </Container>

            <Container>
                <Row className="g-4">
                    {[
                        {
                            title: 'Fast Delivery',
                            icon: 'bi-clock',
                            desc: 'Quick and reliable delivery services to ensure your packages arrive on time.',
                        },
                        {
                            title: 'Secure Handling',
                            icon: 'bi-shield-check',
                            desc: 'Your packages are handled with utmost care and security throughout the journey.',
                        },
                        {
                            title: 'Real-time Tracking',
                            icon: 'bi-geo-alt',
                            desc: 'Track your packages in real-time and stay updated on delivery status.',
                        },
                    ].map((card, idx) => (
                        <Col md={4} key={idx}>
                            <Card
                                className="h-100 shadow-sm border-0 text-center p-4 rounded-4"
                                style={{
                                    transition: 'transform 0.3s ease, box-shadow 0.3s ease',
                                    cursor: 'pointer',
                                }}
                                onMouseEnter={(e) => handleHover(e, true)}
                                onMouseLeave={(e) => handleHover(e, false)}
                            >
                                <div className="mb-3">
                                    <div
                                        className="d-flex align-items-center justify-content-center mx-auto"
                                        style={{
                                            width: '60px',
                                            height: '60px',
                                            background: 'linear-gradient(135deg, #ff4081, #f48fb1)',
                                            borderRadius: '50%',
                                        }}
                                    >
                                        <i className={`bi ${card.icon} text-white fs-3`}></i>
                                    </div>
                                </div>
                                <Card.Title className="fw-bold text-secondary">{card.title}</Card.Title>
                                <Card.Text className="text-muted">{card.desc}</Card.Text>
                            </Card>
                        </Col>
                    ))}
                </Row>
            </Container>
        </div>
    );
}
