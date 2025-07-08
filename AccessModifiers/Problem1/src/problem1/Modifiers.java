/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem1;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Modifiers {
    Scanner input = new Scanner(System.in);
    
    public String FirstName;
    private String LastName;
    protected String Subject1;
    String Subject2;
    
    public void InputModifers()
    {
        System.out.print("Enter First Name (public): ");
        FirstName = input.next();
        System.out.print("Enter Last Name (private): ");
        LastName = input.next();
        System.out.print("Enter Subject 1 (protected): ");
        Subject1 = input.next();
        System.out.print("Enter Subject 2 (default): ");
        Subject2 = input.next();
        
    }
}
