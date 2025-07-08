/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem1;

/**
 *
 * @author admin
 */
public class Addition {
    
    //method overloading means to create multiple method with same name but with different number of parameters or different data types of parameters
    public void Add(int a, int b)
    {
        int result = a + b;
        System.out.println("The result is "+result);
    }
    public void Add(double a, double b)
    {
        double result = a + b;
        System.out.println("The result is "+result);
    }
    
    
}
