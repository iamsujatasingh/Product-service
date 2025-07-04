# 🛍️ Product-Service

A Spring Boot microservice for managing product data using RESTful APIs. This service provides full CRUD operations with DTO abstraction, input validation, exception handling, and clean architecture.

---

## 📌 Features

- Create, Read, Update, and Delete products
- DTO-based request/response handling
- Input validation using Spring’s `@Valid`
- Global exception handling
- Modular structure for easy extension

---

## 🧰 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 / PostgreSQL (configurable)
- Gradle
- JUnit & Mockito (for tests)

---

## 🗂️ Project Structure

src
├── controller # REST Controllers
├── dto # Request and Response DTOs
├── entity # JPA Entity
├── exception # Custom Exceptions and Global Handler
├── repository # Spring Data Repository
├── service # Business Logic
└── ProductServiceApplication.java


---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/iamsujatasingh/Product-service.git
cd Product-service
2. Build & Run
./gradlew build
./gradlew bootRun
3. Access the API
Base URL: http://localhost:8080/products

🧪 Sample API Endpoints

Method	Endpoint	Description
POST	/products	Create new product
GET	/products	Get all products
GET	/products/{id}	Get product by ID
PUT	/products/{id}	Update product
DELETE	/products/{id}	Delete product
✅ Sample Request Body (POST / PUT)
{
  "name": "Shampoo",
  "description": "Gentle cleansing shampoo",
  "price": 12.99
}
⚠️ Error Handling

All errors return JSON responses with appropriate HTTP status codes:

400 Bad Request – validation errors
404 Not Found – product not found
500 Internal Server Error – unhandled exceptions
🧪 Testing

To run tests:

./gradlew test
Tests (to be added):

Unit tests for service logic
Controller tests using MockMvc
🔮 Future Enhancements

Swagger/OpenAPI documentation
JWT-based authentication
Docker + Docker Compose support
MapStruct for DTO mapping
Pagination and sorting on list endpoint
👤 Author

Sujata Singh
🔗 GitHub
