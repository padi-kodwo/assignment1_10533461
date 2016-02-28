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

public class SpaceBoxing 
{
    public static void main(String[] arg)
            
    {
        Scanner input=new Scanner(System.in);
        
        double weight;
        int planet;
        double v;
        
        System.out.println("How much do you weigh?");
        weight=input.nextDouble();
        
        System.out.printf("1.Venus %n 2.Mars %n 3.Jupiter %n 4.Saturn %n 5.Uranus %n 6.Neptune %n");
        
        System.out.println("Which Planet do you want to visit?");
        planet=input.nextInt();
         if(planet==1)
         {
            v=planet*0.78;
            System.out.printf("Your weight will be %g pounds on venus", v);
         }
        
         else if(planet==2)
         {
            v=weight*0.39;
            System.out.printf("Your weight will be %g pounds on mars", v);
         }
        
          else if(planet==3)
         {
            v=weight*2.65;
            System.out.printf("Your weight will be %g pounds on Jupiter", v);
         }
        
          else if(planet==4)
         {
            v=weight*1.17;
            System.out.printf("Your weight will be %g pounds on Saturn", v);
         }
        
            else if(planet==5)
         {
            v=weight*1.05;
            System.out.printf("Your weight will be %g pounds on Uranus", v);
         }
        
             else if(planet==6)
         {
            v=weight*1.23;
            System.out.printf("Your weight will be %g pounds on Neptune", v);
         }
        
        
    }
}
