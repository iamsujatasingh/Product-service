# 🛍️ Product-Service

A secure Spring Boot microservice for product management. Supports JWT authentication and uses PostgreSQL for persistence.

---

## Features

- JWT-based authentication and authorization
- CRUD APIs for product management
- Input validation and global exception handling
- PostgreSQL as the database
- Clean layered architecture with DTOs

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Security (JWT)
- PostgreSQL
- Spring Data JPA
- Gradle

---

## Getting Started

### Prerequisites

- Java 17+
- PostgreSQL running locally or remotely
- Gradle installed

### Configuration

Update `src/main/resources/application.yml` with your PostgreSQL credentials:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/productdb
    username: yourusername
    password: yourpassword
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
Run the Application
./gradlew bootRun
API Endpoints

Method	Endpoint	Description	Auth Required
POST	/api/auth/login	Login and get JWT token	No
POST	/api/products	Create new product	Yes
GET	/api/products	Get all products	Yes
GET	/api/products/{id}	Get product by ID	Yes
PUT	/api/products/{id}	Update product	Yes
DELETE	/api/products/{id}	Delete product	Yes
Authentication

Login endpoint returns JWT token
Pass JWT token in Authorization: Bearer <token> header for all secured endpoints
Testing

Unit and integration tests coming soon.
Future Improvements

Add user registration & roles
Add Swagger/OpenAPI docs
Add Docker support for app and PostgreSQL
Add token refresh mechanism
License

MIT License


👤 Author

Sujata Singh
🔗 GitHub
