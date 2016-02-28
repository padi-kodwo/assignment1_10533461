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
public class WorstGuessingGameEver 
{
    public static void main(String[] arg)
    {
     Scanner input =new  Scanner(System.in);
      int answer;
     System.out.println("The Worse Guessing Game Ever");
     System.out.println("I am thinking of an integer number between 1 and 10, guess what number");
    
     answer=input.nextInt();
     if(answer==4)
     {
         System.out.println("You are correct");
     }
     else
     {
         System.out.println("You are so wrong");
     }
    }
    
}
