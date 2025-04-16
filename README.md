# Spring Boot Authentication and Authorization

A secure Spring Boot application implementing JWT-based authentication and role-based authorization.

## Features

- JWT (JSON Web Token) based authentication
- Role-based authorization (USER and ADMIN roles)
- Secure password storage using BCrypt
- PostgreSQL database integration
- RESTful API endpoints
- Spring Security configuration

## Tech Stack

- Java 17
- Spring Boot 3.4.4
- Spring Security
- JWT (JSON Web Tokens)
- PostgreSQL
- Maven
- Lombok

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/authenticate` - Login and get JWT token

### Protected Endpoints
- `GET /api/demo/user` - Accessible by both USER and ADMIN roles
- `GET /api/demo/admin` - Accessible only by ADMIN role

## Database Configuration

The application uses PostgreSQL with the following configuration:
- Database: defaultdb
- Host: pg-auth-pg-admin-db.k.aivencloud.com
- Port: 19649
- SSL Mode: Require

## Security Features

- Password encryption using BCrypt
- JWT token-based authentication
- Role-based access control
- Secure session management
- CSRF protection
- CORS configuration

## Getting Started

1. Clone the repository
```bash
git clone https://github.com/yourusername/authentication_and_authorization_Spring_Boot.git
```

2. Configure the database
- Update the database credentials in `src/main/resources/application.properties`

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

## API Usage

### Register a User
```bash
curl -X POST http://localhost:23557/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{"username":"user","password":"password","role":"USER"}'
```

### Login
```bash
curl -X POST http://localhost:23557/api/auth/authenticate \
  -H "Content-Type: application/json" \
  -d '{"username":"user","password":"password"}'
```

### Access Protected Endpoints
```bash
curl -X GET http://localhost:23557/api/demo/user \
  -H "Authorization: Bearer YOUR_JWT_TOKEN"
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/authentication_and_authorization_Spring_Boot/
│   │       ├── config/         # Security and JWT configuration
│   │       ├── controller/     # REST controllers
│   │       ├── dto/           # Data Transfer Objects
│   │       ├── entity/        # JPA entities
│   │       ├── repository/    # JPA repositories
│   │       └── service/       # Business logic
│   └── resources/
│       └── application.properties
└── test/                      # Test classes
```
