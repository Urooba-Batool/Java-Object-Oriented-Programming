/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.pkg3;
import java.util.Scanner;

public class Student {
    
    Scanner input = new Scanner(System.in);
    
    String StudentName;
    int StudentClass;
    double Percentage;
    double TotalMarks = 0;
    String Grade;
    
    public void CalculatePercentage()
    {
        System.out.print("Enter Student Name: ");
        StudentName = input.next();
        System.out.print("Enter Student Class: ");
        StudentClass = input.nextInt();
        
        for(int i = 1; i <=5; i++)
        {
            System.out.print("Enter marks of subject "+i+" out of 100 = ");
            double marks = input.nextDouble();
            
            TotalMarks += marks;
        }
        
        Percentage = (TotalMarks/500)*100;
    }
    
    public void CalculateGrade()
    {
        if(Percentage >=80 && Percentage < 100)
        {
            Grade = "A+";
        }
        else if(Percentage >=70 && Percentage < 80)
        {
            Grade = "A";
        }
        else if(Percentage >=60 && Percentage < 70)
        {
            Grade = "B";
        }
        else if(Percentage >=50 && Percentage < 60)
        {
            Grade = "C";
        }
        else if(Percentage >=40 && Percentage < 50)
        {
            Grade = "D";
        }
        else if (Percentage < 40)
        {
            Grade ="F";
        }
        
    }
    
    public void ResultDetails()
    {
        System.out.println("-------- Student Result Details --------");
        System.out.println("Student Name = "+StudentName);
        System.out.println("Student Class = "+StudentClass);
        System.out.println("Total Marks = "+TotalMarks+"/500");
        System.out.println("Percentage Obtained = "+Percentage);
        System.out.println("Grade Obtained = "+Grade);
    }
}
