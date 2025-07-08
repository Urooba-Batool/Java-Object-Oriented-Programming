/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;

/**
 *
 * @author admin
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Calculator class and overload a method multiply for two and three arguments.
        
        Multiplication m = new Multiplication();
        m.Multiply(5, 3);
        m.Multiply(5.2, 3.5);
        m.Multiply(2, 4, 7);
        m.Multiply(2.3, 5.4, 3.7);
    }
    
}
