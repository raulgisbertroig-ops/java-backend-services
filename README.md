# DevSquad Talent Management System

Backend service component developed in Java for managing software development talent structures, utilizing persistence architecture and clean design patterns.

## 🚀 Project Overview
This repository contains a structured Java component designed to handle CRUD (Create, Read, Update, Delete) operations for developer management. The architecture is cleanly divided into decoupled layers to ensure scalability and maintainability.

The application features a responsive Command Line Interface (CLI) for executing administrative operations while maintaining solid backend separation.

## 🏗️ Architecture & Design Patterns
The project strictly implements a **layered architecture** to separate business logic from data access components:

*   **`app` (Controller/Runner Layer):** Houses the main execution entry points (`Main.java`) and the interactive `MenuHandler` logic to parse user commands securely.
*   **`modelo` (Domain Layer):** Encapsulates core business entities (e.g., `Desarrollador`) mapping the system data models.
*   **`persistencia` (Data Access Layer):** Implements the **DAO (Data Access Object)** pattern alongside **JPA (Java Persistence API)** to manage clean object-relational mapping and database transactions without raw SQL injection overhead.

## 🛠️ Tech Stack
*   **Core Language:** Java
*   **Persistence Standards:** JPA (Java Persistence API) / Hibernate
*   **Configuration:** Structured XML Metadata Management (`persistence.xml`)
*   **IDE Context:** Configured environment ready for Visual Studio Code / IntelliJ IDEA
