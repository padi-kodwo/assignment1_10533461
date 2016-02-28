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
public class ForgetfulMachine 
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner( System.in);
            
           
            System.out.println("Give me a word");
            input.next();
            
            System.out.println("Great,give me a second word");
            input.next();
            
            System.out.println(" Give me a number");
            input.next();
            
            System.out.println("Great give me another number");
            input.next();
            
            System.out.println("Whew!!, wasn't that fun ;-)");
        }
    }
