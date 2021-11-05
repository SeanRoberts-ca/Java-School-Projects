/**
 * Scanner class gets user input. 
 * 
*/
import java.util.Scanner;
/**
/**
 ************************************************************************************************************
 * @author Sean Roberts
 * Write a program that prompts the user for a starting balance and then prints the number of
 * years it takes to reach $100,000 and also the number of years it takes to reach $1,000,000.
 * Sample session:
 * Enter starting balance: 10000
 * It takes 4 years to reach $100,000.
 * It takes 7 years to reach $1,000,000.
 ***********************************************************************************************************
 */
public class BankBalance {

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{
		
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		//Prompt the use for an Int.
		System.out.print("Enter starting balance: ");
		
		//assign Int value to a variable.
		Integer initialDeposit = scan.nextInt();
		
		//Count is the number of years.
		int count = 0;
		
		//accumulatedBalance is the running total.
		int accumulatedBalance = initialDeposit;
		
		//Start While loop to check when balance reaches 100K
		while (accumulatedBalance < 100_000) {
			
			//Balance Doubles every year
			accumulatedBalance *= 2;
			
			//Add One Year to the count
			count++;
			
		}//End While Loop
		
		//Inform user of the amount of years it will take to reach 100k.
		System.out.println("It takes "+ count +" years to reach $100,000.");
		
		//Reset Values for 1Million Calculation.
		count = 0;
		accumulatedBalance = initialDeposit;
		
		//Start While loop to check when balance reaches 1 Million.
		while (accumulatedBalance < 1_000_000) {
			
			//Balance Doubles every year
			accumulatedBalance *= 2;
			
			//Add One Year to the count
			count++;
			
		}//End While Loop
		
		//Inform user of the amount of years it will take to reach 1 Million.
		System.out.println("It takes "+ count +" years to reach $1,000,000.");

		
	}//End Method
	
}//End Class