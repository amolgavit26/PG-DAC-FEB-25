import { Container, Table, Alert, Button } from "react-bootstrap";
import { fetchAllStudents } from "../services/StudentService";
import { useState, useEffect } from "react";


export function StudentList() {


    const [students, setStudent] = useState([]);


    const getStudents = async () => {
        try {
            const response = await fetchAllStudents();
            setStudent(response.data)
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(() => {
        getStudents();
    }, []);




    return (
        <Container className="mt-4">
            <Alert variant="success">
                <h5>List of Students</h5>
            </Alert>
            <Container className="mt-3">
                {
                    students.length > 0 ? <Table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Phone</th>
                            <th>Marks</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            students.map((s) => {
                                return(
                                    <tr>
                                        <td>{s.id}</td>
                                        <td>{s.name}</td>
                                        <td>{s.phone}</td>
                                        <td>{s.marks}</td>
                                        <td>
                                            <Button variant="primary" className="btn-sm me-3">Edit</Button>
                                            <Button variant="danger" className="btn-sm">Delete</Button>
                                        </td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </Table> : <h2>No Record Found..!!</h2>
                }
                
            </Container>
        </Container>
    )
}









