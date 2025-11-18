# Crime Records Management System

A backend console-based application developed using **Java**, **Hibernate ORM**, and **MySQL** to streamline and digitize crime record management for law enforcement agencies. This project automates the management of criminals, victims, crimes, and FIRs, ensuring improved accuracy, faster access, and better data security compared to traditional manual processes.

---

## 🚨 Problem Statement

Managing crime data manually using registers or spreadsheets leads to:
- Data inconsistency and duplication  
- Difficulty in retrieving past records  
- Low security and high error rates  
- No centralized storage system  
- No authentication or role-based access  

To overcome these challenges, a **digital crime records management system** is essential.

---

## 📘 Abstract

The Crime Records Management System is built with:
- **Java** (backend logic)
- **Hibernate ORM** (database mapping)
- **MySQL** (data storage)

The project follows an **MVC layered architecture** (Model → DAO → Service → Controller), ensuring modularity, reusability, and easy maintainability. The system provides separate role-based features for **Admins** and **Officers**.

---

## 🎯 System Objectives

- Provide a centralized digital platform for crime management  
- Ensure authentication (Admin & Officer roles)  
- Maintain accurate and consistent crime data  
- Simplify FIR filing and retrieval  
- Use Hibernate ORM for smooth database interaction  
- Build a scalable and extendable backend architecture  

---

## 🏗 Technology Stack

| Category     | Technology Used |
|--------------|----------------|
| Language     | Java 8+ |
| Database     | MySQL 8 |
| ORM          | Hibernate 5.6 |
| Build Tool   | Maven |
| IDE          | Eclipse / IntelliJ |
| Logging      | Log4j |
| Architecture | MVC + Layered Architecture |

---

## 🔄 Flow of the Project

### **1. User Authentication**
- Login via console  
- Credentials validated using Hibernate queries  

### **2. Admin Functionalities**
- Manage Users (Admins/Officers)  
- Add/View/Delete Crimes  
- Manage Criminal and Victim details  
- File & View FIRs  

### **3. Officer Functionalities**
- View Crimes, Criminals, Victims  
- File new FIRs  
- View all FIRs filed  

---
## 📦 System Architecture

User (Console)
↓
Controller Layer
↓
Service Layer
↓
DAO Layer (Hibernate)
↓
MySQL Database


Layers:
- **Model**: Entity classes  
- **DAO**: CRUD operations  
- **Service**: Business logic  
- **Controller**: Console menus  

---

## 📁 Modules

### **User Module**
- Login, registration, role assignment  

### **Crime Module**
- Add, update, and view crimes  

### **Victim Module**
- Store victim details  

### **Criminal Module**
- Maintain criminal profiles  

### **FIR Module**
- File FIRs connecting crime, victim, and criminal  
- Retrieve FIR reports  

---

## 🗄 Database Design

### **Tables**
- `users`
- `crimes`
- `victims`
- `criminals`
- `firs`

### **Relationships**
- One FIR → One Crime  
- One FIR → One Victim  
- One FIR → One Criminal  

---

## 📌 Actual Code Included (Java + Hibernate)

Source files include:
- Entity classes  
- DAO classes  
- Service layer  
- Controller menus  
- Hibernate configuration  

(Full code is included inside the project folder.)

---

## 🚀 Future Enhancements

- Convert to web app using Spring Boot + React  
- Add JWT-based authentication  
- Role expansion (Investigation Officer, Station Admin)  
- Add report generation (PDF)  
- Add advanced search & analytics  
- Cloud deployment (AWS/Azure)  

---

## 🏁 Conclusion

The Crime Records Management System provides a secure, efficient, and scalable backend for crime data management. This project demonstrates strong concepts in Java, MySQL, Hibernate, layered architecture, and object-relational mapping, making it suitable for real-world implementation and future enhancements.

---

## 📝 How to Run the Project

1. Install MySQL and create a database `crime_db`.
2. Update credentials in `hibernate.cfg.xml`.
3. Import project into Eclipse/IntelliJ.
4. Run `Main.java`.
5. Choose Admin/Officer login and navigate menus.



## 📦 System Architecture

