# Spring Learn – REST Country Web Service


This project is a Spring Boot REST application that returns the details of the country **India** by loading a Spring bean from an XML configuration file.

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Maven
* IntelliJ IDEA

## Project Structure

```
spring-learn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── spring_learn
│   │   │       ├── SpringLearnApplication.java
│   │   │       ├── Country.java
│   │   │       └── CountryController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── country.xml
├── pom.xml
└── README.md
```

## REST Endpoint

**Request**

```
GET http://localhost:8083/country
```

**Response**

```json
{
  "code": "IN",
  "name": "India"
}
```

## How It Works

1. The client sends a GET request to `/country`.
2. `CountryController` handles the request.
3. The controller loads the `country.xml` configuration.
4. The `Country` bean is retrieved from the Spring context.
5. Spring Boot automatically converts the `Country` object into JSON using Jackson.
6. The JSON response is returned to the client.

## Configuration

`application.properties`

```properties
server.port=8083
```
