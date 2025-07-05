
# 📦 Sanchara - Courier Management System (Backend) 🚚

A backend system for managing courier operations, built using **ASP.NET Core**, **C#**, and **Entity Framework Core**.  
It supports user authentication, courier booking, delivery tracking, and role-based management for admins, delivery agents, and customers.

---


## ✅ Purpose

This application powers the backend of a courier service platform:

- Secure user registration and login using JWT  
- Role-based access (Admin, Customer, Agent)  
- Booking and tracking of courier deliveries  
- Administrative control over couriers and users  
- RESTful API endpoints for easy integration

---

## 📁 Project Structure

```
CourierEase_Backend/
├── CourierEase.API/                  # Main Web API Project
│   ├── Controllers/                  # API Controllers
│   ├── Models/                       # Data Models / Entities
│   ├── DTOs/                         # Data Transfer Objects
│   ├── Services/                     # Business Logic Services
│   ├── Interfaces/                   # Service Interfaces
│   ├── Data/                         # EF DbContext and Migrations
│   ├── Middleware/                   # Custom Middlewares (e.g., JWT)
│   ├── appsettings.json              # Config (DB, JWT, etc.)
│   └── Program.cs / Startup.cs       # App startup configuration
├── CourierEase.sln                   # Visual Studio Solution File
```

---

## 🧱 Architecture & Technologies

| Layer              | Technology                         |
|--------------------|-------------------------------------|
| Language           | C#                                  |
| Framework          | ASP.NET Core Web API                |
| ORM & DB Access    | Entity Framework Core               |
| Authentication     | JWT Bearer Tokens                   |
| Authorization      | Role-Based                          |
| Database           | SQL Server                          |
| Documentation      | Swagger (optional)                  |

---

## ⚙️ Configuration

Update `appsettings.json`:

```json
{
  "ConnectionStrings": {
    "DefaultConnection": "Server=localhost;Database=CourierEaseDB;Trusted_Connection=True;"
  },
  "Jwt": {
    "Key": "your_jwt_secret_key",
    "Issuer": "CourierEaseAPI",
    "Audience": "CourierEaseClient",
    "DurationInMinutes": 60
  }
}
```

---

## 🚀 How to Run

1. Open the solution in Visual Studio or VS Code.

2. Restore dependencies:

   ```bash
   dotnet restore
   ```

3. Apply migrations:

   ```bash
   dotnet ef database update
   ```

4. Run the API:

   ```bash
   dotnet run --project CourierEase.API
   ```

API will be accessible at: `http://localhost:5000`

---

## 🔐 Authentication

- `POST /api/auth/register` – Register new user  
- `POST /api/auth/login` – Authenticate and get JWT  

Use the token in headers:

```
Authorization: Bearer <your_token>
```

---

## 📘 API Endpoints

### 🔑 Auth
| Method | Endpoint            | Description           |
|--------|---------------------|-----------------------|
| POST   | `/api/auth/register`| Register user         |
| POST   | `/api/auth/login`   | Login with credentials|

### 👤 Users
| Method | Endpoint               | Description                |
|--------|------------------------|----------------------------|
| GET    | `/api/user/shipments`  | List user shipments        |
| POST   | `/api/user/shipments`  | Book a new shipment        |

### 🚚 Couriers
| Method | Endpoint                | Description               |
|--------|-------------------------|---------------------------|
| GET    | `/api/admin/shipments`  | All shipment records      |
| PUT    | `/api/agent/update`     | Agent updates delivery    |

### 🧑 Admin
| Method | Endpoint                | Description               |
|--------|-------------------------|---------------------------|
| GET    | `/api/admin/users`      | Manage platform users     |
| POST   | `/api/admin/couriers`   | Add courier personnel     |

---

## 🗄️ Database Tables Overview

### `Users`
| Column     | Type     |
|------------|----------|
| Id         | int      |
| Name       | string   |
| Email      | string   |
| Password   | string   |
| Role       | string   |

### `Shipments`
| Column       | Type       |
|--------------|------------|
| Id           | int        |
| SenderId     | int (FK)   |
| ReceiverName | string     |
| Address      | string     |
| Status       | string     |
| CourierId    | int (FK)   |

---


