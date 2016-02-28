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
public class ALittleQuiz 
{
 public static void main(String[] arg)
 {
     //variable declaration
     Scanner input=new Scanner(System.in);
     int answer;
     int total=3;
    //output  and input
     //conditions
     System.out.printf("What is the capital of Ghana %n\t\t\t\t%n1)Ho\t\t\t\t%n2)Tamale\t\t\t\t%n3)Accra %n > ");
     answer=input.nextInt();
     if(answer==1)
     {
         total=total-1;
         System.out.println("That is incorrect");
     }
     else if(answer==2)
     {
          total=total-1;
         System.out.println("You are so Wrong right now!!");
     }
     else if(answer==3)
     {
        System.out.println("Good!!"); 
     }
     
      System.out.printf("What is the name of my creator? %n \t\t\t\t\n 1)God in heaven\t\t\t\t%n 2)Alan Turing\t\t\t\t %n 3)Alfred Mawutor %n > ");
     answer=input.nextInt();
     
      if(answer==1)
     {
          total=total-1;
         System.out.println("That is incorrect");
     }
     else if(answer==2)
     {
          total=total-1;
         System.out.println("You are so Wrong right now!!");
     }
     else if(answer==3)
     {
        System.out.println("Good!!"); 
     
     }
      
      System.out.printf("What is my best verse in teh bible?%n\t\t\t\t1)Psalm 70 Verse 2%n\t\t\t\t2)Psalm 91 verse 7%n\t\t\t\t3)Psam27 verse 14%n >");
      answer=input.nextInt();
      if(answer==1)
     {
          total=total-1;
         System.out.println("That is incorrect");
     }
     else if(answer==2)
     {
          
         System.out.printf("Good!! It Says, A thousand shall fall at your right hand side ten thousand on your right hand but it shall never come neigh you.%n");
     }
     else if(answer==3)
     {
         total=total-1;
        System.out.println("Masa you mow at all?"); 
     
     }
      //conclusion
      System.out.printf("You have scored %d out of 3 %n",total);
 }
}
