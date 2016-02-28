/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkgit1;

/**
 *
 * @author Mawutor
 */
import java.util.Scanner;

public class MoreUserInputData 
{
    public static void main(String[] arg)
    {
       Scanner input= new Scanner(System.in);
       
       long Sid;
       String name1;
       String name2;
       String login;
       int grade;
       double gpa;
       
       System.out.println("Please enter his information for me to sell");
       System.out.print("First name:");
       name1=input.next();
       
       System.out.print("Last name:");
       name2=input.next();
       
       System.out.print("Grade(9-12):");
       grade=input.nextInt();
       
       System.out.print("Student ID:");
       Sid=input.nextLong();
       
       System.out.print("Login:");
       login=input.next();
       
       System.out.print("GPA(0.0-4.0):");
       gpa=input.nextDouble();
       
       System.out.println("Your information %n:");
       System.out.printf("\t\t\t\t\t\tLogin:%d",login);
       System.out.printf("\t\t\t\t\t\tStudent Identification:%d", Sid);
       System.out.printf("\t\t\t\t\t\tName:%s %s",name2 ,name1);
       System.out.printf("\t\t\t\t\t\tGPA:%g",gpa);
       System.out.printf("\t\t\t\t\t\tGrade:%d",grade);
    }
}
