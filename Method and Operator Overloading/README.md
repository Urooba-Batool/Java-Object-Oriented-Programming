# 📘 Method and Operator Overloading

This folder contains problems and solutions related to **Method Overloading** and (conceptually) **Operator Overloading** in Java.

---

## 📝 Definition

- **Method Overloading**: defining multiple methods in the same class with the same name but different parameter lists (number, type, or order of parameters).
- **Operator Overloading**: Java does *not* directly support operator overloading (unlike C++), except for the `+` operator for `String` concatenation.

---

## 🎯 Purpose

✅ To increase the readability and flexibility of the code.  
✅ To perform similar operations with different kinds or numbers of inputs.  
✅ To achieve **compile-time polymorphism** — the method to execute is determined at compile time.  

---

## ⚙️ How it works

### Method Overloading
- Methods must have the **same name** but **different signatures** (different number or types of parameters).
- Return type can be different, but it alone does not distinguish overloaded methods.

**Example:**
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));         // calls add(int, int)
        System.out.println(calc.add(2.5, 3.5));     // calls add(double, double)
        System.out.println(calc.add(1, 2, 3));      // calls add(int, int, int)
    }
}
```

---

## 📚 Problems:
- Create a class with two methods named add, one adds two integers, the other adds two doubles.
- Create a Calculator class and overload a method multiply for two and three arguments.
