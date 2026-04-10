# 📚 Library Management System (Gestion d’une Librairie)

## 🎯 Project Overview
This Java application is designed to automate the management of a library's inventory. It provides a structured way to handle books, members, and borrowing transactions, focusing on clean **Object-Oriented** architecture.

## 🚀 Engineering Features
* **Inheritance & Polymorphism:** Used a modular class structure to manage different types of library resources.
* **Collections Framework:** Implemented `ArrayList` and `HashMap` for efficient data storage and retrieval of book records.
* **Data Persistence:** Integrated File I/O logic to ensure library data is saved and persists after the application is closed.
* **Robust Error Handling:** Used `try-catch` blocks to handle invalid user inputs and prevent system crashes during runtime.

## 🛠 Technical Stack
* **Language:** Java (JDK 11/17)
* **Paradigm:** Object-Oriented Programming (OOP)
* **Storage:** Text-based data persistence (File I/O)

## 📂 Key Components
* **Book Management:** CRUD operations (Create, Read, Update, Delete) for the book catalog.
* **Member Tracking:** Logic for registering library members and tracking their borrowing status.
* **Transaction Logic:** Automated validation for checking book availability and return deadlines.

## 🏁 How to Run
1. Navigate to the `src` folder.
2. Compile the source code:
   ```bash
   javac *.java
