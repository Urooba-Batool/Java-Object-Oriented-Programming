/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg1;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        // Problem: Create a Book class with attributes: title, author, and price. Instantiate two books and print their details.
        
        // a java class for taking inputs
        Scanner input = new Scanner(System.in);
        
        // making the object of the class
        Book b1 = new Book();
        Book b2 = new Book();
        
        // asking for inputs of book 1 from the user
        System.out.print("Enter book title = ");
        b1.BookTitle = input.next();
        System.out.print("Enter book author = ");
        b1.BookAuthor = input.next();
        System.out.print("Enter book price = ");
        b1.BookPrice = input.nextDouble();
        
        System.out.print("---------------------------------------------------\n");
        
        // asking for inputs of book 2 from the user
        System.out.print("Enter book title = ");
        b2.BookTitle = input.next();
        System.out.print("Enter book author = ");
        b2.BookAuthor = input.next();
        System.out.print("Enter book price = ");
        b2.BookPrice = input.nextDouble();
        
        System.out.print("---------------------------------------------------\n");
        
        // calling the method from the class
        b1.BookDetails();        
        b2.BookDetails();
        
        
    }
    
}
