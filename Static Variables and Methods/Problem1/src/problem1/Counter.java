/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem1;

/**
 *
 * @author admin
 */
public class Counter {
    // static variable to count objects
    static int counter = 0;  

    Counter() 
    {
        // increment when an object is created
        counter++;  
        System.out.println("Object created. Total: " + counter);
    }
}
