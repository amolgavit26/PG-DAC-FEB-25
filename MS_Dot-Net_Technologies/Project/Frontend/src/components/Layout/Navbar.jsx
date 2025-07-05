import { Navbar, Nav, Container, Button } from 'react-bootstrap';
import { Link, useNavigate } from 'react-router-dom';

export default function AppNavbar() {
    const navigate = useNavigate();
    const token = localStorage.getItem('token');
    const role = localStorage.getItem('role');
    const userName = localStorage.getItem('userName') || 'User'; // adjust key if needed

    const handleLogout = () => {
        localStorage.removeItem('token');
        localStorage.removeItem('role');
        localStorage.removeItem('userName');
        navigate('/login');
    };

    return (
        <Navbar expand="lg" className="bg-white shadow-sm py-3">
            <Container>
                <Navbar.Brand as={Link} to="/" className="d-flex align-items-center fw-bold" style={{ color: '#e91e63', fontSize: '1.5rem' }}>
                    <i className="bi bi-box-fill me-2" style={{ fontSize: '1.8rem' }}></i>
                    Sanchara ( संचार )
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="ms-auto align-items-center gap-2">
                        <Nav.Link as={Link} to="/About" className="text-dark fw-semibold">About Us</Nav.Link>
                        <Nav.Link as={Link} to="/contact" className="text-dark fw-semibold">Contact Us</Nav.Link>
                        <Nav.Link as={Link} to="/feedback" className="text-dark fw-semibold">Feedback</Nav.Link>


                        {token && (
                            <Nav.Link
                                as={Link}
                                to={role === 'Admin' ? '/admin/dashboard' : '/user/dashboard'}
                                className="border px-3 py-1 rounded fw-semibold text-dark"
                            >
                                Dashboard
                            </Nav.Link>
                        )}

                        {token && (
                            <Button
                                variant="outline-danger"
                                size="sm"
                                className="fw-semibold ms-1"
                                onClick={handleLogout}
                            >
                                Logout
                            </Button>
                        )}

                        {!token && (
                            <>
                                <Nav.Link as={Link} to="/login" className="text-dark fw-semibold">Login</Nav.Link>
                                <Nav.Link as={Link} to="/signup" className="text-dark fw-semibold">Signup</Nav.Link>
                            </>
                        )}
                    </Nav>
                </Navbar.Collapse>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .navbar-nav .nav-link {
                    transition: color 0.2s;
                }
                .navbar-nav .nav-link:hover {
                    color: #e91e63;
                }
            `}</style>
        </Navbar>
    );
}
