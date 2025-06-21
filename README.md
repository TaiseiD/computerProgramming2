# Java Programming Portfolio

This repository contains a collection of Java projects developed as part of coursework and personal practice, ranging from basic syntax to GUI applications using Swing. Each lab progressively builds skills in programming logic, user interaction, data structures, and graphical interfaces.

---

## 📚 Table of Contents

* [Lab Activities](#lab-activities)

  * [Lab 1: Basic Input/Output](#lab-1-basic-inputoutput)
  * [Lab 2: Conditional Statements](#lab-2-conditional-statements)
  * [Lab 3: Loops and Iteration](#lab-3-loops-and-iteration)
  * [Lab 4: Methods and Arrays](#lab-4-methods-and-arrays)
  * [Lab 5: Object-Oriented Programming](#lab-5-object-oriented-programming)
  * [Lab 6: GUI To-Do List](#lab-6-gui-to-do-list)
* [🧪 Midterm Exam: Java Ticketing System (Console App)](#midterm-exam-java-ticketing-system-console-app)
* [🏁 Final Exam: Java GUI Calculator (Swing)](#final-exam-java-gui-calculator-swing)

---

## Lab Activities

### Lab 1: Basic Input/Output

**Topics:** `Scanner`, `System.out`, variables

Simple programs that prompt the user for inputs and display outputs using basic Java syntax.

### Lab 2: Conditional Statements

**Topics:** `if`, `else`, `switch`

Programs that implement decision-making such as grading systems or comparisons using control flow statements.

### Lab 3: Loops and Iteration

**Topics:** `for`, `while`, `do-while`

Exercises involving loops to perform repetitive tasks like printing patterns, counting, or aggregating values.

### Lab 4: Methods and Arrays

**Topics:** functions, arrays, loops

Implemented reusable methods and array manipulation for operations such as summing numbers, finding max/min, or processing data.

### Lab 5: Object-Oriented Programming

**Topics:** `classes`, `objects`, encapsulation

Created custom classes with fields, constructors, and methods to simulate real-world objects.

### Lab 6: GUI To-Do List

**Technologies:** `Swing`, `JTable`, `JFrame`

Created a simple GUI-based To-Do List Manager. Allows adding tasks with name, description, and status using a form. Data is displayed in a table.

---

## 🧪 Midterm Exam: Java Ticketing System (Console App)

A ticket tracking system that allows users to:

* Add IT tickets (with issue description and urgency)
* Update ticket status (Pending, In Progress, Resolved)
* View all tickets
* Generate a report summarizing ticket statuses

**Features:**

* Input validation
* Array-based storage for up to 5 tickets
* Report generation with status counts

---

## 🏁 Final Exam: Java GUI Calculator (Swing)

This is a **Java Swing-based GUI Calculator** developed using **NetBeans GUI Builder**. It performs standard arithmetic operations and scientific functions.

### 🛠 Features

* Power Button (ON/OFF switch)
* Basic Operations: `+`, `-`, `*`, `/`, `%`
* Scientific Functions:

  * Square `x²`
  * Square Root `√`
  * Exponentiation `x^y`
  * Negative Toggle (`±`)
* Input validation and error messages
* Clear (`C`) and Delete (`DEL`) buttons
* Button-only input (no keyboard required)

### 📁 File and Folder Structure

To run the calculator **properly**, follow this structure:

```
your-folder/
└── javacalculator/
    └── javacalculator/
        ├── JavaCalculator.java      # Launcher for the GUI
        ├── mainCalculator.java      # Main GUI logic
        ├── mainCalculator.form      # NetBeans layout file
        └── background.png           # Required GUI background image
```

**Note:**

* The calculator uses a background image for layout.
* All buttons are transparent; without the image, nothing will be visible.
* Open the **outer javacalculator** folder in NetBeans to run the program.

### ✅ How to Run

1. Place all 4 files in the correct folder hierarchy as shown above.
2. Open the outer `javacalculator` folder in NetBeans or your preferred IDE.
3. Compile and run `JavaCalculator.java`.

### 🧪 Example Calculations

* `9 + 3` → 12
* `5 ^ 2` → 25
* `√16` → 4
* `9 % 4` → 1 (Remainder)
* `-5` → toggled to positive or vice versa

---

## 📌 Requirements

* Java SE 8 or later
* NetBeans IDE (for `.form` GUI support)
* No external libraries required

---

## 👨‍💻 Author

**Developed by:** IIseichi
**Project Type:** Academic Projects (Labs + Exams)

Feel free to explore each project folder to view specific source codes and outputs.
