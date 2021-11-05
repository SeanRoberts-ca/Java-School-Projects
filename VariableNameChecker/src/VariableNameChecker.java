//Documenting classes used.
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;
import java.lang.*;
/**
 * @author Sean Roberts
 * Class that determine a variable name is valid.
 */
public class VariableNameChecker {
	public static void main(String[] args) {
		//Initialize Variables
		Scanner scan = new Scanner (System.in);
		String variableName = "";
		boolean firstRun = true;
		boolean isValidVar = true;
		boolean didFindPoorStyle = false;
		//Proceed w/ outer loop only if != Quit "q".
		while(!variableName.equals("q")){
			if(firstRun) {
				//Describe Class.
				//Prompt for input &
				//Get Initial answer.
				System.out.println("This program checks the properness of a proposed Java variable name.");
				System.out.print("Enter a variable name (q to quit): ");
				//uses nextline() to capture whitespace.
				variableName = scan.nextLine();
			}else {
				//Get Subsequent Answers.
				System.out.print("Enter a variable name (q to quit): ");
				//uses nextline() to capture whitespace.
				variableName = scan.nextLine();
			}
			//Proceed w/ inner loop only if != Quit "q".
			if (!variableName.equals("q")) {
				//isValid by Default, needs resetting for each outer loop.
				isValidVar = true;
				didFindPoorStyle = false;
				//User input.
				String string = variableName;
				//Dynamic arraysize/ArrayList
		        List<Character> chars = new ArrayList<>();
		        //trim() isn't used since we want to find whitespace.
		        //variableName = variableName.trim();
		        //Loop each character and check if it is valid or not.
		        for (int i = 0; i < string.length(); i++) {
		            //Add char to ArrayList
		        	chars.add(string.charAt(i));
		            //Used to check for string literals.
		            String str = Character.toString(string.charAt(i));
		            //Check if first char is a number.
		            if(Character.isDigit(string.charAt(i)) &&  i == 0) {
		            	isValidVar = false;
		            }
		          //Check if first char is a $.
		            if (str.equals("$") && i == 0){
		            	isValidVar = false;
		            }
		            ////Check if any char is illegal, including whitespace.
		            if(!Character.isLetterOrDigit(string.charAt(i)) && !str.equals("$")){
		            	isValidVar = false;
		            }
		          //Check if any char is a $.
		            if (str.equals("$") && i > 0 && didFindPoorStyle == false && isValidVar == true){
		            	didFindPoorStyle = true;
		            }
		          //Check if first char is a upper-case.
		            if(Character.isUpperCase(string.charAt(i)) &&  i == 0 && didFindPoorStyle == false && isValidVar == true) {
		            	didFindPoorStyle = true;
		            }
		        }//End For Loop
		      //Validity = all char checks have passed, nothing flagged as isValidVar = false;
		      //Validity = all char checks have passed, nothing flagged as didFindPoorStyle = true;
		      //Test for validity, then ensure we have a string to work with, .
	            if(isValidVar == false) {
	            	System.out.println("Illegal.");	
	            }else if(didFindPoorStyle == true) {
	            	System.out.println("Legal, but uses poor style.");
	            }else if (isValidVar == true && string.length() > 0) {
	            	System.out.println("Good!");
	            }
			}//Check for quit
			//1st variable checked now onto others, 
			//unless we receive a q for quit.
		    firstRun = false;
		}//End While Loop 
	}//End Method
}//End Class