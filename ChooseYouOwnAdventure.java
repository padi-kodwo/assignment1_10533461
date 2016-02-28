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
import java.util.*;
public class ChooseYouOwnAdventure 
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        String option1;
        String option2;
        String option6;
        
        System.out.println("WELCOME_TO_THE_CALL_OF_DUTY_1974!!");
        
        System.out.println("You are in a creepy house.Would you go upstairs or downstiars?");
        option1=input.next();
        if(option1.equals("upstairs"))
        {
            System.out.println("You see and orgre and axe on the floor.What do you do");
            option2=input.next();
            
            if(option2.equals("Kill"))
            {
                System.out.println("Idiot!!! Run");
            }
            else
            {
                    System.out.println("You are a dead man");
                    }
        }
        else
        {
            System.out.println("You see a bottle of wine and a bottle of fufu.Which will you pick?");
            String option3=input.next();
            if(option3.equals("fufu"))
            {
                System.out.println("You ate the fufu and you grew 10 feet tall.You met God and satan who will you goto?");
                String option4=input.next();
                if(option4.equals("God"))
                        { 
                            System.out.println("You are saved");
                        }
                else
                { 
                    System.out.println("You are doomed");
                }
            }
            else
            {
                System.out.println("You saw a white light and some darkness.Where will you go?");
                String option5=input.next();
                if(option5.equals("light"))
                {
                    System.out.println("You are saved");
                }
                else 
                {
                    System.out.println("You are doomed ");
                }
                        
            }
        }
    }
}
