import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Signup from './components/Auth/Signup';
import Login from './components/Auth/Login';
import Home from './components/Home';
import AppNavbar from './components/Layout/Navbar';
import AppFooter from './components/Layout/Footer';
import AdminDashboard from './components/Admin/AdminDashboard';
import UsersList from './components/Admin/UsersList';
import OrdersList from './components/Admin/OrdersList';
import UserDashboard from './components/User/UserDashboard';
import AddOrder from './pages/AddOrder';
import About from './components/About';
import Feedback from './components/Feedback';
import ContactUs from './components/ContactUs';
import 'bootstrap-icons/font/bootstrap-icons.css';


export default function App() {
  return (
    <Router>
      <div className="d-flex flex-column min-vh-100">
        <AppNavbar />

        <main className="flex-grow-1">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/signup" element={<Signup />} />
            <Route path="/login" element={<Login />} />
            
            {/* Admin Routes */}
            <Route path="/admin/dashboard" element={<AdminDashboard />} />
            <Route path="/admin/users" element={<UsersList />} />
            <Route path="/admin/orders" element={<OrdersList />} />
            
            {/* User Routes */}
            <Route path="/user/dashboard" element={<UserDashboard />} />
            <Route path="/add-order" element={<AddOrder />} />
            
            {/* General Pages */}
            <Route path="/about" element={<About />} />
            <Route path="/feedback" element={<Feedback />} />
            <Route path="/contact" element={<ContactUs />} />

            {/* Optional: Catch-all route */}
            {/* <Route path="*" element={<NotFound />} /> */}
          </Routes>
        </main>

        <AppFooter />
      </div>
    </Router>
  );
}
