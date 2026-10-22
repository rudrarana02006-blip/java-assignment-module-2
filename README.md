# Java Programming Assignments (Module 2 & Module 3)

**Student Name:** Rudra Rana  
**Enrollment Number:** A023119824067  

---

## Repository Structure

```
├── Module02/
│   ├── Question01/
│   │   ├── utilities/MathUtils.java
│   │   └── Main.java
│   ├── Question02/
│   │   ├── shapes/
│   │   │   ├── Shape.java
│   │   │   ├── Circle.java
│   │   │   └── Rectangle.java
│   │   └── Main.java
│   ├── Question03/
│   │   └── Main.java
│   ├── Question04/
│   │   └── Main.java
│   ├── Question05/
│   │   └── Main.java
│   ├── Question06/
│   │   └── Main.java
│   ├── Question07/
│   │   └── Main.java
│   ├── Question08/
│   │   ├── InvalidAgeException.java
│   │   └── Main.java
│   ├── Question09/
│   │   ├── InvalidAgeException.java
│   │   └── Main.java
│   └── Question10/
│       └── Main.java
├── Module03/
│   ├── Question01/
│   │   └── Main.java
│   ├── Question02/
│   │   └── Main.java
│   ├── Question03/
│   │   └── Main.java
│   ├── Question04/
│   │   └── Main.java
│   ├── Question05/
│   │   └── Main.java
│   ├── Question06/
│   │   └── Main.java
│   ├── Question07/
│   │   └── Main.java
│   ├── Question08/
│   │   └── Main.java
│   ├── Question09/
│   │   └── Main.java
│   ├── Question10/
│   │   └── Main.java
│   ├── Question11/
│   │   └── Main.java
│   ├── Question12/
│   │   └── Main.java
│   ├── Question13/
│   │   └── Main.java
│   ├── Question14/
│   │   └── Main.java
│   ├── Question15/
│   │   └── Main.java
│   ├── Question16/
│   │   └── Main.java
│   ├── Question17/
│   │   └── Main.java
│   ├── Question18/
│   │   └── Main.java
│   ├── Question19/
│   │   └── Main.java
│   ├── Question20/
│   │   └── Main.java
│   ├── Question21/
│   │   └── Main.java
│   ├── Question22/
│   │   └── Main.java
│   ├── Question23/
│   │   └── Main.java
│   ├── Question24/
│   │   └── Main.java
│   ├── Question25/
│   │   └── Main.java
│   ├── Question26/
│   │   └── Main.java
│   └── Question27/
│       └── Main.java
└── README.md
```

---

## Module 2: Packages, Interfaces & Exceptions

### Section 1: Defining, Implementing, and Importing Packages
1. **Question 1:** Java package `utilities` with class `MathUtils` and method `add(int a, int b)`. Demonstrated in another class.
2. **Question 2:** Package `shapes` with interface `Shape` (`double area()`, `double perimeter()`), implemented in `Circle` and `Rectangle`.
3. **Question 3:** Using `ArrayList` from `java.util` to store and display integers.

### Section 2: Interfaces
4. **Question 4:** Functional interface `Calculator` with `int compute(int a, int b)` implemented using lambda expressions for addition, subtraction, and multiplication.
5. **Question 5:** Sorting a list of strings in descending order using a lambda expression.
6. **Question 6:** Static method reference (`Main::square`) to compute the square of a number.

### Section 3: Errors and Exceptions
7. **Question 7:** Difference between `try-catch` and `try-catch-finally` handling `ArithmeticException`.
8. **Question 8:** Custom exception `InvalidAgeException` thrown when user's age is less than 18.
9. **Question 9:** Custom exception `InvalidAgeException` with error logging to file using `java.util.logging`.
10. **Question 10:** Demonstration of `throw` and `throws` calculating factorial, throwing `IllegalArgumentException` on negative numbers.

---

## Module 3: Multithreading, Concurrency, I/O Streams, File Handling & Utilities

### Thread Concepts and Implementation
1. **Question 1:** Creating a thread by extending `Thread` class to print even numbers from 2 to 20 with 500ms delay.
2. **Question 2:** Creating a thread by implementing `Runnable` interface to print characters of `"MULTITHREADING"` in reverse order.
3. **Question 3:** `Thread.sleep()` demonstration with two threads (Thread 1 every 1 second, Thread 2 every 2 seconds).
4. **Question 4:** Multithreaded countdown timer (10 to 1 with 1s delay) while another thread prints "Tick" every 500ms.
5. **Question 5:** Thread naming and priority assignment for "Worker-1", "Worker-2", and "Worker-3".
6. **Question 6:** Daemon thread continuously running auto-save while main thread processes file tasks.

### Thread Synchronization & Inter-thread Communication
7. **Question 7:** Synchronized method in ticket booking system to prevent overselling of tickets.
8. **Question 8:** Synchronized block in inventory management ensuring thread-safe product stock reduction.
9. **Question 9:** Dining Philosophers deadlock simulation with 2 philosophers and 2 chopsticks.
10. **Question 10:** Producer-Consumer problem implementation using `wait()` and `notify()`.
11. **Question 11:** Alternating odd and even number printing (1 to 20) using two threads with `wait()` and `notify()`.
12. **Question 12:** Graceful thread termination using a volatile boolean stop flag for file download simulation.

### Lock Interface
13. **Question 13:** Thread-safe counter using `ReentrantLock` compared against an unsynchronized counter.
14. **Question 14:** Deadlock avoidance using `tryLock()` with timeout in `ReentrantLock`.

### I/O Streams: Byte Stream and Character Stream
15. **Question 15:** Reading a file using byte stream (`FileInputStream`).
16. **Question 16:** Writing "Java I/O Streams Example" to `output.txt` using byte stream (`FileOutputStream`).
17. **Question 17:** Reading a file using character stream (`FileReader`).
18. **Question 18:** Writing a string to `example.txt` using character stream (`FileWriter`).
19. **Question 19:** Buffered I/O using `BufferedReader` and `BufferedWriter` for improved performance.

### File Handling
20. **Question 20:** Checking file existence and creating the file if it does not exist using `File` class.
21. **Question 21:** Listing all files and directories in a user-specified path with exception handling.
22. **Question 22:** Copying file contents from one file to another using byte streams.
23. **Question 23:** Deleting a file from the system using `File.delete()`.
24. **Question 24:** Using `RandomAccessFile` to seek, read, and overwrite specific file positions.

### Standard Java Packages
25. **Question 25:** Demonstrating `Math.abs()`, `Math.sqrt()`, `Math.max()`, and `Math.random()` from `java.lang`.
26. **Question 26:** Displaying current date and time using `java.util.Date` and `java.util.Calendar`.
27. **Question 27:** Email address validation using `Pattern` and `Matcher` from `java.util.regex`.

---

## How to Compile and Run

Navigate into any question directory under `Module02` or `Module03` and execute:

```bash
# Example: Module 3 Question 1
cd Module03/Question01
javac Main.java
java Main

# Example: Module 3 Question 10 (Producer-Consumer)
cd Module03/Question10
javac Main.java
java Main

# Example: Module 3 Question 27 (Regex Email Validation)
cd Module03/Question27
javac Main.java
java Main
```
