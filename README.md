# Java BMI Calculator

## Overview

This is a simple console-based **Body Mass Index (BMI) Calculator** written in Java. The application calculates a user's BMI based on their weight (entered in pounds) and height (entered in meters), then classifies the result according to standard BMI categories.

This project demonstrates user input, mathematical calculations, unit conversion, and conditional statements in Java.

## Features

* Accepts user weight in pounds (lb)
* Accepts user height in meters (m)
* Converts weight from pounds to kilograms
* Calculates Body Mass Index (BMI)
* Displays the calculated BMI
* Categorizes BMI as:

  * Underweight
  * Normal
  * Overweight
  * Obese

## Technologies Used

* Java
* `Scanner` class for user input
* Console-based interface
* Conditional statements (`if-else`)

## Project Structure

```text
day3/
└── BMICalculator.java
```

## BMI Formula

The program first converts weight from pounds to kilograms using the following conversion:

```text
Weight (kg) = Weight (lb) × 0.453592
```

It then calculates BMI using the standard formula:

```text
BMI = Weight (kg) ÷ (Height (m) × Height (m))
```

## BMI Categories

| BMI Range      | Category    |
| -------------- | ----------- |
| 18.5 or below  | Underweight |
| 18.6 – 24.9    | Normal      |
| 25.0 – 29.9    | Overweight  |
| 30.0 and above | Obese       |

## Example Output

```text
Input Your Weight in Pounds
150

Input Your Height in Meters
1.75

Your BMI is 22.22
You are Normal
```

## How to Run

### Compile

```bash
javac day3/BMICalculator.java
```

### Run

```bash
java day3.BMICalculator
```

## Learning Concepts Demonstrated

* Variables and data types
* User input using the `Scanner` class
* Unit conversion
* Mathematical calculations
* Conditional (`if-else`) statements
* Console input and output

## Possible Improvements

* Accept weight in kilograms as an additional option.
* Accept height in feet and inches.
* Round the BMI value to two decimal places.
* Validate user input to prevent invalid or negative values.
* Allow users to calculate BMI multiple times without restarting the program.
* Create a graphical user interface (GUI) using Java Swing or JavaFX.

## Notes

* Weight should be entered in **pounds (lb)**.
* Height should be entered in **meters (m)**.
* The BMI categories used in this project are based on commonly accepted BMI classification ranges.

## Author
Ishaq Taj
QA Automation Engineer | Java | Selenium | Test Automation
