# Module 4: Generics & Collections Framework - Theoretical Questions & Answers

**Student Name:** Rudra Rana  
**Enrollment Number:** A023119824067  

---

## 1. Generics

### What is the purpose of generics in Java, and how do they improve type safety and code reusability?
- **Type Safety:** Generics enable compile-time type checking, eliminating `ClassCastException` at runtime.
- **Elimination of Explicit Casts:** Programmers do not need to manually cast elements retrieved from collections.
- **Code Reusability:** A single generic algorithm or data structure (e.g., `List<T>`, `Box<T>`) can operate on various data types without duplicating code.

### Explain the syntax for creating a user-defined generic class in Java. Provide an example.
A generic class is defined with a type parameter inside angle brackets (`<T>`):
```java
class Container<T> {
    private T item;
    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}
```

### How do bounded type parameters work in generics? Write a generic class that accepts only subclasses of Number.
Bounded type parameters restrict the types that can be used as type arguments using the `extends` keyword (e.g., `<T extends Number>`).
```java
class NumericBox<T extends Number> {
    private T val;
    public NumericBox(T val) { this.val = val; }
    public double toDouble() { return val.doubleValue(); }
}
```

### What is the difference between `? extends T` and `? super T` in generics? Provide an example of when to use each.
- **`? extends T` (Upper Bounded Wildcard):** Restricts the unknown type to be a specific type or a subtype of `T`. Follows the **PECS** rule (**Producer Extends**). Used when reading data from a structure.
- **`? super T` (Lower Bounded Wildcard):** Restricts the unknown type to be a specific type or a supertype of `T`. Follows the **Consumer Super** rule. Used when writing data into a structure.

### How do raw types differ from parameterized types in generics, and why should raw types be avoided?
- **Raw Types:** Using a generic type without type arguments (e.g., `List list = new ArrayList()`).
- **Parameterized Types:** Specifying exact type parameters (e.g., `List<String> list = new ArrayList<>()`).
- **Why Avoid Raw Types:** Raw types bypass compile-time type checks, reintroducing unsafe implicit casting and potential runtime `ClassCastException`. They are kept solely for backward compatibility with pre-Java 5 code.

---

## 2. Java.util Package and Collection Framework

### What is the java.util package, and why is it essential in Java programming?
`java.util` contains utility classes, the Collection Framework, date/time facilities, random number generators, string tokenizers, and concurrent collections essential for everyday software development.

### What are the key features of the Collection Framework in java.util?
1. Unified architecture for storing and manipulating groups of objects.
2. High-performance, tested, and reusable data structures.
3. Interoperability between unrelated APIs via common interfaces (`Collection`, `List`, `Set`, `Map`).
4. Extensible design allowing custom implementations.

### Explain the differences between Collection and Collections in java.util.
- **`Collection`:** The root interface for collections (`List`, `Set`, `Queue`).
- **`Collections`:** A utility class containing static methods (`sort()`, `shuffle()`, `binarySearch()`, `unmodifiableList()`) that operate on or return collections.

### What is the role of the Iterator interface in the java.util package?
`Iterator` provides a standard mechanism to traverse collections sequentially with methods `hasNext()`, `next()`, and safely remove elements during traversal via `remove()`.

### What is the purpose of the Comparator and Comparable interfaces in the java.util package?
- **`Comparable<T>`:** Defines natural ordering for objects by implementing `compareTo(T o)` within the object's class.
- **`Comparator<T>`:** Defines external/custom ordering strategies by implementing `compare(T o1, T o2)` in a separate class or lambda.

### What are the key interfaces in the Java Collection Framework, and how are they related?
- `Iterable` (Root) $\rightarrow$ `Collection`
  - $\rightarrow$ `List` (ordered, indexed, duplicates allowed)
  - $\rightarrow$ `Set` (unique elements, no index)
    - $\rightarrow$ `SortedSet` $\rightarrow$ `NavigableSet`
  - $\rightarrow$ `Queue` (FIFO ordering) $\rightarrow$ `Deque` (double-ended queue)
- `Map` (Key-Value pairs, independent of `Collection` hierarchy)
  - $\rightarrow$ `SortedMap` $\rightarrow$ `NavigableMap`

### What is the difference between Collection and Map interfaces in Java?
- **`Collection`:** Stores individual elements (`E`).
- **`Map`:** Stores key-value mappings (`K, V`) where keys must be unique.

### Explain the differences between Set, List, and Queue in the Collection Framework.
- **`List`:** Ordered sequence, accessible by index, allows duplicate elements.
- **`Set`:** Unordered collection (unless sorted or linked), guarantees uniqueness of elements.
- **`Queue`:** Designed to hold elements prior to processing, typically following FIFO order.

### What is the significance of the Iterable interface, and how is it used in the Collection Framework?
`Iterable<T>` is the super-interface of `Collection`. It declares `iterator()`, enabling any implementing collection to be traversed using Java's enhanced for-each loop (`for (T item : collection)`).

### What are the benefits of using the Collection Framework over arrays?
1. Dynamic resizing (arrays are fixed-size).
2. Rich built-in algorithms (sorting, searching, shuffling).
3. Type safety with Generics.
4. Support for complex data relationships (Sets, Maps, Priority Queues).

---

## 3. List Interface

### What is the List interface, and how does it differ from the Set interface?
`List` preserves element insertion order and permits duplicates, offering index-based access (`get(i)`, `set(i, val)`). `Set` enforces uniqueness and does not support index-based access.

### What is the difference between ArrayList and LinkedList in terms of performance and usage?
- **`ArrayList`:** Backed by a dynamic array. Fast random access ($O(1)$ `get`), slower insertions/deletions in the middle/beginning ($O(n)$ due to array shifting).
- **`LinkedList`:** Backed by a doubly linked list. Fast insertion/deletion at heads/tails ($O(1)$), slower indexed access ($O(n)$ due to traversal).

### What is the role of the Vector class, and how does it differ from ArrayList?
`Vector` is a legacy synchronized dynamic array. Every method in `Vector` is synchronized, incurring synchronization overhead even in single-threaded contexts. `ArrayList` is unsynchronized and preferred unless thread-safety is required.

### How is the Stack class implemented, and how does it relate to the List interface?
`java.util.Stack` extends `Vector`. Because it inherits from `Vector` (and thus `List`), it inadvertently exposes non-stack operations like inserting at arbitrary indices (`add(index, element)`). Modern code prefers `Deque` (e.g., `ArrayDeque`) for LIFO stacks.

---

## 4. Set Interface

### What is the Set interface, and how is it different from List?
A `Set` represents a mathematical set containing no duplicate elements (`add()` returns `false` if the element is already present), whereas a `List` maintains sequential order and allows duplicates.

### What is the difference between HashSet, LinkedHashSet, and TreeSet in Java?
- **`HashSet`:** Backed by a hash table. Best performance ($O(1)$ operations), provides no ordering guarantee.
- **`LinkedHashSet`:** Hash table + doubly linked list. Maintains insertion order with near $O(1)$ performance.
- **`TreeSet`:** Backed by a Red-Black tree. Maintains natural or comparator-defined sorted order ($O(\log n)$ operations).

### How does HashSet handle duplicate elements? Explain with an example.
`HashSet` delegates to an internal `HashMap`. When adding an element, it computes its hash code and bucket index. If a matching element exists (verified by `hashCode()` and `equals()`), the element is not added, and `add()` returns `false`.

### What is the significance of equals() and hashCode() methods in HashSet?
To correctly identify duplicates, objects placed in a `HashSet` must follow the `hashCode()` and `equals()` contract:
1. If `o1.equals(o2)` is true, `o1.hashCode() == o2.hashCode()` must be true.
2. Inconsistent overrides can lead to duplicate entries or elements becoming unreachable.

---

## 5. Map Interface

### What is the Map interface in Java, and how is it different from Collection?
`Map` maps keys to values and is not a subtype of `Collection`. It provides collection views for keys (`keySet()`), values (`values()`), and entries (`entrySet()`).

### What is the difference between HashMap, LinkedHashMap, and TreeMap?
- **`HashMap`:** Unordered, constant-time $O(1)$ performance.
- **`LinkedHashMap`:** Preserves insertion order (or access order for LRU caches).
- **`TreeMap`:** Red-Black tree implementation, sorts keys in natural or specified order ($O(\log n)$).

### How does HashMap handle collisions?
Java uses separate chaining:
- Prior to Java 8, colliding keys were linked via a singly linked list in the bucket.
- Since Java 8, when a bucket exceeds 8 entries (and total table size $\ge 64$), the bucket converts into a balanced Red-Black tree, improving worst-case search from $O(n)$ to $O(\log n)$.

### What is the difference between Hashtable and HashMap? Why is Hashtable considered legacy?
`Hashtable` is legacy:
1. Synchronized on every method (slow).
2. Does not permit `null` keys or values (whereas `HashMap` permits one `null` key and multiple `null` values).
3. Superseded by `HashMap` (for single-thread) and `ConcurrentHashMap` (for multi-thread).

---

## 6. Specialized Classes

### What is the purpose of the PriorityQueue class in Java?
`PriorityQueue` implements a min-heap (or max-heap via custom comparator) where elements are processed based on priority rather than FIFO insertion order.

### How is the Deque interface different from the Queue interface?
`Queue` only allows operations at the front (FIFO). `Deque` (Double Ended Queue) allows insertions, removals, and peeks at both the front and back.

### What is the difference between BlockingQueue and PriorityQueue?
- `PriorityQueue` is unbounded and unsynchronized.
- `BlockingQueue` (from `java.util.concurrent`) supports thread-safe blocking operations: threads wait for the queue to become non-empty on retrieval, and wait for space on insertion.

### What is the role of WeakHashMap in Java, and how is it different from HashMap?
In `WeakHashMap`, keys are stored as `WeakReference`s. When a key is no longer strongly referenced outside the map, the garbage collector reclaims it, and its entry is automatically removed from the map.

---

## 7. Concurrency & Thread-Safety

### How is Vector different from ArrayList in terms of thread safety?
`Vector` is thread-safe because its methods are marked `synchronized`. `ArrayList` is not thread-safe.

### What is the role of ConcurrentHashMap in Java, and how does it achieve thread safety?
`ConcurrentHashMap` provides high concurrency without locking the entire map. In Java 8+, it uses lock-free reads, CAS (Compare-And-Swap) operations, and fine-grained bucket-level synchronization (`synchronized` on individual bucket heads).

### What are the differences between CopyOnWriteArrayList and ArrayList?
`CopyOnWriteArrayList` creates a fresh copy of the underlying array whenever a mutating operation (`add()`, `set()`, `remove()`) occurs. It allows concurrent, lock-free iteration that never throws `ConcurrentModificationException`.

### What is the difference between synchronizedCollection and ConcurrentHashMap?
`Collections.synchronizedMap` locks the entire collection on every access with a single mutex. `ConcurrentHashMap` uses granular bucket-level locking, enabling simultaneous read and write operations by multiple threads.

---

## 8. Utility Methods in Collections Class

### What are some commonly used methods in the Collections utility class?
- `Collections.sort(List)`: Sorts a list in natural or specified order.
- `Collections.shuffle(List)`: Randomizes list element ordering.
- `Collections.binarySearch(List, key)`: Finds element index in sorted list in $O(\log n)$.
- `Collections.reverse(List)`: Reverses list elements.
- `Collections.frequency(Collection, obj)`: Counts occurrences of an element.
- `Collections.min(Collection)` / `Collections.max(Collection)`: Finds minimum / maximum.

### How can you make a collection thread-safe using the Collections class?
Using wrapper methods:
- `Collections.synchronizedList(list)`
- `Collections.synchronizedSet(set)`
- `Collections.synchronizedMap(map)`
