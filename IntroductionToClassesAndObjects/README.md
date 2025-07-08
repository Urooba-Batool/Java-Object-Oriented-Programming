# 📘 Introduction to Classes & Objects

This folder contains problems and solutions related to **Classes and Objects** in Java.

---

## 📝 Definition

- A **Class** is a blueprint or template that defines the attributes (variables) and behaviors (methods) common to all objects of that type.
- An **Object** is an instance of a class — it represents a real-world entity with its own state and behavior.

---

## 🎯 Purpose

✅ To model real-world entities in code.  
✅ To organize code and make it reusable.  
✅ To follow Object-Oriented Programming principles.  

---

## ⚙️ How it works

- You first **define a class** which contains variables and methods.
- Then you **create objects** (instances) of the class using the `new` keyword.
- Each object has its own copy of the instance variables.

--- 

**Example:**
```java
class Car {
    String color;
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();   // creating object
        myCar.color = "Red";
        myCar.drive();
    }
}
```

---

## 📚 Problems: 
- Create a Book class with attributes: title, author, and price. Instantiate two books and print their details.
- Write a Car class that can display the model and year of a car.
- Create a Student class with a method to calculate and display the percentage based on marks.
