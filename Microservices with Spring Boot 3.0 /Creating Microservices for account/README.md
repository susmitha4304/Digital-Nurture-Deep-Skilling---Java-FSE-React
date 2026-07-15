# Account Microservice


This project implements an Account Microservice using Spring Boot.

The Account Microservice provides a REST API to fetch account details based on account number.

This is a simple standalone microservice without database connectivity. The response data is dummy data created inside the application.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- IntelliJ IDEA

## Project Structure

```
account
│
├── src
│   └── main
│       ├── java
│       │   └── account
│       │       ├── AccountApplication.java
│       │       ├── controller
│       │       │   └── AccountController.java
│       │       └── model
│       │           └── Account.java
│       │
│       └── resources
│           └── application.properties
│
└── pom.xml
``

## Example Request

```
http://localhost:8080/accounts/00987987973432
```

## Example Response

```json
{
    "number": "00987987973432",
    "type": "savings",
    "balance": 234343
}
```

