# 📘 Constructors

This folder contains problems and solutions related to Constructors in Java.

---

## 📝 Definition

A **Constructor** in Java is a special method that is called when an object is created.
It has the same name as the class and does not have a return type.

---

## 🎯 Purpose

✅ To initialize objects with specific values at the time of creation.
✅ To simplify and standardize the process of setting up objects.
✅ To avoid calling setter methods repeatedly after creating an object.

---

## ⚙️ How it works

When you create an object using the new keyword, the constructor of the class is automatically invoked.
If no constructor is explicitly defined, Java provides a default constructor with no parameters.
You can define:
- Default Constructor: No parameters, initializes to default values.
- Parameterized Constructor: Takes arguments to initialize with specific values.
- Copy Constructor (optional): Initializes an object as a copy of another object.

---

## 🔷 Types of Constructors

| Type                    | Description                                  | Example                               |
|--------------------------|----------------------------------------------|---------------------------------------|
| **Default Constructor**   | Provided by Java or explicitly written with no arguments | `Student() { }`                      |
| **Parameterized Constructor** | Takes parameters to set specific values     | `Student(String name) { this.name = name; }` |
| **Copy Constructor**       | Copies the values from another object       | `Student(Student s) { this.name = s.name; }` |

---

**Example:**
```java
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();               // calls default
        Student s2 = new Student("Ali", 20);     // calls parameterized
        s1.display();
        s2.display();
    }
}
```

---

## 📚 Problems:
- Create a class Person with a default constructor that prints “Person created.”
- Add a parameterized constructor to initialize name and age.
