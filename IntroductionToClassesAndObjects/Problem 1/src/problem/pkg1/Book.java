/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.pkg1;

/**
 *
 * @author admin
 */
public class Book {
    String BookTitle;
    String BookAuthor;
    double BookPrice;
    
    public void BookDetails()
    {
        System.out.println("---------------------------------------------------");
        System.out.println("Book Title = "+BookTitle);
        System.out.println("Book Author = "+BookAuthor);
        System.out.println("Book Price = "+BookPrice);
        System.out.println("---------------------------------------------------");
    }
}
