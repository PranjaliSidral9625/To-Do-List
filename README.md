To-Do List Application  

A full-stack To-Do List application built with Spring Boot and Angular, featuring task management with a modern responsive UI and RESTful backend.* 

Group Project

1.Snigdha Kandikatla

2.Pranjali Sidral

3.Gayatri Jadhav

4.Sandhya Pawar

## 📂 Project Structure  

to-do list/
├── README.md
├── todo-backend/                  # Backend (Spring Boot)
│   ├── pom.xml
│   ├── src/main/java/com/example/todo/
│   │   ├── TodoApplication.java
│   │   ├── controller/TaskController.java
│   │   ├── entity/Task.java
│   │   ├── repository/TaskRepository.java
│   │   ├── service/TaskService.java
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   ├── data.sql
│   └── target/todo-backend-0.0.1-SNAPSHOT.jar
├── todo-frontend/                 # Frontend (Angular)
│   ├── package.json
│   ├── angular.json
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/         # UI Components
│   │   │   ├── services/           # API services
│   │   │   ├── app.module.ts
│   │   │   ├── app.component.ts
│   │   │   └── app-routing.module.ts
│   │   └── index.html


---

📂Output

![Alt Text](img1.jpg)

## 🚀 Features  

### ✅ Backend (Spring Boot)  
- REST API for CRUD operation
- Task management (create, read, update, delete)  
- In-memory database initialization using data.sql  
- Follows *MVC architecture*  
- Easy to extend for relational databases (MySQL/PostgreSQL)  

### 🎨 Frontend (Angular)  
- Modern, responsive UI for managing tasks  
- Add, edit, delete, mark tasks as completed  
- Dynamic task rendering with Angular components  
- Service layer to interact with Spring Boot REST API  
- Routing for navigation between views  

---

## 🛠 Technologies Used  

### *Backend*  
- *Java 17+*  
- *Spring Boot*  
- *Spring Data JPA*  
- *Hibernate ORM*  
- *PostgreSQL*
- *Maven*  

### *Frontend*  
- *Angular 16+*  
- *TypeScript*  
- *HTML5, CSS3, Bootstrap/Tailwind* (if used)  
- *RxJS & Angular Services* for API calls  

---

## ⚙ Setup & Run  

### 1️⃣ Clone the Repository  
bash
git clone <your-repo-url>
cd to-do list


### 2️⃣ Run the Backend (Spring Boot)  
bash
cd todo-backend
mvn clean install
mvn spring-boot:run

Backend runs on: *http://localhost:8080*  

### 3️⃣ Run the Frontend (Angular)  
bash
cd todo-frontend
npm install
ng serve -o

Frontend runs on: *http://localhost:4200*  

---
