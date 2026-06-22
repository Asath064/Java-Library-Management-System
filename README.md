# 📚 Library Management System using JDBC

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/MySQL-8.0-green?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" />
</p>

---

## 🚀 Project Overview

The **Library Management System** is a Java-based application developed as part of my **Java Development Internship at Codveda Technologies**.

This project uses **JDBC (Java Database Connectivity)** and **MySQL** to perform real-world database operations such as managing books, borrowing books, returning books, and maintaining library records efficiently.

---

## ✨ Features

✅ Add New Books

✅ View Available Books

✅ Update Book Information

✅ Delete Books

✅ Borrow Books

✅ Return Books

✅ JDBC Database Connectivity

✅ MySQL Integration

✅ CRUD Operations

✅ Object-Oriented Programming

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Application Development |
| JDBC | Database Connectivity |
| MySQL | Database Management |
| SQL | Data Manipulation |
| OOP | Application Design |

---

## 📂 Project Structure

```text
Library-Management-System
│
├── Database.sql
├── DBConnection.java
├── Book.java
├── LibraryManagementSystem.java
├── README.md
├── Output1.png
├── Output2.png
└── DemoVideo.mp4
```

---

## ⚙️ Database Setup

### Create Database

```sql
CREATE DATABASE librarydb;
```

### Use Database

```sql
USE librarydb;
```

### Create Table

```sql
CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    status VARCHAR(20)
);
```

---

## ▶️ How to Run

### Step 1

Clone Repository

```bash
git clone https://github.com/Asath064/Codveda-Library-Management-System.git
```

### Step 2

Import Database

```sql
librarydb.sql
```

### Step 3

Configure JDBC Connection

```java
username = root
password = your_password
```

### Step 4

Compile

```bash
javac *.java
```

### Step 5

Run

```bash
java LibraryManagementSystem
```

---

## 🎯 Learning Outcomes

Through this project, I gained hands-on experience in:

- Java Programming
- JDBC Connectivity
- MySQL Database Management
- SQL Queries
- CRUD Operations
- Object-Oriented Programming
- Backend Development Concepts
- Problem Solving

---

## 📸 Project Screenshots

### Add screenshots below

| Feature | Screenshot |
|----------|------------|
| Add Book | Output1.png |
| View Books | Output2.png |
| Borrow Book | Output3.png |
| Return Book | Output4.png |

---

## 📈 Future Enhancements

- 🔐 User Authentication
- 📊 Library Reports
- 🌐 Web-Based Interface
- 📱 Mobile Application
- 📚 Fine Calculation System
- 👨‍🎓 Student Management Module

---

## 💼 Internship Project

This project was developed as part of the **Java Development Internship Program at Codveda Technologies**.

---

## 👨‍💻 Author

### Asath Ali

Java Development Intern

Codveda Technologies

🔗 GitHub: https://github.com/Asath064

🔗 LinkedIn: Add Your LinkedIn Profile Here

---

<p align="center">
  ⭐ If you found this project useful, consider giving it a star!
</p>
