# LabActivity5QuizAppAWT

This project is a simple multiple-choice **Quiz Application** built using Java AWT (Abstract Window Toolkit). It allows users to take a short quiz, select answers, and receive a score at the end.

## 📋 Description

The quiz app contains:
- A window that displays one question at a time
- Four multiple-choice options using radio-style checkboxes
- A "Next" button to move to the next question
- Score display after the final question
- Basic error handling (e.g., warning when no answer is selected)

This program demonstrates how to build a basic GUI application that uses event handling, dynamic content updating, and user interaction tracking.

## ✅ Features

- Java GUI built entirely with **AWT**
- Displays a total of 3 multiple-choice questions
- Options rendered as exclusive `CheckboxGroup` (radio buttons)
- "Next" button progresses to the next question
- Displays error if no option is selected
- Final score shown at the end of the quiz
- Clean and simple layout using `BorderLayout` and `GridLayout`

# 🧠 Sample Quiz – Multiple Choice Questions

### 1. What is the capital of France?

- A. Paris  
- B. Rome  
- C. Berlin  
- D. Madrid  

---

### 2. Which language is used for Android development?

- A. Swift  
- B. Java  
- C. Python  
- D. Kotlin  

---

### 3. What is the result of `2 + 2 * 2`?

- A. 6  
- B. 8  
- C. 4  
- D. 10  


## 🧠 Logic Overview

- **Question Flow**:
  - An array of questions is displayed one at a time
  - Corresponding answer choices and correct answers are stored in arrays
- **Validation**:
  - If user tries to proceed without selecting an answer, a red warning is shown
- **Scoring**:
  - Score increases by 1 for each correct answer
- **End of Quiz**:
  - Final score is displayed in the question label
  - All buttons and options are disabled

## 🚀 How to Run

### Requirements
- Java JDK 8 or later

### Steps
1. Save the file as `LabActivity5QuizAppAWT.java`
2. Open your terminal or command prompt
3. Navigate to the folder containing the file
4. Compile the file: javac LabActivity5QuizAppAWT.java
5. Run the program: java LabActivity5QuizAppAWT
   
## 📁 File Structure

LabActivity5QuizAppAWT.java

## 🪪 License

This quiz app is created for educational use.  
Feel free to modify or extend it for your Java learning projects.

## 🙌 Acknowledgments

This project builds on knowledge of AWT GUI programming, event handling, input validation, and state management.  
Created as a learning exercise in building interactive desktop apps using Java.


