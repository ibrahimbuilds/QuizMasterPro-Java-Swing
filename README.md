# QuizMaster Pro — Desktop Examination System

A robust, desktop-based quiz and examination management system built using Java Swing (GUI) and integrated with a secure MySQL database backend managed via MySQL Workbench. The application features independent, role-based modules for both Administrators (faculty/hosts) and Students, providing a streamlined workflow for academic assessments.

---

## 🚀 Key Features

### 👤 Student Portal
* **Interactive Testing Engine:** Features a dynamic interface with real-time tracking for standardized multiple-choice questions.
* **Instant Evaluation:** Automatically calculates final scores upon quiz completion and commits results safely to the central database.

### 🛡️ Administrative Dashboard
* **Question Pool Management:** Full CRUD operations allowing administrators to seamlessly view, create, and delete questions from the active database pool.
* **Student Analytics:** A centralized gradebook table providing direct search visibility to filter and audit student exam scores by Roll Number or Name.

---

## 🛠️ Tech Stack & Architecture

* **Language:** Java (JDK 8 or higher)
* **GUI Framework:** Java Swing & AWT (Event-driven layouts)
* **Database Management:** MySQL Server & MySQL Workbench
* **Driver:** JDBC (Java Database Connectivity) — `mysql-connector-j`

### 🏗️ Object-Oriented Principles Implemented
* **Encapsulation:** All application states, database credentials, and user data models are strictly encapsulated within dedicated getter/setter methodologies and private class attributes.
* **Inheritance & Polymorphism:** Leveraged systematically across the visual `JFrame` hierarchy to ensure consistent navigation frames, portal parameters, and localized custom frame handling.

---

## 💾 Database Schema Blueprint

To replicate the backend environment in your local instance of MySQL Workbench, execute the following schema script:

```sql
CREATE DATABASE IF NOT EXISTS quiz_db;
USE quiz_db;

-- 1. Table structure for managing quiz questions
CREATE TABLE Questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question_text VARCHAR(255) NOT NULL,
    option_a VARCHAR(100) NOT NULL,
    option_b VARCHAR(100) NOT NULL,
    option_c VARCHAR(100) NOT NULL,
    option_d VARCHAR(100) NOT NULL,
    correct_answer VARCHAR(1) NOT NULL
);

-- 2. Table structure for tracking examination records
CREATE TABLE quiz_results (
    id INT AUTO_INCREMENT PRIMARY KEY,
    roll_no VARCHAR(50) NOT NULL,
student_name VARCHAR(100) NOT NULL,
    score INT NOT NULL
);
```
🔧 Installation & Setup
Clone the Repository:

Bash
git clone [https://github.com/ibrahimbuilds/QuizMasterPro-Java-Swing.git](https://github.com/ibrahimbuilds/QuizMasterPro-Java-Swing.git)
Database Initialization:

Open MySQL Workbench and connect to your local server instance.

Open a new query tab (Ctrl + T), paste the SQL schema script provided above, and click the Lightning Bolt ⚡ icon to execute.

IDE Configuration (NetBeans):

Open NetBeans and choose File ➔ Open Project to select the QuizMasterPro directory.

Right-click the Libraries folder within the NetBeans Projects pane ➔ Add JAR/Folder ➔ include your mysql-connector-java.jar file.

Compile and Run:

Press Shift + F11 (Clean and Build) followed by F6 to launch the application.

📝 License
This project is open-source and available under the MIT License.
    
