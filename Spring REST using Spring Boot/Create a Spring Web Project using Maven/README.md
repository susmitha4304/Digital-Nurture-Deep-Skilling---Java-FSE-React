# Spring Learn - Spring Boot Web Application

## Overview

This project demonstrates the creation of a Spring Boot Web Application using Maven and Spring Initializr. It includes logging configuration, embedded Tomcat, and basic Spring Boot project structure.

## Objectives

* Create a Spring Boot application using Spring Initializr.
* Understand the purpose of `@SpringBootApplication`.
* Run the application using `SpringApplication.run()`.
* Configure application properties.
* Implement logging using SLF4J.
* Understand the Maven project structure.
* Explore project dependencies.

## Technologies Used

* Java 25
* Spring Boot 3.5.16
* Maven
* IntelliJ IDEA
* Spring Web
* Spring Boot DevTools

## Project Structure

```text
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── spring_learn
│   │   │       └── SpringLearnApplication.java
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│       └── java
│           └── spring_learn
│               └── SpringLearnApplicationTests.java
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Features

* Spring Boot application setup
* Embedded Apache Tomcat server
* Logging using SLF4J
* Configurable server port
* Maven-based project management

## Expected Output

When the application starts successfully, the console displays:

* Application Started
* Spring Boot startup banner
* Tomcat started on port 8083
* Started SpringLearnApplication
* Application Started Successfully

## Dependencies

* Spring Boot Starter Web
* Spring Boot DevTools
* Spring Boot Starter Test

