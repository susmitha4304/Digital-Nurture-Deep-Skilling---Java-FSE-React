# Spring Learn - JWT Authentication Service

## Project Overview

This project implements a JWT Authentication Service using Spring Boot. The service accepts user credentials through Basic Authentication, validates the request, generates a JSON Web Token (JWT), and returns the token as a JSON response.

## Technologies Used

* Java
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Maven
* IntelliJ IDEA

## Project Structure

```text
spring-learn
├── src
│   └── main
│       ├── java
│       │   └── spring_learn
│       │       ├── SpringLearnApplication.java
│       │       ├── controller
│       │       │   └── AuthenticationController.java
│       │       └── security
│       │           └── SecurityConfig.java
│       │
│       └── resources
│           └── application.properties
│
├── pom.xml
└── README.md
```

## Features

* Provides REST authentication endpoint.
* Accepts username and password using Basic Authentication.
* Reads and decodes Authorization header.
* Generates JWT token.
* Returns JWT token in JSON format.
* Allows `/authenticate` endpoint without authentication.

## API Endpoint

### Generate JWT Token

### Request

```http
GET http://localhost:8090/authenticate
```

### Using CURL

```bash
curl -s -u user:pwd http://localhost:8090/authenticate
```

### Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

## Authentication Flow

1. Client sends username and password using Basic Authentication.
2. Authentication Controller receives the request.
3. Authorization header is read from the HTTP request.
4. Username and password are decoded from Base64 format.
5. JWT token is generated using the username.
6. Token is returned as a JSON response.

## JWT Token Structure

A JWT token contains three parts:

```
Header.Payload.Signature
```

Example:

```
xxxxx.yyyyy.zzzzz
```

The payload contains information such as:

```json
{
  "sub": "user",
  "iat": "issued time",
  "exp": "expiration time"
}
```

## Configuration

The application runs on port:

```properties
server.port=8090
```

## Running the Application

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Reload Maven dependencies.
4. Run `SpringLearnApplication`.
5. Test the API using Postman or CURL.

## Testing Using Postman

1. Create a GET request:

```
http://localhost:8090/authenticate
```

2. Go to Authorization tab.
3. Select:

```
Basic Auth
```

4. Enter:

```
Username: user
Password: pwd
```

5. Click Send.

The JWT token will be displayed in the response.

## Author

Developed as part of the Spring Learn JWT Authentication Service assignment.
