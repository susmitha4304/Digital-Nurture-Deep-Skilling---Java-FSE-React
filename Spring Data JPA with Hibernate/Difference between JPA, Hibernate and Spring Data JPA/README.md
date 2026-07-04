# Difference between JPA, Hibernate and Spring Data JPA

---

##  Java Persistence API (JPA)

- JPA (Java Persistence API) is a Java specification (JSR 338) for ORM.
- It defines rules for mapping Java objects to database tables.
- It does NOT provide implementation.
- It is only a blueprint/standard.
- JPA is used for object-relational mapping in Java applications.

---

##  Hibernate

- Hibernate is an ORM framework.
- It is one of the implementations of JPA.
- It provides actual functionality for database operations.
- It handles:
  - Database connection
  - SQL generation
  - Transactions
  - Object mapping between Java and DB tables

##  Spring Data JPA

- Spring Data JPA is built on top of JPA and Hibernate.
- It reduces boilerplate code.
- It provides ready-made methods like:
   - save()
   - findAll()
   - deleteById()
- It automatically manages transactions.



## Comparison Table
| Feature          | JPA           | Hibernate     | Spring Data JPA     |
| ---------------- | ------------- | ------------- | ------------------- |
| Type             | Specification | ORM Framework | Abstraction Layer   |
| Implementation   | No            | Yes           | No (uses Hibernate) |
| Boilerplate Code | High          | Medium        | Low                 |
| Transactions     | Manual        | Manual/Auto   | Automatic           |
| Ease of Use      | Medium        | Medium        | Easy                |
