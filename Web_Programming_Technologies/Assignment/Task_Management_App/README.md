# 📝 Task Management App

A full-stack task management system built with **React (frontend)**, **Express (backend)**, and **MySQL (database)**. Users can create, view, and manage tasks marked as "Pending" or "Completed".

---

## 📁 Project Structure

```
Task-Management/
├── backend/
│   ├── index.js                  # Entry point for Express server
│   ├── package.json              # Backend dependencies
│   ├── package-lock.json
│   ├── routes/
│   │   └── taskRoutes.js         # Task API routes
│   └── src/
│       └── config/
│           └── config.js         # MySQL database configuration
│
└── frontend/
    └── task-management/
        ├── index.html
        ├── package.json          # Frontend dependencies
        ├── package-lock.json
        ├── vite.config.js        # Vite config for React app
        ├── eslint.config.js
        ├── public/
        │   └── vite.svg
        └── src/
            ├── App.jsx
            ├── main.jsx
            ├── index.css
            ├── App.css
            ├── components/
            │   └── AddNewTask.jsx
            └── assets/
                ├── react.svg
                └── Iamges/
                    ├── img1.jpg
                    ├── img2.jpg
                    └── img3.jpg
```

---

## 📦 Dependencies

### Backend (Express)

- **express** ^5.1.0
- **cors** ^2.8.5
- **http-status-codes** ^2.3.0
- **mysql2** ^3.14.1

### Frontend (React + Vite)

- **react** ^19.1.0
- **react-dom** ^19.1.0
- **react-router-dom** ^6.30.0
- **react-bootstrap** ^2.10.9
- **bootstrap** ^5.3.6
- **axios** ^1.9.0
- **react-toastify** ^11.0.5
- **react-router-bootstrap** ^0.26.3

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Task-Management.git
cd Task-Management
```

---

### 2. Backend Setup

```bash
cd backend
npm install
node index.js
```

- Make sure MySQL is installed and running.
- Update `src/config/config.js` with your MySQL credentials.

---

### 3. Frontend Setup

```bash
cd frontend/task-management
npm install
npm run dev
```

- The frontend will run on `http://localhost:5173`

---

## ✅ Features

- Add new tasks
- View all tasks
- Mark tasks as completed
- See lists of pending and completed tasks
- Toast notifications for actions
- Clean and responsive UI using Bootstrap

---

## ⚙️ Environment Setup Notes

- MySQL must be running.
- Database configuration is located in:
  ```
  backend/src/config/config.js
  ```

---

## 🧾 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙌 Author

Developed by [Your Name] – feel free to contribute or fork!
