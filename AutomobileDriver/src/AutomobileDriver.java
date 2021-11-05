/***************************************************
 * AutomobileDriver.java
 * @author Sean Roberts
 ***************************************************/
import java.util.Scanner;   //Import Scanner class
public class AutomobileDriver {
	public static void main(String[] args) {
		//Initialize Variables
		Scanner scanClass = new Scanner (System.in);
		//Set Local Vars
		int numberOfCars = 0;
		String forceReturn;
		//Create an Object of Automobile.
		Automobile auto = new Automobile();
		//Get # of Cars to Process
		try{
			System.out.print("How many cars do you want to consider? ");
			numberOfCars = scanClass.nextInt();
			forceReturn = scanClass.nextLine();
		}
		catch(Exception e) {
			System.out.println("Error: Enter an Integer for a number.");
			System.out.println("Please restart the application to resolve this issue.");
		}
	    for(int i=0; i<numberOfCars;i++){  
	    	//Run the methods
	    	auto.setMake();
	    	auto.setColor();
		    //auto.printColor().printMake();//Cannot invoke printMake() on the primitive type void
			//Can anyone tell me why the above line won't work for me, rather how to make it work for me.
	    	auto.printColor();
	    	auto.printMake();
	    } //End For Loop
	}//End Main Class
}//End AutomobileDriver