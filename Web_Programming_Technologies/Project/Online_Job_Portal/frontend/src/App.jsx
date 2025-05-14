import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navigationbar from './components/Navbar';
import Footer from './components/Footer';
import Signin from './pages/Signin';
import SignUp from './pages/SignUp';
import Jobs from './pages/Jobs';

import Feedback from './pages/Feedback';
import About from './pages/About';
import Contact from './pages/Contact';
import Home from './pages/Home';
import EditJob from './pages/EditJob'; 
import PostJob from './pages/PostJob';

import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

import './App.css';

function App() {
  return (
    <Router>
      <div className="app">
        <Navigationbar />

       
        <ToastContainer
          position="top-center"
          autoClose={3000}
          hideProgressBar={false}
          newestOnTop
          closeOnClick
          pauseOnFocusLoss
          draggable
          pauseOnHover
          theme="colored"
        />

        <div className="content">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/signin" element={<Signin />} />
            <Route path="/signup" element={<SignUp />} />
            <Route path="/jobs" element={<Jobs />} />
            
            <Route path="/contact" element={<Contact />} />
            <Route path="/feedback" element={<Feedback />} />
            <Route path="/about" element={<About />} />
            <Route path="/edit-jobs" element={<EditJob />} /> 
          <Route path="/post-job" element={<PostJob />} />
          </Routes>
        </div>

        <Footer />
      </div>
    </Router>
  );
}

export default App;
