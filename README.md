# Spring Security Lab - Minimal Example

This project is a minimal Spring Boot web application demonstrating:
- Integration of Spring Security
- Form-based login and HTTP Basic authentication
- Roles and URL protection (USER vs ADMIN)
- Simple Thymeleaf views for login, home and admin pages

## Users (in-memory)
- user / password  -> ROLE_USER
- admin / adminpass -> ROLE_ADMIN, ROLE_USER

## Run
Requirements: Java 17+, Maven

From project root:
```bash
mvn spring-boot:run
```

Open http://localhost:8080 in the browser.  
- Visit `/login` for the form login.
- Visit `/admin` — requires ADMIN.

## Deliverables
- This zipped project contains source code that matches the lab objectives:
  - Spring Security setup
  - Form-based login + HTTP Basic
  - Security config and users in memory
  - README with run instructions
