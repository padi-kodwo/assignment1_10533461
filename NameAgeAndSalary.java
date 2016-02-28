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
public class NameAgeAndSalary 
    {
        public static void main(String[] args)
        {
            Scanner input =new Scanner(System.in);
            
            String name;
            int age;
            double salary;
                    
            
            System.out.println("What nomenclature do you bear?");
            name=input.next();
            
            System.out.println("How old are you?");
            age=input.nextInt();
            
            System.out.printf("Masa!!,%d years paaa di333r, you grow ooo, wey %s saf no dey bie one Mpo!!! %n", age, name);
            
            System.out.println("Ok now how much u dey make, you get money?");
            salary=input.nextDouble();
            
            System.out.printf("Only you your name no dey bie , you grow pass, wey you saa so no get money. I mean %g cedis be money ma guy u shock me ", salary);
            
        }
    }
