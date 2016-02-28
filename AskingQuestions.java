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
public class AskingQuestions
    
    {
        public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
                
		double weight;
               
                  
                  System.out.print("How old are you");
                age= keyboard.nextInt();
                
                System.out.print("How tall are you? ");
                height=keyboard.next();
                
                System.out.print("How much do you you weigh?");
                weight=keyboard.nextDouble();
                
                System.out.printf("So you are %d years and %s in height and you are %g heavy %n",age ,height, weight);
                  }
                 
	}
    
