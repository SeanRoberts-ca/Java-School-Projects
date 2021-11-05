/**
 * Scanner class gets user input. 
 * */
import java.util.Scanner;
/**
 ************************************************************************************************************
 * @author Sean Roberts
 * Write a Java program that generates an isosceles triangle made of asterisks. The program should prompt the 
 * user to specify the size of the triangle. Make sure variable names are appropriate,and make sure there are 
 * comments for the weird variables like sideSize. Use good style.

Sample session:
Enter the size of the equal sides in an isosceles triangle: 6
*
**
***
****
*****
******

 ************************************************************************************************************
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		//Prompt the use for an integer.
		System.out.print("Enter the size of the equal sides in an isosceles triangle: ");
		
		//assign Int value to a variable.
		Integer triangleSize = scan.nextInt();
		
		//Establish triangle variable.
		String triangleRowString = "";
		
		//Step through the rows of the triangle
	    for (int r = 1; r <= triangleSize; r++) {
	    	
	        //Append row value(s) to myString
	    	for (int j = 1; j <= r; j++) {
	    		
	    		triangleRowString += "*"; 
	    		
	        }
	    	
	    	//Append new line separator @ th eend of a row
	    	triangleRowString += "\n";
	        
	    }
	    
	    //print full string
	    System.out.println(triangleRowString);
		
	}//End Method

}
