# Java GUI Calculator

This is a **Java Swing-based GUI Calculator** developed using **NetBeans GUI Builder**. It performs standard arithmetic operations and some scientific functions. The calculator mimics a real-world handheld calculator, complete with a power button, error handling, and input parsing.

---

## 🛠 Features

- Power Button (ON/OFF switch)
- Basic Operations: `+`, `-`, `*`, `/`, `%`
- Scientific Functions:
  - Square `x²`
  - Square Root `√`
  - Exponentiation `x^y`
  - Negative Toggle (`±`)
- Input validation and error messages
- Clear (`C`) and Delete (`DEL`) buttons
- Button-only input (no keyboard required)

---

## 📁 File and Folder Structure

To run the calculator **properly**, follow this structure:

```
your-folder/
└── javacalculator/
    └── javacalculator/
        ├── JavaCalculator.java       # The launcher/caller for the GUI
        ├── mainCalculator.java       # The main GUI calculator logic
        ├── mainCalculator.form       # The GUI layout file (NetBeans-generated)
        └── background.png            # Required GUI background image
```

### Important Notes:

- **`javacalculator`** (outer folder): Project folder to open in your compiler (e.g., NetBeans).
- **`javacalculator`** (inner folder): Contains the source files and resources.
- **`JavaCalculator.java`**: The class that calls and runs the `mainCalculator`.
- **`background.png`**: Required! The calculator layout is image-based with transparent buttons. Without it, the GUI will appear invisible or broken.
- **`mainCalculator.form`**: Auto-generated form used by NetBeans for GUI layout. Do not delete this if using NetBeans.

---

## 💡 How It Works

### GUI Design

- The layout is created using **NetBeans drag-and-drop GUI Builder** (`javax.swing` components).
- A `JTextField` named `output` serves as the display.
- Buttons (`JButtons`) are layered over a custom image (`background.png`) with transparent borders and content.
- Manual layout with `null` and `setBounds()` for positioning.

---

## 🧠 Core Variables

```java
double num1, num2, result;
String Operator;
boolean isPowerOn = true;
```

Used to store operands, results, and current operation symbols.

---

## 🔄 Logic Flow

- Input is built by appending digits and operators to the display.
- When the `=` button is pressed, input is split by spaces into parts and parsed accordingly.
- Errors like divide-by-zero or malformed input are handled with readable messages.

---

## 🔧 Special Functionalities

- **Power Button**: Turns the calculator ON or OFF and disables all buttons accordingly.
- **Square, Square Root, Power-of-X** use built-in Java Math functions.
- **Negative Toggle** works before or after an operator.
- **Delete** removes last character; **Clear** resets all input.

---

## ✅ How to Run

1. Place all 4 files (`JavaCalculator.java`, `mainCalculator.java`, `mainCalculator.form`, `background.png`) inside a folder named `javacalculator`.
2. Put that `javacalculator` folder inside another folder — also named `javacalculator`.
3. Open the outer folder in your IDE or compiler (e.g., NetBeans).
4. Compile and run `JavaCalculator.java`.

---

## 🧪 Example Calculations

- `9 + 3` → `12`
- `5 ^ 2` → `25`
- `√16` → `4`
- `9 % 4` → `1` (Remainder)
- `-5` → toggle sign

---

## 📷 GUI Preview

> The GUI relies on `background.png`. Without it, you will not see the calculator layout.

---

## 📌 Requirements

- Java SE 8 or later
- NetBeans (for `.form` file support)
- No external libraries required

---

## 👨‍💻 Author

Developed by: **IIseichi**  
Project Type: **Java Midterm Lab Exam / Swing Practice**
