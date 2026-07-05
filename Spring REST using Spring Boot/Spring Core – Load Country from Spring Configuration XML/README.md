# Spring Boot + Spring Core XML Project

This project demonstrates:

### 1. Spring Boot Application
- Created using Spring Initializr
- Uses embedded Tomcat server
- Logging using SLF4J
- Configuration using application.properties

### 2. Spring Core XML Example
- Bean configuration using XML (country.xml)
- Dependency Injection using setter methods
- Reading bean using ApplicationContext

---

##  Technologies Used

- Java 17+
- Spring Boot 3.5.16
- Spring Core
- Maven
- IntelliJ IDEA

---

##  Project Structure
src/main/java/spring_learn
├── SpringLearnApplication.java
└── Country.java

src/main/resources
├── application.properties
└── country.xml

## output
Application Started

Country Constructor Called

Inside setCode()

Inside setName()

Country : Country{code='IN', name='India'}

Application Started Successfully
