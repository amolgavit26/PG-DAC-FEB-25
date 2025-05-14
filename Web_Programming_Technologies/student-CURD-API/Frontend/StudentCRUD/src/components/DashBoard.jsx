import { Container, Alert } from "react-bootstrap";



export function DashBoard(){
    return(
        <Container className="mt-4">
            <Alert variant="success">
                <h2>welcome to student management application</h2>
            </Alert>
            <p>You can perform CRUD operation</p>
        </Container>
    )
}