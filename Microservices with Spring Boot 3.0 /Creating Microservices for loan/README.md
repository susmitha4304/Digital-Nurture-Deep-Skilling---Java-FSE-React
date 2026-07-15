# Loan Microservice

This project implements a Loan Microservice using Spring Boot.

The Loan Microservice provides a REST API to fetch loan account details based on loan account number.

This is a simple standalone microservice without database connectivity. The response data is dummy data created inside the application.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- IntelliJ IDEA

## Project Structure

```
loan
│
├── src
│   └── main
│       ├── java
│       │   └── loan
│       │       ├── LoanApplication.java
│       │       ├── controller
│       │       │   └── LoanController.java
│       │       └── model
│       │           └── Loan.java
│       │
│       └── resources
│           └── application.properties
│
└── pom.xml
```

## Example Request

```
http://localhost:8081/loans/H00987987972342
```

## Example Response

```json
{
    "number": "H00987987972342",
    "type": "car",
    "loan": 400000,
    "emi": 3258,
    "tenure": 18
}
```
