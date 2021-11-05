/**
 * Scanner class gets user input. 
 * 
*/
import java.util.Scanner;
/**
/**
 * @author Sean Roberts
 * 
 * 
 * Write a program that applies these economic policy practices. More specifically, read in growthRate and 
 * inflationValues and output the recommended economic policy for the given economic situation. If there is 
 * no recommended economic policy for the given economic situation, then output “No change in economic policy.
 * 
 */
public class EconomicPolicy {

	public static void main(String[] args) {
		//Initialize the scanner class.
		//Used to get user input from the console.
		Scanner scan = new Scanner (System.in);
		
		//Prompt the use for an Int.
		System.out.print("Enter the annual growth rate: ");
		
		//assign Int value to a variable.
		String growthRate = scan.next();
		
		//Prompt the use for an Int.
		System.out.print("Enter annual inflation rate: ");
		
		//assign Int value to a variable.
		String inflationValues = scan.next();
		
		//Remove %s from Strings
		growthRate = growthRate.replace("%", "");
		inflationValues = inflationValues.replace("%", "");
		
		//Convert to a Double.
		Double calcGrowthRate = Double.parseDouble(growthRate);
		Double calcInflationValues = Double.parseDouble(inflationValues);
		
		if (calcGrowthRate < 1)
		{
			if(calcInflationValues < 3)
			{
				System.out.println("Recommended Economic Policy:");
				System.out.println("Increase welfare spending, reduce personal taxes, and decrease discount rate.");
			}else{
				System.out.println("Recommended Economic Policy:");
				System.out.println("Reduce business taxes.");
			}//End Nest if/else Statements #1
		}else if (calcGrowthRate > 4)
		{
			if (calcInflationValues < 1){
				System.out.println("Recommended Economic Policy:");
				System.out.println("Increase personal and business taxes, and decrease discount rate.");
			}else if (calcInflationValues > 3){
				System.out.println("Recommended Economic Policy:");
				System.out.println("Increase discount rate.");
			}else{
				System.out.println("No change in economic policy.");
			}//End Nest if/else if /else statements #2
		} else 
		{
			System.out.println("No change in economic policy.");
		}//End Outer if/else if/else Statements

	}//End Method

}//End Class
