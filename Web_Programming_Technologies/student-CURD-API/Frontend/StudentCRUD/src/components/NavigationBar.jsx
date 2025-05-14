
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { LinkContainer } from 'react-router-bootstrap';


export function NavigationBar() {

    return (
        <Navbar expand="lg" bg="dark" data-bs-theme="dark" >
            <Container>
                <Navbar.Brand href="/">Student App</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <LinkContainer to="/">
                            <Nav.Link>DashBoard</Nav.Link>
                        </LinkContainer>
                        <LinkContainer to="/register-student">
                            <Nav.Link>Register Student</Nav.Link>
                        </LinkContainer>
                        <LinkContainer to="/student-list">
                            <Nav.Link>Student List</Nav.Link>
                        </LinkContainer>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );



}

export default NavigationBar;