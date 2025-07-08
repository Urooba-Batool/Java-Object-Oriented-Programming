# 📘 Access Modifiers

This folder contains problems and solutions related to **Access Modifiers** in Java.

---

## 📝 Definition

- **Access Modifiers** in Java are keywords that set the accessibility (visibility) of classes, methods, and variables.

---

## 🎯 Purpose

✅ To control which parts of the code can access a particular class or member.  
✅ To implement encapsulation and secure data.  

---

## ⚙️ How it works

- Java provides 4 types of access modifiers:
  - `private`: accessible only within the class.
  - `default` (no modifier): accessible within the same package.
  - `protected`: accessible within the same package & in subclasses.
  - `public`: accessible from anywhere.

**Example:**
```java
public class Test {
    private int a;
    protected int b;
    public int c;
}
```

---

## 📚 Problems: 
- Define a class with public, private, protected, and default variables. Try accessing them from another class.
- Write a BankAccount class with a private balance variable and public methods to deposit and withdraw.
