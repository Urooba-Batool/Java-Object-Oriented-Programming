/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem1;

/**
 *
 * @author admin
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problem: Define a class with public, private, protected, and default variables. Try accessing them from another class.

        Modifiers am = new Modifiers();

        am.InputModifers();
        
        // Accessing variables
        System.out.println("Public: " + am.FirstName);          
        System.out.println("Private: Cannot be access due tu private modifiers");     
        System.out.println("Protected: " + am.Subject1);    
        System.out.println("Default: " + am.Subject2); 
    }
    
}
