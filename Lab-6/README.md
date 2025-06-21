# LabActivity6SwingToDoList

This project is a **Swing-based To-Do List Manager** that allows users to create and view tasks in a table format. It features a clean GUI where users can add tasks with a name, description, and status. The project demonstrates basic Swing components, event handling, and UI layout management.

## 📋 Description

The application includes:
- A main viewer window with a table of tasks
- A pop-up form to add new tasks
- Support for task name, description, and status
- Error validation for empty input
- Status options: Not Started, Ongoing, Completed

This project showcases the integration of **JTable**, **JTextField**, **JTextArea**, **JComboBox**, and layout positioning using absolute bounds.

## ✅ Features

- Java **Swing GUI** application
- JTable with scrollable task list
- Separate form for adding tasks
- Task input fields:
  - Task Name (`JTextField`)
  - Task Description (`JTextArea`)
  - Task Status (`JComboBox`)
- Validation to prevent empty task name or status
- Automatic update of task list after submission
- Form stays on top if reopened while already open

## 🚀 How to Run

### Requirements
- Java JDK 8 or later

### Steps
1. Save the file as `LabActivity6SwingToDoList.java`
2. Open terminal or command prompt
3. Navigate to the directory containing the file
4. Compile the code: javac LabActivity6SwingToDoList.java
5. Run the program: java LabActivity6SwingToDoList


## 📄 Example Behavior (Text Description)

- Launching the app displays a window titled **"To-Do List Viewer"** with an **"Add Task"** button and an empty task table.
- Clicking **"Add Task"** opens a pop-up form to input:
- Task name
- Task description
- Task status (dropdown)
- Clicking **"Save Task"**:
- Adds the task to the table
- Closes the form
- Input validation prevents submission if required fields are empty.

## 🧠 Concepts Applied

- GUI layout using `BorderLayout`, `JPanel`, `JScrollPane`, and `null` layout
- Event handling via `ActionListener`
- Data modeling using `DefaultTableModel`
- Form interaction between two frames (`JFrame` windows)
- Use of modern Swing components

## 🗃️ File Structure

LabActivity6SwingToDoList.java

## 🪪 License

This project was created for academic and learning purposes.  
You are free to modify or extend it for your own Java Swing practice.

## 🙌 Acknowledgments

This lab reinforces knowledge in:
- Swing interface design
- User input handling and validation
- Window management in desktop Java apps


