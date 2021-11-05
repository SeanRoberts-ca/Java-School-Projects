/**
 * Scanner class gets user input. 
 * */
import java.util.Scanner;
/**
 ************************************************************************************************************
 * @author Sean Roberts
 * 
 * Java class that generates and prints a circle's related values.
 *
 */

public class CirclesValues
{
	
	//Primary Method
	
	public static void main(String[] args)
	{
		
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		// Ask user for value of radius.
		System.out.print("Enter a radius value: ");
		
		//assign radius value to a variable.
		double radius = scan.nextDouble();
		
		//Calculate Diameter.
		double diameter = 2 * radius;
		
		//Print Diameter.
		System.out.println("Diameter = " + diameter);
		
		//Assign Pi to the double x variable.
	    double PI = Math.PI;
	    
	    //Calculate Circumference.
	    double circumference = PI * diameter;
	    
		//Print circumference.
	    System.out.println("Circumference = " + circumference);
	    
	    //Calculate area.
	    double area = PI * radius * radius;
	    
	    //Print area.
		System.out.println("Area = " + area);

	}//End Method.

}//End Class.