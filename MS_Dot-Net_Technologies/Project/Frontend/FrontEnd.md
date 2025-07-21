
# 📦 Courier Management System – Frontend

Welcome to the frontend of the **Courier Management System**, developed using **React**, **React Router**, and **Axios**. This platform allows users to place courier orders, view their dashboard, and let admins manage couriers, users, and feedback.

---

## 🚀 Features

### ✅ Authentication
- Login and signup pages
- JWT-based authentication stored in `localStorage`
- Protected routes for both user and admin dashboards

### 📦 Courier Order Management
- Users can create courier delivery orders
- View order history in the dashboard
- Admins can view, update, and manage all orders

### 👥 Admin Tools
- View list of users and orders
- Manage system-wide courier activities

### 📋 Contact & Feedback
- Forms available for user queries and feedback

---

## 🗂️ Folder Structure

```
/src
├── components/
│   ├── About.jsx                   # About the courier service
│   ├── ContactUs.jsx               # Contact form
│   ├── Feedback.jsx                # Feedback form
│   ├── Home.jsx                    # Homepage
│   ├── Admin/
│   │   ├── AdminDashboard.jsx      # Admin panel
│   │   ├── OrdersList.jsx          # List of all courier orders
│   │   └── UsersList.jsx           # List of registered users
│   ├── Auth/
│   │   ├── Login.jsx               # Sign in page
│   │   └── Signup.jsx              # Register page
│   ├── Layout/
│   │   ├── Footer.jsx              # Page footer
│   │   └── Navbar.jsx              # Top navigation
│   └── User/
│       └── UserDashboard.jsx       # Dashboard for users
├── pages/
│   └── AddOrder.jsx                # Form to place a new order
├── services/
│   └── api.js                      # Axios API service layer
├── App.jsx                         # Main application component
├── main.jsx                        # Entry point
├── index.css                       # Global styles
└── App.css                         # Component-level styles
```

---

## 🔗 Routes

| Path              | Component          | Access         |
|-------------------|--------------------|----------------|
| `/`               | Home               | Public         |
| `/about`          | About              | Public         |
| `/contact`        | ContactUs          | Public         |
| `/feedback`       | Feedback           | Public         |
| `/login`          | Login              | Public         |
| `/signup`         | Signup             | Public         |
| `/user/dashboard` | UserDashboard      | Authenticated  |
| `/admin`          | AdminDashboard     | Admin Only     |
| `/admin/orders`   | OrdersList         | Admin Only     |
| `/admin/users`    | UsersList          | Admin Only     |
| `/add-order`      | AddOrder           | Authenticated  |

---

## 🔐 Authentication Logic

- JWT stored in `localStorage` after login
- Authenticated requests send JWT token in `Authorization` headers
- Protected routes implemented for users and admins

---

## 🛠️ Technologies Used

| Purpose          | Library             |
|------------------|---------------------|
| Frontend         | React               |
| Routing          | React Router DOM    |
| HTTP Requests    | Axios               |
| Styling          | CSS                 |
| Notifications    | React Toastify      |
| State Management | Local Storage + Hooks|

---

## ⚙️ Setup Instructions

### Prerequisites
- Node.js and npm installed

### Installation

```bash
npm install
```

### Development Server

```bash
npm run dev
```


---

