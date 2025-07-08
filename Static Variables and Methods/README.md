# 📘 Static Variables and Methods

This folder contains problems and solutions related to **Static Variables and Methods** in Java.

---

## 📝 Definition

- In Java, the keyword **`static`** indicates that a member (variable or method) belongs to the class, rather than to any specific object of the class.
- Static members are shared by all objects of the class.

---

## 🎯 Purpose

✅ To share data among all instances of a class.  
✅ To access members without creating an instance of the class.  
✅ To create utility or helper methods that don’t depend on object state.  
✅ To save memory since static members are loaded only once at class loading time.

---

## ⚙️ How it works

- When you declare a **static variable**, it is initialized once and shared by all instances of the class.  
- A **static method** can be called without creating an object of the class.
- Static methods can only directly access other static members (variables and methods) of the class.

**Key Notes:**
- Static members belong to the **class** — not to objects.
- You can access them using the class name: `ClassName.memberName`.
- Static methods **cannot use `this` or `super`** because they are not tied to any object.

---

## 🔷 Example

```java
class Counter {
    static int count = 0; // static variable

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }

    static void displayCount() { // static method
        System.out.println("Final Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Calling static method
        Counter.displayCount();
    }
}
```

---

## 📚 Problems:
- Create a class with a static counter that counts how many objects have been created.
- Write a class with a static method to print a welcome message.
