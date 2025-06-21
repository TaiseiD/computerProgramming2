LabActivity1EmployeeInformationSystem
📋 Description
LabActivity1EmployeeInformationSystem is a simple Java console application that allows the user to input basic employee details such as name, age, hours worked, and hourly wage. It then calculates and displays the employee's daily salary, rounded to two decimal places.

This project demonstrates basic input/output handling, variable declarations, arithmetic operations, and type usage in Java. It is ideal for beginners learning Java syntax and console interaction.

🛠 Features
Accepts user input via the console using Scanner.

Collects the following employee details:

First name

Last name

Age

Hours worked

Hourly wage

Calculates the daily salary.

Rounds the salary to two decimal places using Math.round().

Displays a clean summary of the employee's information.

🧑‍💻 How to Use
1. Compile the Program
Make sure you have Java installed. Open your terminal/command prompt and run:

bash
Copy
Edit
javac LabActivity1EmployeeInformationSystem.java
2. Run the Program
bash
Copy
Edit
java LabActivity1EmployeeInformationSystem
3. Provide Input
You will be prompted to enter the following:

First name (e.g., John)

Last name (e.g., Doe)

Age (e.g., 30)

Hours worked (e.g., 8.5)

Hourly wage (e.g., 120.50)

The program will then display a summary with the calculated daily salary.

🧮 Example Output
yaml
Copy
Edit
Enter your first name : John
Enter your last name : Doe
Enter your age : 30
Enter hours worked : 8.5
Enter hourly wage : 120.50

Employee Information
--------------------
Employee Name : John Doe
Age : 30 years old
Daily salary : PHP 1024.25
🧠 Concepts Demonstrated
Scanner class for user input

Primitive data types (int, float, double, String)

Arithmetic operations

Output formatting

Rounding decimal values with Math.round

📁 File Structure
arduino
Copy
Edit
LabActivity1EmployeeInformationSystem.java   // Main source file
✅ Requirements
Java Development Kit (JDK) 8 or higher

A terminal or IDE that supports Java (e.g., VSCode, IntelliJ IDEA, NetBeans)

🔍 Possible Enhancements
Add input validation (e.g., prevent negative values for wage or hours)

Allow input of multiple employees

Export results to a text file

Convert to GUI-based application (using Swing or JavaFX)

📄 License
This project is for educational purposes. Feel free to modify and use it for your own learning.
