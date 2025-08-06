# 🛒 ShopSpringBackend

A complete e-commerce backend project built with **Spring Boot 3.3.1** and **Java 22**. This API provides authentication, product management, orders, categories, shopping cart, addresses, and payment functionalities.

---

## 🚀 Technologies Used

- Java 22  
- Spring Boot 3.3.1  
- Spring Data JPA  
- Spring Security + JWT  
- Maven  
- H2 Database (or configurable alternative)  
- File upload support  
- DTO architecture and service layer  

---

## 📂 Implemented Features

- ✅ User registration and login  
- ✅ Authentication with JWT  
- ✅ Product and category CRUD operations  
- ✅ Shopping cart management  
- ✅ Order creation and listing  
- ✅ Address registration  
- ✅ File upload (e.g., product images)  
- ✅ Role-based access control  
- ✅ Global exception handling  

---

## 📬 Main Endpoints

| Method | Endpoint           | Description                    |
|--------|--------------------|--------------------------------|
| POST   | `/api/auth/signin` | User login                     |
| POST   | `/api/auth/signup` | User registration              |
| GET    | `/api/products`    | List all products              |
| POST   | `/api/products`    | Create a new product (admin)   |
| GET    | `/api/cart`        | View shopping cart             |
| POST   | `/api/cart`        | Add item to cart               |
| POST   | `/api/orders`      | Create an order                |
| GET    | `/api/orders`      | View user's orders             |

> More endpoints are defined within the controller classes.


🔐 Authentication

    Login: POST /api/auth/signin

    Signup: POST /api/auth/signup

    After login, use the returned token in the Authorization header:
    Authorization: Bearer <your_token_here>
