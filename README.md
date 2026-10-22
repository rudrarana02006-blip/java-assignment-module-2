# Java Programming Assignments (Modules 2, 3, 4 & 5)

**Student Name:** Rudra Rana  
**Enrollment Number:** A023119824067  

---

## Repository Structure

```
├── Module02/                                # Module 2: Packages, Interfaces, Exceptions (10 questions)
│   ├── Question01/ ... Question10/
├── Module03/                                # Module 3: Multithreading, I/O Streams, File Handling (27 questions)
│   ├── Question01/ ... Question27/
├── Module04/                                # Module 4: Generics, Collections Framework & Concurrency (45 questions)
│   ├── Question01/ ... Question45/
│   └── Module04_Theory_Answers.md           # Theoretical answers for Module 4
├── Module05/                                # Module 5: Annotations, Reflection & Maven Framework
│   ├── Question17_StringLengthValidator/    # Custom string length validation annotation
│   ├── Question18_RepeatableAnnotations/    # Repeatable role annotations
│   ├── Question21_MinLengthAnnotation/      # @MinLength validation annotation
│   ├── Question22_AuthorVersionAnnotation/  # @ClassInfo author and version annotation
│   ├── Question25_ArrayParametersAnnotation/# Array parameter annotation handling
│   ├── Question26_JsonFieldAnnotation/      # @JsonField custom JSON serializer
│   ├── Question28_ReflectionAnnotationProcessor/ # Reflection invocation by annotation priority
│   ├── Question29_MethodExecutionTime/      # Method execution timing annotation
│   ├── Exercise01_AnnotationValidation/     # Maven project validating user input via annotations
│   ├── Exercise02_TransitiveDependencies/   # Maven project with transitive dependency exclusion
│   ├── Exercise03_CustomAnnotationsApp/     # Core Java application with custom annotations & Maven
│   ├── Exercise04_WebApplicationWar/        # Maven web application with maven-war-plugin
│   ├── Exercise05_MultiModuleProject/       # Multi-module Maven project with parent POM
│   └── Module05_Theory_Answers.md           # Complete answers to all 50 questions
└── README.md
```

---

## Module 2: Packages, Interfaces & Exceptions (10 Questions)
- **Question 1:** Custom package `utilities` with class `MathUtils` and method `add(int a, int b)`.
- **Question 2:** Package `shapes` with interface `Shape` implemented by `Circle` and `Rectangle`.
- **Question 3:** Using `ArrayList` from `java.util` to store and display integers.
- **Question 4:** Functional interface `Calculator` with lambda expressions for addition, subtraction, multiplication.
- **Question 5:** Sorting strings in descending order using lambda comparator.
- **Question 6:** Static method reference (`Main::square`) to compute the square of a number.
- **Question 7:** Difference between `try-catch` and `try-catch-finally` handling `ArithmeticException`.
- **Question 8:** Custom exception `InvalidAgeException` thrown when user's age is less than 18.
- **Question 9:** Custom exception `InvalidAgeException` with file logging using `java.util.logging`.
- **Question 10:** Demonstration of `throw` and `throws` in factorial calculation.

---

## Module 3: Multithreading, I/O Streams & File Handling (27 Questions)
- **Questions 1–6:** Thread extension, `Runnable` implementation, `Thread.sleep()`, countdown timer, naming/priority, daemon threads.
- **Questions 7–12:** Synchronized methods (ticket booking), synchronized blocks (inventory), Dining Philosophers deadlock, Producer-Consumer (`wait()`/`notify()`), alternating odd/even printing, graceful thread stop flag.
- **Questions 13–14:** `ReentrantLock` counter vs unsafe counter, deadlock resolution with `tryLock()` timeout.
- **Questions 15–19:** Byte streams (`FileInputStream`/`FileOutputStream`), Character streams (`FileReader`/`FileWriter`), Buffered I/O (`BufferedReader`/`BufferedWriter`).
- **Questions 20–24:** File existence/creation, directory listing, file copying, file deletion, `RandomAccessFile` read/overwrite.
- **Questions 25–27:** `java.lang.Math`, `java.util.Date` and `Calendar`, `java.util.regex` email validation.

---

## Module 4: Generics & Collections Framework (45 Coding Questions + Theory)
- **Questions 1–6 (Generics):** Bounded type parameters (`<T extends Number>`), generic `Pair<K, V>`, generic `Box<T>`, generic method `swapElements`, generic `Stack<T>`, generic `MinMaxFinder<T extends Comparable<T>>`.
- **Questions 7–12 (Collections & List Interface):** Three iteration techniques on List, generic collection printer, `ArrayList` storage and iteration, List manipulation operations, `ArrayList` vs `LinkedList` performance comparison benchmark, sorting strings alphabetically and reverse alphabetically.
- **Questions 13–16 (Set Interface):** `TreeSet` sorted elements, `HashSet` duplicate rejection, `TreeSet` min/max and removal, `LinkedHashSet` order preservation.
- **Questions 17–20 (Map Interface):** `TreeMap` sorted keys, `HashMap` employee registry with `keySet`/`entrySet`, `TreeMap` automatic key sorting, `HashMap` vs `LinkedHashMap` iteration order comparison.
- **Questions 21–26 (Queue, Stack & Deque):** Ticket booking simulation with `Queue` (`LinkedList`), `PriorityQueue` task manager, `java.util.Stack` operations, `ArrayDeque` double-ended operations, palindrome check with `Deque`, simple Queue with `LinkedList`.
- **Questions 27–29 (Concurrency & Thread-Safety):** `Vector` multithreaded thread-safety, `ConcurrentHashMap` concurrent modification safety, `CopyOnWriteArrayList` concurrent iteration and modification.
- **Questions 30–33 (Collections Utilities):** `Collections.shuffle` and `sort`, `Collections.unmodifiableList`, `Collections.binarySearch`, `Collections.frequency`.
- **Questions 34–35 (Custom Comparators):** Custom object sorting (`Student` name & marks), Map sorting by values using a custom `Comparator`.
- **Questions 36–40 (Practical Use Cases):** LRU Cache using `LinkedHashMap`, To-Do List application using `ArrayList`, character frequency counter with `HashMap`, Student gradebook using `TreeMap`, merging and sorting `PriorityQueue` instances.
- **Questions 41–45 (Advanced Questions):** Generic `MultiMap<K, V>` with `HashMap<K, List<V>>`, simple banking system with `Map`, `WeakHashMap` garbage collection demonstration, Book Catalog system with `HashMap`, product catalog in `TreeMap` sorted by name.
- **Theory Answers:** Full documented answers in [Module04_Theory_Answers.md](file:///Users/rudrarana/java%20assingment/Module04/Module04_Theory_Answers.md).

---

## Module 5: Java Annotations, Reflection & Maven Framework

### Coding Implementations
- **[Question 17](file:///Users/rudrarana/java%20assingment/Module05/Question17_StringLengthValidator/Main.java):** Custom `@StringLength(min, max)` validator.
- **[Question 18](file:///Users/rudrarana/java%20assingment/Module05/Question18_RepeatableAnnotations/Main.java):** Java 8 `@Repeatable` annotations with container.
- **[Question 21](file:///Users/rudrarana/java%20assingment/Module05/Question21_MinLengthAnnotation/Main.java):** Custom `@MinLength` string validator.
- **[Question 22](file:///Users/rudrarana/java%20assingment/Module05/Question22_AuthorVersionAnnotation/Main.java):** Custom `@ClassInfo` specifying author and version.
- **[Question 25](file:///Users/rudrarana/java%20assingment/Module05/Question25_ArrayParametersAnnotation/Main.java):** Annotation with array parameters handling.
- **[Question 26](file:///Users/rudrarana/java%20assingment/Module05/Question26_JsonFieldAnnotation/Main.java):** Custom `@JsonField` serialization engine.
- **[Question 28](file:///Users/rudrarana/java%20assingment/Module05/Question28_ReflectionAnnotationProcessor/Main.java):** Reflection processor dynamically invoking methods sorted by annotation priority.
- **[Question 29](file:///Users/rudrarana/java%20assingment/Module05/Question29_MethodExecutionTime/Main.java):** `@LogExecutionTime` method timer.

### Practical Maven Exercises
- **[Exercise 1](file:///Users/rudrarana/java%20assingment/Module05/Exercise01_AnnotationValidation):** Maven project for user input validation with custom annotations.
- **[Exercise 2](file:///Users/rudrarana/java%20assingment/Module05/Exercise02_TransitiveDependencies):** Maven project managing transitive dependencies and exclusions.
- **[Exercise 3](file:///Users/rudrarana/java%20assingment/Module05/Exercise03_CustomAnnotationsApp):** Core Java application combining custom annotations and Maven build.
- **[Exercise 4](file:///Users/rudrarana/java%20assingment/Module05/Exercise04_WebApplicationWar):** Web application configured with `maven-war-plugin` and `web.xml`.
- **[Exercise 5](file:///Users/rudrarana/java%20assingment/Module05/Exercise05_MultiModuleProject):** Multi-module Maven project with parent POM, `core-module`, and `service-module`.

### Comprehensive Theoretical Solutions
- Complete answers to all 50 questions in [Module05_Theory_Answers.md](file:///Users/rudrarana/java%20assingment/Module05/Module05_Theory_Answers.md).

---

## How to Compile and Run

Navigate to any question or exercise directory:

```bash
# Standalone Module 5 program
cd Module05/Question26_JsonFieldAnnotation
javac Main.java
java Main

# Module 5 Maven Exercise 1
cd Module05/Exercise01_AnnotationValidation/src/main/java
javac com/assignment/validation/*.java
java com.assignment.validation.Main

# Module 5 Multi-Module Exercise 5
cd Module05/Exercise05_MultiModuleProject
javac core-module/src/main/java/com/assignment/core/*.java
javac -cp core-module/src/main/java service-module/src/main/java/com/assignment/service/*.java
java -cp core-module/src/main/java:service-module/src/main/java com.assignment.service.ServiceApp
```
