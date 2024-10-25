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
Dependency Injection is the main functionality provided by Spring IOC(Inversion of Control). The Spring-Core module is responsible for injecting dependencies through either Constructor or Setter methods. The design principle of Inversion of Control emphasizes keeping the Java classes independent of each other and the container frees them from object creation and maintenance. These classes, managed by Spring, must adhere to the standard definition of Java-Bean. Dependency Injection in Spring also ensures loose coupling between the classes. There are two types of Spring Dependency Injection.

1 - Setter Dependency Injection (SDI)

2 - Constructor Dependency Injection (CDI)

### Inversion of Control (IoC)

Inversion of Control (IoC) is a design principle used in software development that reverses the flow of control in a program. 
In Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application. It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class. These objects are called Beans. Since the Controlling of Java objects and their lifecycle is not done by the developers, hence the name Inversion Of Control. The followings are some of the main features of Spring IoC,

* Creating Object for us,

* Managing our objects,

* Helping our application to be configurable,

* Managing dependencies, 

### Spring Beans
Here’s a definition of beans in the Spring Framework documentation:

In Spring, the objects that form the backbone of my application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.


### Bean Scopes
A Spring Bean Scope defines the lifecycle and visibility of a bean in a Spring container. When a bean is defined, it acts as a recipe for creating instances of a class, and you can control how many instances are created and how they behave. Spring provides six different scopes, four of which are specific to web-aware applications. You can also create custom scopes to manage how beans are instantiated and utilized. Scopes allow developers to configure the lifespan and accessibility of beans, without embedding this logic at the Java class level.

![image](https://github.com/user-attachments/assets/b8fbbb56-01f2-4e37-9e52-c426c85e377c)


### ApplicationContext

ApplicationContext is a central interface in the Spring Framework that provides configuration information to the application. It extends the BeanFactory interface, adding more advanced featuresuch as:

* Bean lifecycle management and dependency injection.
* Support for enterprise services like transactions, AOP (Aspect-Oriented Programming), and event propagation.
* Internationalization (i18n) support for message resources.
* Access to various kinds of resources, such as URLs or files.
* Integration with web applications through specialized contexts (like WebApplicationContext).

  There are several types of configuration in Spring:

* XML Configuration: Beans are defined in an external XML file, such as applicationContext.xml.
* Annotation-based Configuration: Uses annotations like @Component, @Autowired, and @Service directly in the Java code to manage beans and dependencies.
* Java-based Configuration: Beans are configured using Java classes annotated with @Configuration and @Bean, offering more flexibility.
* Mixed Configuration: Combines XML, annotations, and Java-based approaches as needed in a single application.



### Component Scanning and Stereotype Annotations

### Spring Data JPA

### Spring MVC

### Installation and Setup
