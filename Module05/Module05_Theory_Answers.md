# Module 5: Java Annotations & Maven Framework - Complete Answers (Questions 1 - 50)

**Student Name:** Rudra Rana  
**Enrollment Number:** A023119824067  

---

## Part 1: Java Annotations and Its Types

### 1. What is the purpose of annotations in Java?
Annotations provide structured metadata about program elements (classes, methods, fields, parameters) without directly modifying program logic. They are used for:
- **Compiler instructions:** Detecting errors or suppressing warnings (e.g., `@Override`, `@SuppressWarnings`).
- **Compile-time and deployment-time processing:** Code generation, XML generation, and bytecode enhancement (e.g., Lombok, Dagger).
- **Runtime processing:** Framework-driven configuration and reflection (e.g., Spring Dependency Injection, Hibernate ORM, JUnit).

### 2. Name three built-in Java annotations and their uses.
1. `@Override`: Instructs the compiler to verify that the annotated method overrides a declaration in a superclass or interface.
2. `@Deprecated`: Marks an API as obsolete and advises against its use, generating compiler warnings.
3. `@SuppressWarnings`: Tells the compiler to suppress specific warnings (e.g., `unchecked`, `deprecation`) in the annotated element.

### 3. What is the difference between @Override and @Deprecated annotations?
- **`@Override`:** A compile-time validation check ensuring signature conformity with a supertype method. It prevents accidental method overloading instead of overriding.
- **`@Deprecated`:** An informational marker indicating that the annotated element is deprecated and may be removed in future versions.

### 4. How does the @SuppressWarnings annotation work? Provide an example.
`@SuppressWarnings` informs the compiler to silence warnings that match the specified warning category string:
```java
@SuppressWarnings("unchecked")
public void addItems(List rawList) {
    rawList.add("Item");
}
```

### 5. What are meta-annotations in Java?
Meta-annotations are annotations applied to custom annotation definitions. They define how and where an annotation can be used, stored, and inherited.

### 6. List the meta-annotations available in Java and describe their purposes.
1. `@Target`: Specifies the Java elements (e.g., `TYPE`, `METHOD`, `FIELD`, `PARAMETER`) to which the annotation can be applied.
2. `@Retention`: Defines how long the annotation is retained (`SOURCE`, `CLASS`, or `RUNTIME`).
3. `@Documented`: Indicates that elements using this annotation should appear in generated Javadoc.
4. `@Inherited`: Allows subclasses to inherit the annotation from their superclass.
5. `@Repeatable`: Allows applying the same annotation multiple times to a single declaration.

### 7. How can annotations affect runtime behavior in Java?
Annotations with `@Retention(RetentionPolicy.RUNTIME)` can be inspected via Java Reflection (`Class.getAnnotation()`, `Method.getAnnotations()`). Frameworks like Spring and Hibernate inspect these annotations at runtime to inject dependencies, manage transactions, configure routing, and map relational tables.

### 8. What is the retention policy in annotations? Explain the types of retention policies.
The retention policy dictates the lifecycle of an annotation:
- **`SOURCE`:** Discarded by the compiler; not included in compiled `.class` files (e.g., `@Override`, `@SuppressWarnings`).
- **`CLASS` (Default):** Recorded in the `.class` file by the compiler, but not loaded into the JVM at runtime. Useful for bytecode analysis tools.
- **`RUNTIME`:** Recorded in the `.class` file and retained by the JVM at runtime, making it accessible through reflection.

### 9. How do you create a custom annotation in Java?
Use the `@interface` keyword with appropriate meta-annotations:
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Transactional {
    int timeout() default 30;
}
```

### 10. What is the use of the @Target meta-annotation?
`@Target` restricts which Java language constructs can be annotated. It accepts an array of `ElementType` values, including:
- `ElementType.TYPE`: Classes, interfaces, enums, records.
- `ElementType.METHOD`: Methods.
- `ElementType.FIELD`: Fields and enum constants.
- `ElementType.PARAMETER`: Method and constructor parameters.
- `ElementType.CONSTRUCTOR`: Constructors.

### 11. Explain the difference between @Retention with RUNTIME and CLASS.
- **`CLASS`:** Stored in the compiled `.class` file by `javac`, but the JVM class loader discards it upon loading. It cannot be queried at runtime using reflection.
- **`RUNTIME`:** Stored in the `.class` file AND loaded into JVM memory, making it discoverable at runtime via `Reflection API`.

### 12. How can you use reflection to process annotations in Java?
Use reflection methods from `java.lang.reflect.AnnotatedElement`:
```java
Class<?> clazz = MyClass.class;
if (clazz.isAnnotationPresent(MyAnnotation.class)) {
    MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
    System.out.println(annotation.value());
}
```

### 13. What is the difference between marker annotations and single-value annotations?
- **Marker Annotation:** Contains no elements/attributes (e.g., `@Override`, `@Serializable`). Presence alone conveys information.
- **Single-value Annotation:** Contains a single element named `value()`, allowing concise shorthand syntax (e.g., `@SuppressWarnings("unchecked")` instead of `@SuppressWarnings(value = "unchecked")`).

### 14. How do annotations integrate with frameworks like Spring and Hibernate?
- **Spring:** Uses annotations like `@Component`, `@Autowired`, `@Service`, and `@Transactional` to register beans, wire dependencies, and apply AOP transaction management dynamically via reflection and proxies.
- **Hibernate:** Uses JPA annotations like `@Entity`, `@Table`, `@Id`, `@Column`, and `@OneToMany` to map Java domain models to relational database tables without external XML configuration.

### 15. Can annotations be inherited? If yes, how?
Yes, annotations on classes can be inherited by subclasses if the annotation definition is annotated with the `@Inherited` meta-annotation. Note that `@Inherited` only applies to class-level annotations, not to interfaces, methods, or fields.

### 16. What is the use of default values in annotations? Provide an example.
Default values allow attributes to be optional when applying the annotation:
```java
@interface Config {
    String host() default "localhost";
    int port() default 8080;
}
// Usage without specifying defaults:
@Config
class Server {}
```

### 17. Write a custom annotation to validate the length of a string.
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StringLength {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}
```
*(Demonstrated in `Module05/Question17_StringLengthValidator`)*

### 18. What are repeatable annotations in Java? Provide an example.
Introduced in Java 8, `@Repeatable` allows an annotation to be declared multiple times on the same element, backed by a container annotation:
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles { Role[] value(); }

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role { String value(); }

@Role("ADMIN")
@Role("USER")
class Dashboard {}
```

### 19. How does the @Documented meta-annotation work?
When an annotation is marked with `@Documented`, Javadoc includes the annotation in the generated documentation for any element to which the annotation is applied.

### 20. How are annotations processed during the compilation phase?
Java provides the **Pluggable Annotation Processing API** (`javax.annotation.processing.Processor`). The compiler discovers registered processors, inspects annotations on syntax trees, and can generate new source files or resources before compiling bytecode.

---

## Part 2: Creating Custom Annotations

### 21. Create a custom annotation @MinLength to validate the minimum length of a string in a Java class.
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MinLength {
    int value() default 5;
}
```
*(Demonstrated in `Module05/Question21_MinLengthAnnotation`)*

### 22. Write a custom annotation to specify the author and version of a class.
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassInfo {
    String author();
    String version() default "1.0";
}
```
*(Demonstrated in `Module05/Question22_AuthorVersionAnnotation`)*

### 23. How do you process custom annotations using Java's Annotation interface?
All annotations implicitly extend `java.lang.annotation.Annotation`. Any reflected element implements `AnnotatedElement`, enabling calls like `isAnnotationPresent()` and `getAnnotation()` to read and process attributes.

### 24. What are the restrictions on defining annotation methods?
- Return types are restricted to: primitive types (`int`, `boolean`, etc.), `String`, `Class`, `enum` types, other annotation types, and 1D arrays of these types.
- Methods cannot declare parameters (`no-arg`).
- Methods cannot have `throws` clauses.
- Methods cannot be generic (`<T>`).

### 25. Can annotations take arrays as parameters? Provide an example.
Yes, an annotation attribute can be a single-dimensional array:
```java
@interface SecurityRoles {
    String[] roles() default {};
}

@SecurityRoles(roles = {"ADMIN", "SUPERVISOR"})
class ControlPanel {}
```
*(Demonstrated in `Module05/Question25_ArrayParametersAnnotation`)*

### 26. Create a custom annotation @JsonField to specify field names for JSON serialization.
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
    String name();
}
```
*(Demonstrated in `Module05/Question26_JsonFieldAnnotation`)*

### 27. Can a custom annotation extend another annotation? Why or why not?
No. In Java, annotations implicitly extend `java.lang.annotation.Annotation`. Java does not support explicit inheritance for annotations (`@interface A extends B` is a syntax error). This restriction keeps annotations lightweight and uniform.

### 28. Write a program to demonstrate how custom annotations can be used with reflection.
Demonstrated in `Module05/Question28_ReflectionAnnotationProcessor/Main.java`, where methods annotated with `@AutoRun(priority = n)` are scanned, sorted, and dynamically invoked using reflection.

### 29. How can you define a custom annotation to log method execution time?
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {}
```
A reflection runner or Spring AOP aspect captures `System.currentTimeMillis()` before and after method invocation. *(Demonstrated in `Module05/Question29_MethodExecutionTime`)*

### 30. What happens if a custom annotation is not annotated with @Retention?
If `@Retention` is omitted, the default retention policy is `RetentionPolicy.CLASS`. The annotation is compiled into the `.class` file but is **not** loaded into the JVM runtime, meaning reflection calls at runtime will return `null`.

---

## Part 3: Maven Framework

### 31. What is the purpose of Maven in Java development?
Apache Maven is a project management and build automation tool based on the Project Object Model (POM). It standardizes project directory structure, dependency management, compilation, testing, packaging, and releases.

### 32. Explain the role of the pom.xml file in Maven.
`pom.xml` (Project Object Model) is the central configuration file. It declares:
- Project coordinates (`groupId`, `artifactId`, `version`).
- Dependencies and versions.
- Build plugins and goals.
- Build profiles, properties, and repositories.

### 33. What are the differences between the local repository, central repository, and remote repository in Maven?
- **Local Repository:** Located on the developer's machine (`~/.m2/repository`). Caches downloaded dependencies and local project artifacts.
- **Central Repository:** The public repository (`repo.maven.apache.org`) provided by the Maven community containing open-source artifacts.
- **Remote Repository:** Organization-internal repository (e.g., Nexus, Artifactory) hosting proprietary libraries and third-party dependencies.

### 34. How do you add a dependency to a Maven project? Provide an example.
Add a `<dependency>` block inside `<dependencies>` in `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```

### 35. What is the purpose of Maven plugins?
Maven is an execution engine that delegates tasks to plugins. Plugins perform compilation (`maven-compiler-plugin`), test execution (`maven-surefire-plugin`), packaging (`maven-jar-plugin`, `maven-war-plugin`), and deployment.

### 36. Explain the Maven build lifecycle.
Maven has three built-in build lifecycles:
1. **`default`:** Handles project deployment (compile, test, package, install, deploy).
2. **`clean`:** Cleans previous build outputs (`target/` directory).
3. **`site`:** Generates project documentation and reports.

### 37. What are the default phases of the Maven lifecycle?
The primary default phases executed in order are:
`validate` $\rightarrow$ `compile` $\rightarrow$ `test` $\rightarrow$ `package` $\rightarrow$ `verify` $\rightarrow$ `install` $\rightarrow$ `deploy`.

### 38. How do you configure the Java version in a Maven project?
Using properties in `pom.xml`:
```xml
<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```

### 39. What is a Maven goal, and how is it different from a phase?
- **Phase:** A stage in the build lifecycle representing a step (e.g., `compile`, `package`). Phases do not execute code directly.
- **Goal:** A specific unit of work provided by a plugin bound to a phase (e.g., `compiler:compile` bound to `compile` phase).

### 40. Write an example pom.xml file for a project using Spring Boot.
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>demo-spring-boot</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <properties>
        <java.version>17</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

---

## Part 4: Repositories, Dependencies, and Plugins

### 41. How does Maven resolve conflicts when multiple versions of a dependency are included?
Maven uses the **Dependency Mediation (Nearest Definition)** rule:
- The version declared closest to the project root in the dependency tree wins.
- If two versions are at the same depth, the first declaration in `pom.xml` wins.

### 42. What is a transitive dependency in Maven?
If project `A` depends on `B`, and `B` depends on `C`, then `C` is a transitive dependency of `A`. Maven automatically discovers and downloads transitive dependencies.

### 43. How do you exclude a specific transitive dependency in Maven?
Use the `<exclusions>` element inside the `<dependency>` declaration:
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.30</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jcl</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

### 44. What is the purpose of the maven-compiler-plugin?
The `maven-compiler-plugin` compiles project Java source code into bytecode (`.class` files), specifying Java language levels (`source` and `target` versions).

### 45. How can you use Maven to create a JAR file for your project?
Set `<packaging>jar</packaging>` (or omit it, as `jar` is default) and run:
```bash
mvn package
```
Maven binds `maven-jar-plugin:jar` to the `package` phase to package the compiled classes from `target/classes` into `target/<artifactId>-<version>.jar`.

### 46. How do you include and configure a plugin in pom.xml? Provide an example.
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>17</source>
                <target>17</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

### 47. Explain how to create a multi-module Maven project.
1. The root directory contains a parent `pom.xml` with `<packaging>pom</packaging>` and a `<modules>` list naming child directory modules.
2. The parent defines `<dependencyManagement>` to align dependency versions across modules.
3. Submodules define their own `pom.xml` referencing the `<parent>`.

### 48. What is the difference between compile, provided, and runtime dependency scopes in Maven?
- **`compile` (Default):** Available in all classpaths (compilation, testing, runtime) and packaged with the artifact.
- **`provided`:** Required for compilation and testing, but provided by the runtime environment (e.g., Servlet API provided by Tomcat); not packaged.
- **`runtime`:** Required for execution and testing, but not for compilation (e.g., JDBC drivers).

### 49. How do you deploy a Maven project to a remote repository?
Configure the `<distributionManagement>` section in `pom.xml` with repository URLs, configure authentication credentials in `~/.m2/settings.xml`, and execute:
```bash
mvn deploy
```

### 50. Write a Maven configuration to run unit tests using the maven-surefire-plugin.
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.2.2</version>
            <configuration>
                <includes>
                    <include>**/*Test.java</include>
                    <include>**/*TestCase.java</include>
                </includes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

---

## Part 5: Practical Exercises Included in Module 5

1. **`Exercise01_AnnotationValidation/`**: Custom input validator project utilizing `@NotNull` and `@MinLength`.
2. **`Exercise02_TransitiveDependencies/`**: Dependency management project demonstrating transitive dependency resolution and `<exclusions>`.
3. **`Exercise03_CustomAnnotationsApp/`**: Core Java application showcasing `@Author` and `@TrackTime` reflection processing.
4. **`Exercise04_WebApplicationWar/`**: Java Web Application configured with `maven-war-plugin` and `web.xml`.
5. **`Exercise05_MultiModuleProject/`**: Multi-module Maven setup featuring a parent POM, `core-module`, and `service-module`.
