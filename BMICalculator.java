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
public class BMICalculator 
{
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        double height;
        double weight;
         int option;
         int feet;
         int inches;
        System.out.println("Want you weight");
                  System.out.println("pounds and feet(1)or meters and kilograms(3) or inches and kg(3)");
                  option=input.nextInt();
                  if(option==2)
                  {System.out.println("Enter your height");
        height=input.nextDouble();
        
        System.out.println("Enter you weight");
        weight=input.nextDouble();
        
        double BMI=(weight)/(height*height);
        System.out.printf("Your BMI is %g", BMI);
                  }
         else if(option==1)
                  {
                    System.out.println("Your height first in feet"); 
                    feet=input.nextInt();
                     System.out.println("Your height first in inches"); 
                    inches=input.nextInt();
                    double h1=feet*0.3048;
                    double h2=inches*0.0254;
                    height=h1+h2;
                    int pounds;
                    System.out.println("Your weight in pounds");
                    pounds=input.nextInt();
                    weight=pounds*0.4535;
                    
                    double BMI=(weight)/(height*height);
        System.out.printf("Your BMI is %g", BMI);
                    
                  }
                  else
         {
              System.out.println("Your height first in inches");
               inches=input.nextInt();
               height=inches*0.0254;
               System.out.println("Your weight in kg");
               weight=input.nextInt();
               
               double BMI=(weight)/(height*height);
        System.out.printf("Your BMI is %g", BMI);
         }
    }
    
}
