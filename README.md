# Employee Record Management System 📋

A Java-based console application designed to simulate enterprise-level data management. This system allows users to create and retrieve employee records dynamically using the Java Collections Framework.

## 🚀 Key Technical Skills Demonstrated
This project showcases core backend development skills relevant to system engineering:

* **Java Collections Framework (`ArrayList`):**
    * Utilized `ArrayList<Employee>` instead of static arrays to allow **dynamic scalability** (the system can handle 1 or 1000 employees without code changes).
    * Demonstrates efficient memory management by growing storage only as needed.

* **Object-Oriented Programming (OOPs):**
    * **Encapsulation:** Data acts as a single unit (`Employee` object) containing ID, Name, and Salary.
    * **Constructor Injection:** Used parameterized constructors to initialize object states efficiently.

* **Iterators & Enhanced Loops:**
    * Implemented `for-each` loops to traverse the data structure efficiently when viewing records.

* **Interactive Menu Logic:**
    * Built a robust `while(true)` loop to keep the application running until the user explicitly chooses to exit, mimicking a real-world service.

## 🛠️ Tech Stack
* **Language:** Core Java
* **Data Structure:** `java.util.ArrayList`
* **I/O:** `java.util.Scanner`

## 💻 How to Run
1.  Ensure Java is installed (`java -version`).
2.  Clone the repository:
    ```bash
    git clone [https://github.com/Narendra-2123/Java-Employee-Management.git](https://github.com/Narendra-2123/Java-Employee-Management.git)
    ```
3.  Compile the code:
    ```bash
    javac EmployeeSystem.java
    ```
4.  Run the application:
    ```bash
    java EmployeeSystem
    ```

## 📸 Example Usage
```text
--- Employee Management System ---
1. Add Employee  2. View All  3. Exit

Enter Choice: 1
Enter ID: 101
Enter Name: Alex
Enter Salary: 55000
Employee Added!

Enter Choice: 2

--- Employee List ---
ID: 101 | Name: Alex | Salary: $55000.0
