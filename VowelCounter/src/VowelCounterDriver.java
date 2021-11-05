import java.util.*;
public class VowelCounterDriver {
	public static void main(String[] args) {
		//Initialize Variables
		Scanner scan = new Scanner (System.in);
		VowelCounter vc = new VowelCounter();
		String returnString = "default";
		while(!returnString.equals("")){
			System.out.println("Enter a line of characters (press enter by itself to quit)");
			returnString = scan.nextLine();
			if (returnString.length() > 0) {
				vc.processLine(returnString);//Process in the indicated method.
			}
		}//End While Loop
		vc.printSummary();//Print Summarized Report
	}//End main method
}//End Class VowelCounterDriver