# 📘 Inheritance

This folder contains problems and solutions related to **Inheritance** in Java.

---

## 📝 Definition

- **Inheritance** is a mechanism in Java where one class (the child or subclass) can acquire the fields and methods of another class (the parent or superclass).

---

## 🎯 Purpose

✅ To promote **code reuse** — common code is written once in the parent and reused in children.  
✅ To establish an **is-a relationship** between classes.  
✅ To make programs easier to extend and maintain.  

---

## ⚙️ How it works

- The `extends` keyword is used to create a subclass.
- The subclass inherits all **non-private** fields and methods of the parent class.
- Constructors are not inherited but can be called using `super()`.
- The subclass can also **override** methods of the parent class (see Method Overriding).

**Example:**
```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // inherited from Animal
        dog.bark(); // defined in Dog
    }
}
```

---

## 📚 Problems
- Create a Shape class with a draw method and override it in Circle, Rectangle, etc.
