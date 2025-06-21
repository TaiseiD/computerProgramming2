# LabActivity4EmpInfoSystemGUI

This project is a simple GUI-based Employee Information System written in Java using AWT (Abstract Window Toolkit). It allows users to enter employee details and calculates the employee's daily salary, all displayed within a graphical user interface.

## 📋 Description

The system collects the following inputs via a form:
- First Name
- Last Name
- Age
- Hours Worked
- Hourly Rate

When the user clicks the **Submit** button, the system:
- Validates the inputs
- Calculates the daily salary
- Displays the result in a read-only text area

## ✅ Features

- Java AWT-based GUI application
- Manual layout using `null` layout manager and `setBounds()`
- Input fields (`TextField`) for data entry
- Output displayed in a `TextArea`
- Button (`Button`) to trigger calculation
- Basic input validation:
  - All fields must be filled
  - Age must be a whole number
  - Hours Worked and Hourly Rate must be numeric and positive
- Calculation of:
  - Daily salary (Hours Worked × Hourly Rate)
  - Display of full name and age in the output

## 🚀 How to Run

### Requirements
- Java JDK 8 or later

### Steps
1. Save the file as `LabActivity4EmpInfoSystemGUI.java`
2. Open your terminal or command prompt
3. Navigate to the folder containing the file
4. Compile the file: javac LabActivity4EmpInfoSystemGUI.java
5. Run the program: java LabActivity4EmpInfoSystemGUI


## 📄 Example Output (Text Format)

After filling in the fields and clicking **Submit**, the program will display something like:

Full Name: Juan Dela Cruz
Age: 30
Daily Salary: PHP850.00

If the input is invalid (e.g. a blank field or incorrect value), appropriate error messages will appear in the output area such as:

Error: All fields must be filled.
Error: Age must be a whole number.
Error: Hours Worked and Hourly Rate must be numeric.


## 🧠 Concepts Applied

- GUI Programming with AWT
- Manual layout management (`null` layout)
- Event handling using `ActionListener`
- Data validation and error handling
- String manipulation and formatting

## 🗃️ File Structure

LabActivity4EmpInfoSystemGUI.java

## 🪪 License

This project is for educational purposes only.  
Feel free to modify and reuse for your Java learning journey.

## 🙌 Acknowledgments

This lab was created as part of a progression in learning Java programming — from basic console I/O to full GUI application development.  
Developed with Java, AWT, and curiosity.

