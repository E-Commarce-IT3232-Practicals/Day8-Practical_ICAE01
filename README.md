# 🍽️ Smart Canteen Management System - Day08 (2025-05-02)

## 📖 Project Overview

This project is a **Spring Boot-based application** designed to manage a smart canteen system for the University of Vavuniya. The system allows for the management of canteens, menus, users (students & employees), and food orders efficiently.

---

## 🎯 Key Features

- 🏫 Manage multiple **canteens** across the university campus  
- 🍲 Track **food items** (name, price, weight)  
- 📅 Support **daily menus** in each canteen  
- 👨‍🎓 Manage **students** who can place food orders  
- 👩‍💼 Manage **employees** associated with multiple canteens  
- 🧾 Record and track **food orders** with multiple items  

---

## 🧩 Entity Relationship Summary

### 🧍‍♂️ User (Base Class)
- `id`, `name`, `age`, `gender`
- Inherited by:
  - 👨‍🎓 **Student**: `academicDegree`, Orders food
  - 👩‍💼 **Employee**: `jobPosition`, Works in multiple canteens

### 🏬 Canteen
- `id`, `location`
- Has multiple **DailyMenus**
- Associated with multiple **Employees**

### 📆 DailyMenu
- `id`, `date`
- Belongs to one **Canteen**
- Contains multiple **FoodItems**

### 🍛 FoodItem
- `id`, `name`, `price`, `weight`
- Can be part of multiple **DailyMenus**
- Linked via **OrderLines**

### 🧾 FoodOrder
- `id`, `datePlaced`
- Belongs to one **Student** and one **DailyMenu**
- Contains multiple **OrderLines**

### ➕ OrderLine
- `id`, `quantity`
- Belongs to one **FoodOrder** and one **FoodItem**

---

## 🔄 Entity Diagram Overview

```plaintext
User <|-- Student
User <|-- Employee
Canteen --< DailyMenu
DailyMenu >-- FoodItem
Student --< FoodOrder
FoodOrder --< OrderLine
OrderLine --> FoodItem
Employee >-- Canteen
````

---

## 🛠️ Technologies Used

* 💻 **Java 17+**
* 🧰 **Spring Boot**
* 🗃️ **JPA / Hibernate**
* 🧪 **MySQL / H2 Database**
* 🛠️ **Maven**
* 🧠 IDE: IntelliJ / Eclipse / VS Code

---

## 📂 Instructions

### ✅ Tasks

1. 🧱 Create entity classes using JPA relationships and ORM techniques.
2. 🛢️ Migrate models to the database.
3. 💾 Take a database backup.

---

## 📦 Project Modules (Structure Suggestion)

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── university/
│   │           └── smartcanteen/
│   │               ├── model/
│   │               │   ├── User.java
│   │               │   ├── Student.java
│   │               │   ├── Employee.java
│   │               │   ├── Canteen.java
│   │               │   ├── DailyMenu.java
│   │               │   ├── FoodItem.java
│   │               │   ├── FoodOrder.java
│   │               │   └── OrderLine.java
│   └── resources/
│       ├── application.properties
│       └── schema.sql (optional)
```

---

## 🚀 Outputs

![Screenshot 1](https://github.com/user-attachments/assets/e9b30f48-184c-44ab-8430-c7ef363a2c0c)

![Screenshot 2](https://github.com/user-attachments/assets/741c2f2d-9386-47d4-b963-7006b2cfbd90)

![Screenshot 3](https://github.com/user-attachments/assets/07a0901e-8c53-4ec2-a5f6-1c77f27c54ff)

---

> © 2025 University of Vavuniya | Faculty of Applied Science
