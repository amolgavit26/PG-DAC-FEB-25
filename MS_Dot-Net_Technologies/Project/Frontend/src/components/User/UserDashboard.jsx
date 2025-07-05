import React, { useEffect, useState } from 'react';
import { Button, Container, Table, Spinner, Alert, Card } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';

export default function UserDashboard() {
    const [orders, setOrders] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState('');
    const navigate = useNavigate();

    useEffect(() => {
        fetchUserOrders();
    }, []);

    const fetchUserOrders = async () => {
        try {
            setLoading(true);
            setError('');
            const res = await axios.get('https://localhost:7279/api/order/user', {
                headers: { Authorization: 'Bearer ' + localStorage.getItem('token') }
            });
            setOrders(res.data);
        } catch (err) {
            console.error('❌ Failed to fetch user orders:', err);
            setError('Failed to load your orders. Please check your login or try again.');
        } finally {
            setLoading(false);
        }
    };

    return (
        <div className="dashboard-wrapper">
            <Container>
                <h2 className="fw-bold text-theme text-center mb-4">My Orders</h2>
                <Card className="shadow-lg rounded-4 border-0 p-3">
                    <div className="d-flex justify-content-end mb-3">
                        <Button 
                            className="fw-semibold shadow-sm rounded-pill btn-theme"
                            onClick={() => navigate('/add-order')}
                        >
                            + Add Order
                        </Button>
                    </div>

                    {loading ? (
                        <div className="text-center"><Spinner animation="border" /></div>
                    ) : error ? (
                        <Alert variant="danger">{error}</Alert>
                    ) : orders.length === 0 ? (
                        <Alert variant="info">You have no orders yet.</Alert>
                    ) : (
                        <Table striped bordered hover responsive className="rounded">
                            <thead className="table-light">
                                <tr>
                                    <th>ID</th>
                                    <th>Status</th>
                                    <th>Pickup Address</th>
                                    <th>Delivery Address</th>
                                    <th>Order Date</th>
                                    <th>Estimated Delivery</th>
                                </tr>
                            </thead>
                            <tbody>
                                {orders.map(order => (
                                    <tr key={order.id}>
                                        <td>{order.id}</td>
                                        <td>{order.status}</td>
                                        <td>{order.pickupAddress}</td>
                                        <td>{order.deliveryAddress}</td>
                                        <td>{new Date(order.orderDate).toLocaleDateString()}</td>
                                        <td>{new Date(order.estimatedDeliveryDate).toLocaleDateString()}</td>
                                    </tr>
                                ))}
                            </tbody>
                        </Table>
                    )}
                </Card>
            </Container>

            {/* Scoped styles */}
            <style>{`
                .dashboard-wrapper {
                    min-height: 100vh;
                    background: linear-gradient(135deg,rgb(255, 255, 255) 0%,rgb(255, 255, 255) 100%);
                    padding: 40px 20px;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                }
                .text-theme {
                    color: #ff4f70 !important;
                }
                .btn-theme {
                    background-color: #ff4f70;
                    color: white;
                    border: none;
                }
                .btn-theme:hover {
                    background-color: #e03c5d;
                }
                @media (max-width: 768px) {
                    .dashboard-wrapper {
                        padding: 20px 10px;
                    }
                }
            `}</style>
        </div>
    );
}
