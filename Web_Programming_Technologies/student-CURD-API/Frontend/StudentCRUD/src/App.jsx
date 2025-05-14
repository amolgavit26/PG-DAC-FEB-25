
import { BrowserRouter, Route, Routes } from "react-router-dom"
import { NavigationBar } from "./components/NavigationBar"
import { DashBoard } from "./components/DashBoard"
import { StudentList } from "./components/StudentList"
import { StudentRegistrationForm } from "./components/StudentRegistrationForm"
import { ToastContainer } from "react-toastify"

function App() {

  return (
    <BrowserRouter>
      <NavigationBar />
      <Routes>
        <Route path="/" element={<DashBoard />} />
        <Route path="/register-student" element={<StudentRegistrationForm />} />
        <Route path="/student-list" element={<StudentList />} />
      </Routes>
      <ToastContainer></ToastContainer>
    </BrowserRouter>

  )
}

export default App
