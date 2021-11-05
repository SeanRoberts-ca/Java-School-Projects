/**
 * Scanner class gets user input. 
 * */
import java.util.Scanner;

/**
 * @author Sean Roberts
 * Class that splits a phone number by its hyphens.
 */
public class StringSplitter {
	public static void main(String[] args) {
		//Initialize Variables
		Integer count  = 0;
		Scanner scan = new Scanner (System.in);
		String phoneNumber = "";
		String [] arr = new String[3] ;
		String[] tokens;
		String choice = "G";
		boolean firstRun = true;
		//Run loop until it is Quit "q"/"Q".
		while(!choice.equals("q") && !choice.equals("Q")){
			System.out.println("Enter a phone number in the form cc-area-local,\nwhere cc = country code digits, area = area code\ndigits, and local = local phone digits.");
			if(firstRun) {
				//Get Initial answer.
				phoneNumber = scan.next();
				tokens = phoneNumber.split("-");
				System.out.println("Or enter q to quit: " + phoneNumber);
			}else {
				//Get Subsequent Answers.
				tokens = choice.split("-");
				System.out.println("Or enter q to quit: " + choice);
			}
			//Reset for each phone number.
			count = 0;
			for (String token : tokens)
			{
				//Phone number part.
			    arr[count] = token;
			    count++;
			}
			//Print the array tokens, based on their index.
		    System.out.println("country code = " + arr[0]);
		    System.out.println("area code = " + arr[1]);
		    System.out.println("local phone number " + arr[2]);
		    choice = scan.next();
		    firstRun = false;
		}//End While Loop 
	}//End Method
}//End Class