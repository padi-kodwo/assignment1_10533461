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
public class TwoMoreQuestions 
{
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Think of an object and i will try to guess it");
             String object;
             String size;
             System.out.printf("Question 1)Does it stay outside or inside or both? %n >");
             object=input.next();
             System.out.println("Question 2)Is it alive or not alive?");
             size=input.next();
             
            if(object.equals("inside") && size.equals("alive"))
             {
                  
               System.out.println("I am thinkin of a houseplant ");
                         
             }
            if (object.equals("inside")&&size.equals("not alive"))
             {
                 System.out.println("I am thinkin of a shower curtain ");
             }
        
        
             if(object.equals("outside") && size.equals("alive"))
             {
                System.out.println("I am thinkin of a bison ");
             }
             if  (object.equals("outside") && size.equals("not alive"))
             {
                System.out.println("I am thinkin of a billboard ");
             }
             
             if(object.equals("both") && size.equals("alive"))
             {
                System.out.println("I am thinkin of a dog");
             }
             if (object.equals("both") && size.equals("not alive"))
             {
                 System.out.println("I am thinkin of a cell phone");
             }
               
        }
        
    }

