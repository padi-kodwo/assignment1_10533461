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
import javax.swing.*;
public class UsingSwingForInput 
    {
        public static void main(String[] arg)
        {
            String name=JOptionPane.showInputDialog("What is you name?");
            
            String input =JOptionPane.showInputDialog("How old are you?");
            int age= Integer.parseInt(input);
            
            System.out.print("Hello ,"+name+" , ");
            System.out.println("Next year. you'll be "+(age+1));
            System.exit(0);
        }
    }
