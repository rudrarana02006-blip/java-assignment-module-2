# Java Programming Assignment - Module 2

**Student Name:** Rudra Rana  
**Enrollment Number:** A023119824067  

---

## Repository Structure

```
├── Question01/
│   ├── utilities/
│   │   └── MathUtils.java
│   └── Main.java
├── Question02/
│   ├── shapes/
│   │   ├── Shape.java
│   │   ├── Circle.java
│   │   └── Rectangle.java
│   └── Main.java
├── Question03/
│   └── Main.java
├── Question04/
│   └── Main.java
├── Question05/
│   └── Main.java
├── Question06/
│   └── Main.java
├── Question07/
│   └── Main.java
├── Question08/
│   ├── InvalidAgeException.java
│   └── Main.java
├── Question09/
│   ├── InvalidAgeException.java
│   └── Main.java
├── Question10/
│   └── Main.java
└── README.md
```

---

## Assignment Questions & Overview

### Section 1: Defining, Implementing, and Importing Packages
1. **Question 1:** Create a Java package `utilities` containing a class `MathUtils` with method `add(int a, int b)` to return the sum of two numbers. Demonstrate its use in another class.
2. **Question 2:** Define a package `shapes` containing an interface `Shape` with methods `double area()` and `double perimeter()`. Implement the interface in classes `Circle` and `Rectangle`.
3. **Question 3:** Write a program to import classes from `java.util` and use `ArrayList` to store and display a list of integers.

### Section 2: Interfaces (Functional Interface and Lambda Expression)
4. **Question 4:** Define a functional interface `Calculator` with a method `int compute(int a, int b)`. Use lambda expressions to provide implementations for addition, subtraction, and multiplication.
5. **Question 5:** Write a Java program to sort a list of strings in descending order using a lambda expression.
6. **Question 6:** Implement a method reference in a program to find the square of a number using a static method.

### Section 3: Errors and Exceptions
7. **Question 7:** Write a program that demonstrates the difference between `try-catch` and `try-catch-finally` blocks by dividing two numbers and handling `ArithmeticException`.
8. **Question 8:** Create a custom exception `InvalidAgeException` thrown when a user's age is less than 18. Demonstrate its use in a program.
9. **Question 9:** Create a custom exception `InvalidAgeException` thrown when a user's age is less than 18. Handle the exception and log the error to a file using `java.util.logging`.
10. **Question 10:** Demonstrate the use of `throw` and `throws` keywords in a program that calculates the factorial of a number, throwing an exception if the input number is negative.

---

## How to Compile and Run

To run any question, navigate to its folder in the terminal:

### Question 1
```bash
cd Question01
javac utilities/MathUtils.java Main.java
java Main
```

### Question 2
```bash
cd Question02
javac shapes/*.java Main.java
java Main
```

### Question 3
```bash
cd Question03
javac Main.java
java Main
```

### Question 4
```bash
cd Question04
javac Main.java
java Main
```

### Question 5
```bash
cd Question05
javac Main.java
java Main
```

### Question 6
```bash
cd Question06
javac Main.java
java Main
```

### Question 7
```bash
cd Question07
javac Main.java
java Main
```

### Question 8
```bash
cd Question08
javac InvalidAgeException.java Main.java
java Main
```

### Question 9
```bash
cd Question09
javac InvalidAgeException.java Main.java
java Main
```

### Question 10
```bash
cd Question10
javac Main.java
java Main
```
