# ⚖️ Java BMI Calculator

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/IDE-Eclipse-blue?style=for-the-badge&logo=eclipseide" alt="Eclipse">
  <img src="https://img.shields.io/badge/Project-Console%20Application-success?style=for-the-badge" alt="Console Application">
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" alt="Status">
</p>

## 📖 Overview

The **BMI Calculator** is a console-based Java application that calculates a user's **Body Mass Index (BMI)** using their weight and height. The program converts weight from **pounds (lb)** to **kilograms (kg)**, calculates BMI using the standard formula, and classifies the result into one of the standard BMI categories.

This project is ideal for beginners learning Java fundamentals, user input, mathematical calculations, and conditional programming.

---

## ✨ Features

* ⚖️ Accepts weight in **pounds (lb)**
* 📏 Accepts height in **meters (m)**
* 🔄 Automatically converts pounds to kilograms
* 🧮 Calculates Body Mass Index (BMI)
* 📊 Displays BMI classification
* 💻 Simple console-based interface

---

## 🛠 Technologies Used

| Technology                | Purpose              |
| ------------------------- | -------------------- |
| ☕ Java                    | Programming Language |
| 📥 Scanner                | User Input           |
| ➗ Mathematical Operations | BMI Calculation      |
| 🔀 If-Else Statements     | BMI Classification   |
| 🖥 Console                | User Interface       |

---

## 📂 Project Structure

```text
day3/
└── BMICalculator.java
```

---

## 🚀 How It Works

1. ⚖️ Enter your weight in **pounds (lb)**.
2. 📏 Enter your height in **meters (m)**.
3. 🔄 The program converts your weight from pounds to kilograms.
4. 🧮 BMI is calculated using the standard BMI formula.
5. 📊 Your BMI value and health category are displayed.

---

## 📐 BMI Formula

The application first converts pounds to kilograms:

```text
Weight (kg) = Weight (lb) × 0.453592
```

Then calculates BMI:

```text
BMI = Weight (kg) ÷ (Height × Height)
```

---

## 📊 BMI Classification

|      BMI Range | Category       |
| -------------: | -------------- |
|  18.5 or below | 🔹 Underweight |
|    18.6 – 24.9 | ✅ Normal       |
|    25.0 – 29.9 | 🟠 Overweight  |
| 30.0 and above | 🔴 Obese       |

---

## 🖥 Sample Output

```text
Input Your Weight in Pounds
150

Input Your Height in Meters
1.75

Your BMI is 22.22

You are Normal
```

---

## 📸 Application Screenshot

After uploading a screenshot to your GitHub repository, display it using:

```markdown
![BMI Calculator](images/bmi-calculator-output.png)
```

Example project structure:

```text
BMICalculator/
│── README.md
│── images/
│     └── bmi-calculator-output.png
│── src/
│     └── day3/
│            └── BMICalculator.java
```

---

## ▶️ Running the Application

### Compile

```bash
javac day3/BMICalculator.java
```

### Run

```bash
java day3.BMICalculator
```

---

## 📚 Concepts Demonstrated

* ☕ Java Fundamentals
* 📥 User Input using `Scanner`
* 🔄 Unit Conversion
* ➗ Mathematical Calculations
* 🔀 Conditional (`if-else`) Statements
* 🖥 Console-Based Applications

---

## 💡 Future Enhancements

* ⚖️ Allow users to choose between pounds and kilograms.
* 📏 Support height input in feet and inches.
* 🎯 Round BMI values to two decimal places.
* ✅ Validate negative and invalid inputs.
* 🔄 Allow multiple BMI calculations in one session.
* 📈 Provide personalized health recommendations based on BMI.
* 🖥 Develop a graphical user interface (GUI) using Java Swing or JavaFX.

---

## 📋 Example BMI Categories

| Weight (lb) | Height (m) |  BMI | Classification |
| ----------- | ---------- | ---: | -------------- |
| 120         | 1.75       | 17.8 | 🔹 Underweight |
| 150         | 1.75       | 22.2 | ✅ Normal       |
| 180         | 1.75       | 26.7 | 🟠 Overweight  |
| 220         | 1.75       | 32.6 | 🔴 Obese       |

---

## 📝 Notes

* Weight should be entered in **pounds (lb)**.
* Height should be entered in **meters (m)**.
* The BMI categories are based on commonly accepted BMI classification ranges.
* This application is intended for educational purposes and should not replace professional medical advice.

---

## 👨‍💻 Author

**Ishaq Taj**

QA Automation Engineer | Java | Selenium | Test Automation
