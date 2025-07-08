/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem2;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class BankAccount {
    Scanner input = new Scanner(System.in);
    
    private double balance = 5000;
    private double amount;
            
    public void Deposit()
    {
        System.out.print("Enter the amount you want to deposit: ");
        amount = input.nextDouble();
        balance += amount;
        System.out.println("Your new balance is: RS "+balance);
    }
    
    public void Withdraw()
    {
        System.out.print("Enter the amount you want to deposit: ");
        amount = input.nextDouble();
        if(amount < balance)
        {
            balance -= amount;
            System.out.println("Your new balance is: RS "+balance);
        }
        else
        {
            System.out.println("You dont have enough balance");
        }
    }
}
