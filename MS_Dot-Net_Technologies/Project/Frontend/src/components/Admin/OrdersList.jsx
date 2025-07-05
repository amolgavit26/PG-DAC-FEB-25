import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Container, Table, Spinner, Alert, Button, Form, Card } from 'react-bootstrap';

export default function AdminOrdersList() {
    const [orders, setOrders] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState('');
    const [statusUpdates, setStatusUpdates] = useState({});

    useEffect(() => {
        fetchAllOrders();
    }, []);

    async function fetchAllOrders() {
        try {
            setLoading(true);
            const res = await axios.get('https://localhost:7279/api/order', {
                headers: { Authorization: 'Bearer ' + localStorage.getItem('token') }
            });
            setOrders(res.data);
        } catch (err) {
            console.error('❌ Failed to fetch all orders:', err);
            setError('Failed to load orders. Please try again.');
        } finally {
            setLoading(false);
        }
    }

    const handleStatusChange = (orderId, newStatus) => {
        setStatusUpdates(prev => ({ ...prev, [orderId]: newStatus }));
    };

    const updateStatus = async (orderId) => {
        try {
            await axios.put(`https://localhost:7279/api/order/${orderId}/status`,
                { status: statusUpdates[orderId] },
                { headers: { Authorization: 'Bearer ' + localStorage.getItem('token') } }
            );
            fetchAllOrders();
        } catch (err) {
            console.error('❌ Failed to update status:', err);
            alert('Failed to update status');
        }
    };

    return (
        <div className="admin-orders-wrapper">
            <Container>
                <h2 className="fw-bold text-theme text-center mb-4">All Orders (Admin)</h2>
                <Card className="shadow-lg rounded-4 border-0 p-3">
                    {loading ? (
                        <div className="text-center"><Spinner animation="border" /></div>
                    ) : error ? (
                        <Alert variant="danger">{error}</Alert>
                    ) : orders.length === 0 ? (
                        <Alert variant="info">No orders found.</Alert>
                    ) : (
                        <Table striped bordered hover responsive className="rounded">
                            <thead className="table-light">
                                <tr>
                                    <th>ID</th>
                                    <th>Tracking Number</th>
                                    <th>Status</th>
                                    <th>Pickup Address</th>
                                    <th>Delivery Address</th>
                                    <th>Description</th>
                                    <th>Order Date</th>
                                    <th>Estimated Delivery</th>
                                    <th>Change Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                {orders.map(order => (
                                    <tr key={order.id}>
                                        <td>{order.id}</td>
                                        <td>{order.trackingNumber}</td>
                                        <td>{order.status}</td>
                                        <td>{order.pickupAddress}</td>
                                        <td>{order.deliveryAddress}</td>
                                        <td>{order.description}</td>
                                        <td>{new Date(order.orderDate).toLocaleDateString()}</td>
                                        <td>{new Date(order.estimatedDeliveryDate).toLocaleDateString()}</td>
                                        <td>
                                            <Form.Select
                                                size="sm"
                                                value={statusUpdates[order.id] || order.status}
                                                onChange={e => handleStatusChange(order.id, e.target.value)}
                                                className="mb-2"
                                            >
                                                <option>Pending</option>
                                                <option>In Transit</option>
                                                <option>Delivered</option>
                                                <option>Cancelled</option>
                                            </Form.Select>
                                            <Button
                                                className="w-100 rounded-pill fw-semibold shadow-sm btn-success-custom"
                                                size="sm"
                                                onClick={() => updateStatus(order.id)}
                                            >
                                                Update
                                            </Button>
                                        </td>
                                    </tr>
                                ))}
                            </tbody>
                        </Table>
                    )}
                </Card>
            </Container>

            {/* Scoped Styles */}
            <style>{`
                .admin-orders-wrapper {
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
                @media (max-width: 768px) {
                    .admin-orders-wrapper {
                        padding: 20px 10px;
                    }
                }
            `}</style>
        </div>
    );
}
