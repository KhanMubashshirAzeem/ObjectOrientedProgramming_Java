
# Object-Oriented Programming (OOP) Concepts in Java 🚀

I've organized my exploration of Object-Oriented Programming (OOP) in Java into distinct packages for each concept to enhance understanding. Each package focuses on a specific OOP principle, and I've added comments throughout the code to ensure clarity and ease of learning. Here's what I've covered so far:

### [OOPS Concepts in Java PDF Download.pdf](https://github.com/KhanMubashshirAzeem/ObjectOrientedProgramming_Java/blob/master/src/OOPS%20Concepts%20in%20Java%20PDF%20Download.pdf)

### 📚 Topics Completed

#### Abstract
- **Abstract Method**: Understanding the role of abstract methods in defining a method without implementation, to be overridden in subclasses.
- **Abstract Class**: Exploring the concept of abstract classes, which cannot be instantiated and often contain abstract methods.

#### Access Modifiers
<img src="https://github.com/user-attachments/assets/3bdcf90a-3d39-43c7-9a7f-5dd25da1a92a" alt="Access Modifiers" width="500"/>

- **Public Modifier (Access: Everywhere)**: Allows classes, methods, and variables to be accessed from any other class.
- **Private Modifier (Access: Within Class)**: Restricts access to the class itself, ensuring that only the class can access its methods and variables.
- **Protected Modifier (Access: Package & Subclasses)**: Allows access to methods and variables by classes in the same package or subclasses.
- **Default Access Modifier (Access: Package)**: Grants access to methods and variables only within the same package.

#### Interface
- **Interface**: Interfaces define a contract for what a class can do without specifying how it does it. They are a key part of Java’s multiple inheritance solution, allowing a class to implement multiple interfaces. This is powerful for designing systems that are modular and decoupled.

#### Encapsulation
- **Encapsulation**: Encapsulation ensures that "sensitive" data is hidden from users. It’s implemented by declaring class variables as private and providing public getter and setter methods. This design principle helps maintain control over the data and reduces the risk of unintended interference.

#### Inheritance
- **Inheritance**: Inheritance is a fundamental concept where one class (the child or subclass) acquires the properties and behaviors (methods and fields) of another class (the parent or superclass). This promotes code reuse and establishes a natural hierarchy among classes.

<img src="https://github.com/user-attachments/assets/fd8c813e-c7ab-47f3-a5c1-ce810f66aa12" alt="Types of Inheritance" width="500"/>

### **Inheritance**
Inheritance is when a class (subclass or child) acquires properties and behaviors from another class (superclass or parent). This allows code reuse and establishes a hierarchy among classes.

- **Types of Inheritance**:
  1. **Single Inheritance**: A subclass inherits from one superclass.
  2. **Multiple Inheritance**: A class inherits from more than one class (not supported by Java with classes but possible with interfaces).
  3. **Multilevel Inheritance**: A class inherits from a class that is itself a subclass.
  4. **Hierarchical Inheritance**: Multiple classes inherit from a single superclass.
  5. **Hybrid Inheritance**: A combination of multiple inheritance types (achieved through interfaces in Java).

### **Polymorphism**
Polymorphism allows one interface to be used for different data types. It mainly occurs through method overloading or method overriding.

- **Method Overloading**: Defining multiple methods with the same name but different parameters within the same class.

  **Types of Method Overloading**:
  1. **Changing the Number of Parameters**: Methods have the same name but differ in the number of parameters.
  2. **Changing Data Types of the Arguments**: Methods have the same name and parameter count but different data types.
  3. **Changing the Order of the Parameters**: Methods have the same name and parameter count but differ in the order of the parameters.
 
- **[Type Conversion](https://www.geeksforgeeks.org/type-conversion-java-examples/)**
- Type Conversion but to a higher type(in terms of range) in the same family.
- Type conversion to the next higher family(suppose if there is no long data type available for an int data type, then it will search for the float data type).
  
<img src="https://github.com/user-attachments/assets/e85fa7bf-2640-42c3-85f3-4f19922f199b" alt="Method Overloading in Java" width="500"/>



These additions further solidify your understanding of OOP principles and how they enhance Java programming through code reuse, flexibility, and modular design.
---

These concepts are neatly packaged and documented to make it easier to grasp and apply. 📦💡
