# 🔎 LabActivity3ConditionalStatement

This Java console application builds on previous employee wage systems by integrating **input validation** and **conditional logic** to simulate a more realistic HR/Payroll system.

🧠 It includes:
- Age eligibility checks
- Input validation for work hours
- Job role selection via switch-case
- Tiered taxation system based on annual income

---

## 🧾 Program Description

This lab accepts the following employee inputs:
- Name (First and Last)
- Age (must be between 18 and 64)
- Daily working hours (must be > 0 and ≤ 24)
- Hourly wage
- Job role selection (Manager, Supervisor, Staff, Intern)

🧮 It then calculates:
- Daily, weekly, monthly salary
- Gross and net yearly salary (with tiered taxation)
- Years remaining until retirement (age 65)

---

## ✅ Features

- ✅ **Conditional validation** for:
  - Age eligibility (must be 18–64)
  - Work hours (must be 1–24)
  - Job role selection (via numeric input)
- ✅ **Tax logic**:
  - Gross income > ₱250,000 → 32% tax + ₱1,500 deduction
  - Otherwise, flat ₱1,500 deduction
- ✅ **Structured output** with proper formatting
- ✅ Uppercased full name output
- ✅ Clear display of position and retirement timeline

---

## 🚀 How to Run

### Requirements
- Java JDK 8 or later
- IDE or terminal

### Steps

```bash
javac LabActivity3ConditionalStatement.java
java LabActivity3ConditionalStatement
