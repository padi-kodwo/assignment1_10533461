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
public class AgeInFiveYears
{   
    public static void main(String[] arg)
    {
        //variable declaration
        Scanner input=new Scanner (System.in);
         String name;
         int age;
        
         //input and output
         System.out.println("What is you name?");
         name=input.next();
         System.out.print("How old are you?");
         age=input.nextInt();
         //later declarations
          int ageminus=age-5;
         int ageplus=age+5;
         
         System.out.printf("Hello %s, do you know that in five years you will be %d and five years ago you were %d,Imagine that!",name,ageplus,ageminus);
    }
    
}
