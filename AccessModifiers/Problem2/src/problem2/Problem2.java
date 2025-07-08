/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a BankAccount class with a private balance variable and public methods to deposit and withdraw.
        Scanner input = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        String ans;
        do 
        {
            System.out.print("Your options: \n1. Deposit Money \n2. Withdraw money \nSelect your purpose: ");
            int opt = input.nextInt();
            switch (opt)
            {
                case 1 -> ba.Deposit();
                case 2 -> ba.Withdraw();
                default -> System.out.println("Invalid option");
            }
            System.out.print("Do you want to do any action again: ");
            ans = input.next();
        }
        while ("yes".equals(ans) || "YES".equals(ans));
    }
    
}
