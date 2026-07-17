# Enums in Java

## Overview

This example demonstrates how Java **enums (enumerations)** represent a fixed set of constant values. Enums improve code readability, type safety, and maintainability compared to using strings or integers for predefined values.

---

## What I Implemented

- Created a custom `Day` enum representing the days of the week.
- Assigned each day a corresponding numeric value.
- Implemented a constructor and a getter method inside the enum.
- Accepted user input using `Scanner`.
- Converted the input into an enum using `valueOf()`.
- Used a `switch` expression to determine whether the selected day is a weekday or weekend.
- Handled invalid input with exception handling.

---

## Java Concepts

- Enums
- Constructors
- Fields
- Getter methods
- `valueOf()`
- Switch expressions
- Exception handling
- Scanner

---

## Project Structure

```text
enums/
├── Day.java
├── EnumDemo.java
└── README.md
```

---

## Sample Output

```text
Enter a day of the week:
Friday

Day Number: 6
It is a weekday.
```

---

## What I Learned

Enums are more than simple constants. They can contain constructors, fields, and methods, making them powerful for representing fixed sets of related values in a type-safe and maintainable way.