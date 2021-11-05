/**
 * Scanner class gets user input. 
 * */
import java.util.Scanner;
/**
 ************************************************************************************************************
 * @author Sean Roberts
 * Class that determines when a users 100 birthday will be.
 ************************************************************************************************************
 */
public class OneHundredthBirthday
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		// Ask user for their birth month.
		System.out.print("Enter the month you were born: ");
		
		//assign month value to a variable.
		String month = scan.next();
		
		// Ask user for their birthday.
		System.out.print("Enter the day you were born: ");
		
		//Get birthday
		Integer birthday = scan.nextInt();
		
		// Ask user for their birth Year.
		System.out.print("Enter the year you were born: ");
		
		//Get birth year
		Integer birthyear = scan.nextInt();
		
		// Display the year the user turns 100.
		Integer oneHundredth = birthyear + 100;
		
		//Print final summary message with appropriate dates.
		System.out.println("You will be 100 on " + month + " " + birthday + ", " + oneHundredth + ".");


	}//End Method

}//End Class
