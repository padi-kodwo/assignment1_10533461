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
public class BMICategories 
{
    public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        double height;
        double weight;
        
        System.out.println("Enter your height");
        height=input.nextDouble();
        
        System.out.println("Enter you weight");
        weight=input.nextDouble();
        
        double BMI=(weight)/(height*height);
        System.out.printf("Your BMI is %g %n", BMI);
        if(BMI<18.5)
        {
            System.out.println("BMI Category:underweight");
        }
        else if(BMI>=18.5 && BMI<=24.9)
        {
            System.out.println("BMI Category:normal weight");
        }
        else if(BMI>=25.0 && BMI<=29.9)
        {
            System.out.println("BMI Category:overweight");
        }
        else if(BMI>=30)
        {
            System.out.println("BMI Category:obese");
        }
    }
}
