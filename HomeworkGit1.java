/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkgit1;

import java.util.Scanner;
/**
 *
 * @author a2k2p
 */
public class HomeworkGit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //question 14
		Scanner keyboard = new Scanner(System.in);

		int age;
                int inches;
		int feet;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		feet =keyboard.nextInt();
                
                System.out.print("And how many inches? ");
                inches = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So, you're " + age + " old, " + feet+ "'"+ inches +" tall and " + weight + " heavy." );
	}
    }
