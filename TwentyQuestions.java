/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkgit1;

/**
 *
 * @author Mawutor
 */ import java.util.Scanner;
public class TwentyQuestions 
    {
            
        public static void main(String[] arg)
        {
            Scanner input = new Scanner(System.in);
             System.out.println("Think of an object and i will try to guess it");
             String object;
             String size;
             System.out.printf("Question 1)Is it an animal, mineral or vegetable? %n >");
             object=input.next();
             System.out.println("Question 2)Is it bigger than breadbox?");
             size=input.next();
             
            if(object.equals("animal") && size.equals("yes"))
             {
                  
               System.out.println("I am thinkin of mouse ");
                         
             }
            else if (object.equals("animal")&&size.equals("no"))
             {
                 System.out.println("I am thinkin of a huge elephant ");
             }
        
        
             if(object.equals("vegetable") && size.equals("yes"))
             {
                System.out.println("I am thinkin of a carrot ");
             }
             else if  (object.equals("vegetable") && size.equals("no"))
             {
                System.out.println("I am thinkin of watermellon ");
             }
             
             else if(object.equals("mineral") && size.equals("yes"))
             {
                System.out.println("I am thinkin of a camaro");
             }
             else if (object.equals("mineral") && size.equals("no"))
             {
                 System.out.println("I am thinkin of a paper clip");
             }
               
        }
    }

