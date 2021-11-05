/**
 * Scanner class gets user input. 
 * 
*/
import java.util.Scanner;
/**
/**
 * @author Sean Roberts
 * Class that calculates the sum of two decibel levels.
 * 
 */
public class Decibels {

	public static void main(String[] args) {
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		//Prompt the use for an value
		System.out.print("Enter first decibel level: ");
		
		//assign value to a variable.
		Double dB1 = scan.nextDouble();
		
		//Prompt the use for an value.
		System.out.print("Enter second decibel level: ");
		
		//assign value to a variable.
		Double dB2 = scan.nextDouble();
		
		//Calculate Sum
		Double combinedDB = 10*Math.log10((Math.pow(10,(dB1/10))+Math.pow(10,(dB2/10))));
		
		//Print Result
		System.out.println("Combined decibel level = " + combinedDB + " dB");

	}

}
