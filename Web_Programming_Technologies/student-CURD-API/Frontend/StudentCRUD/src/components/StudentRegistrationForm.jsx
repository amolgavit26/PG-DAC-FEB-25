import { Container, Form, Row, Col, Alert, Button } from "react-bootstrap";
import { useState, useEffect } from "react";
import { registerStudent } from "../services/StudentService";
import { toast } from "react-toastify";

export function StudentRegistrationForm() {

    const [formData, setFormData] = useState({id:"", name:"", phone:"", marks:""});

const handleChange = (event) => {
    setFormData({...formData,[event.target.name] : event.target.value})
}

const handleSubmit = async  (event) =>{
    try {
        event.preventDefault();
        console.log(formData);
        const response = await registerStudent(formData);
        console.log(response);
        if(response.status === 200){
            toast.success("Student Registerd Successfully")
        }
    } catch (error) {
        console.log(error)
        toast.error("Somethig went Wrong")
    }
}

    return (
        <Container className="mt-4">
            <Alert variant="success">
                <h5>register student</h5>
            </Alert>
            <Container className="mt-3">
                <Form onSubmit={handleSubmit}>
                    <Row>
                        <Col lg={4}>
                            <Form.Group className="mb-3">
                                <Form.Label>ID</Form.Label>
                                <Form.Control type="text" placeholder="Enter your ID" name="id" onChange={handleChange}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col lg={4}>
                            <Form.Group className="mb-3">
                                <Form.Label>Name</Form.Label>
                                <Form.Control type="text" placeholder="Enter your Name" name="name" onChange={handleChange}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Row>
                        <Col lg={4}>
                            <Form.Group className="mb-3">
                                <Form.Label>Phone</Form.Label>
                                <Form.Control type="text" placeholder="Enter your Phone Number" name="phone" onChange={handleChange}></Form.Control>
                            </Form.Group>
                        </Col>
                        <Col lg={4}>
                            <Form.Group className="mb-3">
                                <Form.Label>Marks</Form.Label>
                                <Form.Control type="text" placeholder="Enter your Marks" name="marks" onChange={handleChange}></Form.Control>
                            </Form.Group>
                        </Col>
                    </Row>
                    <Button type="submit" variant="primary">Register</Button>
                </Form>
            </Container>

        </Container>
    )
}