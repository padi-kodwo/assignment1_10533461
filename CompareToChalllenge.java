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
public class CompareToChalllenge 
{
    public static void main(String[]arg)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Comparing \"axe\" with \"dog\" produces ");
int i = "axe".compareTo("dog");
System.out.println(i);

System.out.println("Comparing \"applebee's\" with \"apple\" produces ");
System.out.println( "applebee's".compareTo("apple") );
System.out.println("Comparing \"mawutor\" with \"nat\" produces" );
System.out.println("mawutor".compareTo("nat"));
System.out.println("Comparing \"theman\" with \"kirikou\" produces" );
System.out.println("thaman".compareTo("kirokou"));
System.out.println("Comparing \"akligo\" with \"Zenator\" produces" );
System.out.println("akligo".compareTo("Zenator"));
System.out.println("Comparing \"Zenator\" with \"kirikou\" produces" );
System.out.println("l".compareTo("kirikou"));
    }
}
