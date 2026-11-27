# 🏦 Loan Management System

A **Microservices-Based Loan Management System** developed using Java and Spring Boot. This project focuses on building scalable and maintainable backend services using microservices architecture and modern Spring Cloud technologies.

---

## 📌 Project Overview

The Loan Management System is designed to manage loan-related operations through independent microservices.

The application follows a distributed architecture where individual services communicate with each other and are managed through centralized service discovery and API routing.

The project demonstrates the practical implementation of microservices concepts, service communication, API management, and distributed system design.

---

## 🚀 Key Features

- **Microservices Architecture** – Independent and modular service design.
- **Service Discovery** – Netflix Eureka Server for service registration and discovery.
- **API Gateway** – Centralized API routing using Spring Cloud Gateway.
- **User Management** – Dedicated User Service for user-related operations.
- **Inter-Service Communication** – OpenFeign for synchronous service communication.
- **Event-Driven Communication** – Apache Kafka for asynchronous messaging.
- **Database Integration** – MySQL database connectivity.
- **Fault Tolerance** – Resilience mechanisms for handling service failures.
- **Load Balancing** – Distribution of requests across available service instances.

---

## 🛠️ Technologies Used

| Category | Technologies |
|---|---|
| Programming Language | Java |
| Backend Framework | Spring Boot |
| Architecture | Microservices |
| Service Discovery | Netflix Eureka |
| API Gateway | Spring Cloud Gateway |
| Inter-Service Communication | OpenFeign |
| Messaging System | Apache Kafka |
| ORM | Spring Data JPA, Hibernate |
| Database | MySQL |
| Build Tool | Apache Maven |
| API Testing | Postman, Swagger |
| Monitoring | Spring Boot Actuator |
| Logging | SLF4J, Log4j |
| Version Control | Git, GitHub |

---

## 🏗️ Project Architecture

The application follows a microservices-based architecture.

```text
                  Client / Postman
                         |
                         |
                  API Gateway
                         |
             -----------------------
             |                     |
             |                     |
        Eureka Server         User Service
             |                     |
             |                     |
       Service Registry       MySQL Database
```

### Main Components

**1. Eureka Server**
- Provides service registration and discovery.
- Maintains the registry of available microservices.
- Helps services discover one another dynamically.

**2. API Gateway**
- Acts as a single entry point for client requests.
- Routes incoming requests to the appropriate microservices.
- Simplifies communication between clients and backend services.

**3. User Service**
- Handles user-related business operations.
- Exposes REST APIs.
- Integrates with the MySQL database.

---

## 📂 Project Structure

```text
Loan-Management-System/
│
├── APIGateway/
│   ├── src/
│   └── pom.xml
│
├── EurekaServer/
│   ├── src/
│   └── pom.xml
│
├── UserService/
│   ├── src/
│   └── pom.xml
│
├── .gitignore
│
└── README.md
```

---

## ⚙️ Prerequisites

Make sure the following tools are installed:

- Java JDK 8 or compatible project-supported JDK
- Apache Maven
- MySQL Server
- Spring Tool Suite (STS) / Eclipse / IntelliJ IDEA
- Postman
- Git

---

## 🔧 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/YogeshwarKadam4393/Loan-Management-System.git
```

### 2. Navigate to the Project

```bash
cd Loan-Management-System
```

### 3. Configure Database

- Start your MySQL Server.
- Create the required database.
- Update the database URL, username, and password in the User Service configuration.
- Keep database credentials outside the public repository.

### 4. Build the Microservices

Navigate to each service directory and execute:

```bash
mvn clean install
```

### 5. Run the Services

Start the services in the following order:

1. Eureka Server
2. User Service
3. API Gateway

Configure the service ports and Eureka server URL according to the application properties.

---

## 🧪 API Testing

Use **Postman** or **Swagger UI** to test the REST APIs.

The API Gateway acts as the centralized entry point for accessing the microservices.

---

## 🎯 Learning Outcomes

Through this project, I am gaining practical experience in:

- Designing microservices-based applications.
- Implementing service registration and discovery.
- Configuring API Gateway routing.
- Developing RESTful APIs using Spring Boot.
- Implementing synchronous and asynchronous communication.
- Integrating Spring Boot applications with MySQL.
- Understanding fault tolerance and load balancing.
- Managing source code using Git and GitHub.

---

## 👨‍💻 Author

**Yogeshwar Kadam**

Java Developer | Spring Boot | Microservices

- GitHub: [YogeshwarKadam4393](https://github.com/YogeshwarKadam4393)
- LinkedIn: [Yogeshwar Kadam](https://linkedin.com/in/yogeshwar-kadam-94b649258)

---

⭐ If you find this project interesting, feel free to explore the repository and give it a star!
