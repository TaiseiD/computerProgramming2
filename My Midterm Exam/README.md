# MyMidtermLabExam – IT Ticketing System (Console-Based)

This project is a simple **console-based IT Helpdesk Ticketing System** written in Java. It allows a user to add tickets, update their statuses, view all tickets, and generate a report of the current ticket status.

Designed for midterm lab practice, the application uses core Java features such as arrays, conditionals, loops, methods, and `Scanner` for user input.

---

## 📋 Features

- Add a new ticket (up to a maximum of 5)
- Assign urgency level: Low / Medium / High
- Auto-initialized ticket status to `Pending`
- Update ticket status to `In Progress` or `Resolved`
- View all existing tickets with status and urgency
- Generate a status report of all tickets

---

## 🧠 Ticket Structure

Each ticket contains the following:

- **Issue Description**
- **Urgency Level** – `Low`, `Medium`, or `High`
- **Status** – `Pending`, `In Progress`, or `Resolved`

Stored using 3 parallel arrays:
```java
String[] issue
String[] urgency
String[] status

## 📋 Menu Overview

When the program runs, the user is presented with the following menu:

===== IT Ticket System =====

1. Add Ticket
2. Update Ticket Status
3. Show All Tickets
4. Generate Report
5. Exit

### Validations

- Limits tickets to 5 (maximum array size)
- Validates numeric input for menu selection and ticket numbers
- Skips invalid input gracefully
- Prevents status updates on invalid indices
- Displays helpful error messages

---

## 🚀 How to Run

### Prerequisites

- Java JDK 8 or later installed

### Steps

1. Save the code as `MyMidtermLabExam.java`
2. Open terminal or command prompt
3. Navigate to the folder containing the file
4. Compile the code: javac MyMidtermLabExam.java
5. Run the program: java MyMidtermLabExam

## 🙌 Author's Note

This program was created for a **Midterm Lab Exam** and is designed to apply foundational programming skills including:

- Working with arrays
- Structuring a menu-driven console application
- Using loops, conditionals, and methods
- Managing user input and data flow cleanly

Feel free to build on top of this structure for future Java console applications or use it as a base for GUI versions.



