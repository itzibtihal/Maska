## SPRING FRAMEWORK

This application is a basic User Management System
built using Spring Core without Spring Boot,
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure


- **src/main/java/org.youcode/**
    - **config/**
        - `WebConfig.java`: Configuration for web application settings.
    - **controller/**
        - `MembreController.java`: REST controller for managing `Membre` entities.
    - **domain/**
        - `Membre.java`: Entity representing a `Membre` in the system.
    - **exception/**
        - `GlobalExceptionHandler.java`: Handles exceptions globally across the application.
        - `MembreNotFoundException.java`: Exception thrown when a `Membre` is not found.
        - `MembreValidationException.java`: Exception thrown for validation errors on `Membre` entities.
    - **repository/**
        - `MembreRepository.java`: Interface for performing CRUD operations on `Membre` entities.
    - **services/**
        - `MembreService.java`: Service interface defining business logic for `Membre`.
        - `MembreServiceImp.java`: Implementation of `MembreService` that contains the business logic for `Membre`.
    - **Main.java**: The entry point of the application.

- **src/main/resources/**
    - `applicationContext.xml`: Spring application context configuration.

- **src/main/webapp/WEB-INF/**
    - **views/**: Contains JSP view files.
    - `dispatcher-servlet.xml`: Spring MVC configuration for the `DispatcherServlet`.
    - `web.xml`: The web deployment descriptor .

- **postgresql.yml**: PostgreSQL database configuration file.


### Dependency Injection (DI)


### Inversion of Control (IoC)

### Spring Beans

### Bean Scopes

### ApplicationContext

### Component Scanning and Stereotype Annotations

### Spring Data JPA

### Spring MVC

### Installation and Setup