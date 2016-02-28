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
public class question16 {
    //question 16
    
    public static void main(String[] args){
        
        String name;
        int age;
        float income;
        income = 0.00f;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hello! what is your name?");
        name = keyboard.next();
        
        System.out.println("Hi, "+ name+ " How old are you?");
        age = keyboard.nextInt();
        
        System.out.println("So you're "+ age+ ", eh?  That's not old at all! How much do you make,"+ name+"?");
        income = keyboard.nextFloat();
               
        System.out.println(income+"! I hope that's per hour and not per year! LOL!");
    }
    
}
