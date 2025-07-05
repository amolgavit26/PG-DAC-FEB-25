import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Table, Container, Button, Form, Card } from 'react-bootstrap';

export default function UsersList() {
    const [users, setUsers] = useState([]);
    const [roleMap, setRoleMap] = useState({});

    useEffect(() => {
        fetchUsers();
    }, []);

    async function fetchUsers() {
        try {
            const res = await axios.get('https://localhost:7279/api/user', {
                headers: {
                    Authorization: 'Bearer ' + localStorage.getItem('token')
                }
            });
            setUsers(res.data);
        } catch (err) {
            console.error(err);
        }
    }

    async function deleteUser(id) {
        try {
            await axios.delete(`https://localhost:7279/api/user/${id}`, {
                headers: {
                    Authorization: 'Bearer ' + localStorage.getItem('token')
                }
            });
            fetchUsers();
        } catch (err) {
            console.error(err);
        }
    }

    async function updateRole(id) {
        try {
            const newRole = roleMap[id];
            if (!newRole) return;

            await axios.put(`https://localhost:7279/api/user/${id}/role`, JSON.stringify(newRole), {
                headers: {
                    'Content-Type': 'application/json',
                    Authorization: 'Bearer ' + localStorage.getItem('token')
                }
            });
            fetchUsers();
        } catch (err) {
            console.error(err);
        }
    }

    return (
        <div className="users-wrapper">
            <Container>
                <h2 className="fw-bold text-theme text-center mb-4">Manage Users</h2>
                <Card className="shadow-lg rounded-4 border-0 p-3">
                    <Table striped bordered hover responsive className="rounded">
                        <thead className="table-light">
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Current Role</th>
                                <th>Update Role</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            {users.map(u => (
                                <tr key={u.id}>
                                    <td>{u.id}</td>
                                    <td>{u.name}</td>
                                    <td>{u.email}</td>
                                    <td>{u.role}</td>
                                    <td>
                                        <Form.Select
                                            value={roleMap[u.id] || u.role}
                                            onChange={e =>
                                                setRoleMap({ ...roleMap, [u.id]: e.target.value })
                                            }
                                            size="sm"
                                            className="mb-2"
                                        >
                                            <option value="User">User</option>
                                            <option value="Admin">Admin</option>
                                        </Form.Select>
                                        <Button
                                            className="w-100 rounded-pill fw-semibold shadow-sm btn-success-custom"
                                            size="sm"
                                            onClick={() => updateRole(u.id)}
                                        >
                                            Update
                                        </Button>
                                    </td>
                                    <td>
                                        <Button
                                            className="w-100 rounded-pill fw-semibold shadow-sm btn-danger-custom"
                                            size="sm"
                                            onClick={() => deleteUser(u.id)}
                                        >
                                            Delete
                                        </Button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </Table>
                </Card>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .users-wrapper {
                    min-height: 100vh;
                    background: linear-gradient(135deg,rgb(255, 255, 255) 0%,rgb(255, 255, 255) 100%);
                    padding: 40px 20px;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }
                .text-theme {
                    color: #ff4f70 !important;
                }
                .btn-success-custom {
                    background-color: #4caf50;
                    color: white;
                    border: none;
                }
                .btn-success-custom:hover {
                    background-color: #3e8e41;
                }
                .btn-danger-custom {
                    background-color: #dc3545;
                    color: white;
                    border: none;
                }
                .btn-danger-custom:hover {
                    background-color: #bb2d3b;
                }
                @media (max-width: 768px) {
                    .users-wrapper {
                        padding: 20px 10px;
                    }
                }
            `}</style>
        </div>
    );
}
