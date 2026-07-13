# Spring Learn – REST Country Web Service

This project is a Spring Boot REST application developed as part of the **Spring Learn** assignment. It provides REST APIs to retrieve country details using Spring Boot, XML-based bean configuration, and a service layer.

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Maven
* IntelliJ IDEA
* REST API

## Project Structure

```text
spring-learn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── spring_learn
│   │   │       ├── SpringLearnApplication.java
│   │   │       ├── Country.java
│   │   │       ├── CountryController.java
│   │   │       └── service
│   │   │           └── CountryService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── country.xml
├── pom.xml
└── README.md
```

## Features

* Returns country details as JSON.
* Retrieves country information using a country code.
* Supports case-insensitive country code matching.
* Uses XML-based Spring bean configuration.
* Implements REST APIs using Spring Boot.

## REST Endpoints

### 1. Get India Country Details

**Request**

```http
GET http://localhost:8083/country
```

**Response**

```json
{
  "code": "IN",
  "name": "India"
}
```

### 2. Get Country by Country Code

**Request**

```http
GET http://localhost:8083/countries/{code}
```

**Example**

```http
GET http://localhost:8083/countries/in
```

**Response**

```json
{
  "code": "IN",
  "name": "India"
}
```


**application.properties**

```properties
server.port=8083
```
