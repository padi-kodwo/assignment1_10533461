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
public class GenderGame 
    {
        public static void main(String[] arg)
        {
            Scanner input=new Scanner(System.in);
            String name1;
            String name2;
            String answer;
            String answer2;
            int age;
            System.out.println("What gender are you(m 0r f?");
            answer=input.next();
            if(answer.equals("f"))
            {
                System.out.println("First name:");
                name1=input.next();
                System.out.println("Last name:");
                 name2=input.next();
                 System.out.println("Age:");
                 age=input.nextInt();
                 if(age>20)
                 {
                     
                 
                System.out.println("Are you married?,(y or n)");
                answer2=input.next();
                
                if(answer2.equals("y"))
                { 
            
                    System.out.printf("Then I shall call you Mrs. %s %s ",name2,name1);
                }
                else
                {
                System.out.printf("Then I shall call you Ms. %s %s ",name2,name1);    
                }
                 }
                 else
                 {
                     System.out.printf("Then I shall cal you %s %s",name2,name1);
                 }
                             
            }
            else
            {
                System.out.println("First name:");
                name1=input.next();
                System.out.println("Last name:");
                 name2=input.next();
                 System.out.println("Age:");
                 age=input.nextInt();
                 if(age>20)
                 {
                     
                 
                System.out.println("Are you married?,(y or n)");
                answer2=input.next();
                
                if(answer2.equals("y"))
                { 
            
                    System.out.printf("Then I shall call you Mr. %s %s ",name2,name1);
                }
                else
                {
                System.out.printf("Then I shall call you Mr. %s %s ",name2,name1);    
                }
                 }
                 else
                 {
                     System.out.printf("Then I shall cal you %s %s",name2,name1);
                 }
                             
            }
            }
                    
            
        }
    
