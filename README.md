# 📚 Spring Boot Book CRUD Application  

This project is a **Spring Boot application** demonstrating **CRUD (Create, Read, Update, Delete)** operations on a `Book` entity.  
It shows how to build RESTful APIs using **Spring Boot, Spring Data JPA, and an in-memory H2 database**.  

---

## 🚀 Features  
- Create a new book record  
- Read all books or a single book by ID  
- Update existing book details  
- Delete a book record  
- RESTful API design following best practices  
- Uses **Spring Boot, JPA, and H2 database** for simplicity  

---

## 🛠️ Tech Stack  
- **Backend Framework:** Spring Boot  
- **Database:** H2 (in-memory) / MySQL (optional)  
- **Persistence:** Spring Data JPA  
- **Build Tool:** Maven  
- **Java Version:** 17+ (can adjust if needed)  

---

## 📂 Project Structure  

```bash
src/main/java/com/example/bookcrud
 ├── controller       # REST controllers
 ├── entity           # JPA entities
 ├── repository       # Data repositories
 ├── service          # Business logic layer
 └── BookApplication.java   # Main class
```


## 📷 API Demo (CRUD Operations)

### ➕ Create (POST)
![CRUD - POST](BookApplication/src/Images/post%20request.png)

### 📖 Read (GET)
![CRUD - GET](BookApplication/src/Images/get%20request.png)

### ✏️ Update (PUT)
![CRUD - PUT](BookApplication/src/Images/put%20request.png)

### ❌ Delete (DELETE)
![CRUD - DELETE](BookApplication/src/Images/delete%20request.png)

---

## 🗄️ H2 Database View
![H2 Database](BookApplication/src/Images/H2%20database.png)

![H2 Database](BookApplication/src/Images/H2%20database1.png)

