/**
 * Scanner class gets user input. 
 * */
import java.util.Scanner;

/**
 * @author Sean Roberts
 *
 */
public class StoppingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int RANGE = 40;
		
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		// Ask user for their traveling speed
		System.out.print("Enter your speed (in mph): ");
		
		//assign traveling speed value to a variable.
		Double travelingSpeed = scan.nextDouble();
		
		// Ask user for their tailgating distance.
		System.out.print("Enter your tailgate distance (in feet): ");
		
		//assign Distance value to a variable.
		Double tailgatingDistance = scan.nextDouble();
		
		//Calculate Stopping Distance
		Double stoppingDistance = travelingSpeed * (2.25  + travelingSpeed / 21);
		
		
		//Determine Outcome.
		if (stoppingDistance < tailgatingDistance ) {
			System.out.print("No problem.");
		}else if(stoppingDistance > tailgatingDistance ) {
			System.out.print("Major wreck!");
		}else if((stoppingDistance > (tailgatingDistance - (RANGE - 20))) && (stoppingDistance < (tailgatingDistance + (RANGE - 20)))){
			System.out.println("Minor wreck.");
		}
		
	}//End Method
}//End Class
