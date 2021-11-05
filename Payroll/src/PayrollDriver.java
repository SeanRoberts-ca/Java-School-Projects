/*
 * Load required classes
 * Author Sean Roberts
 * */
import java.util.Scanner;
public class PayrollDriver {

	public static void main(String[] args) {
	 
		int numberOfEmployees;
		int paycheckType;
		
		System.out.print("Number of employees: ");
		Scanner scan = new Scanner (System.in);
		//Set the No. of Employees.
		numberOfEmployees = scan.nextInt();
			//Loop through the employees.
		  for (int i=0; i < numberOfEmployees; i++)
		  {
			  System.out.println("");  
			  System.out.println("");
			  System.out.print("PROFILE FOR EMPLOYEE #"+(i+1)+":");  
			  System.out.println("");
			  //Ask operator which type of payment the employee receives.
			  System.out.println("type Hourly(1), Salaried(2), Salaried plus Commission(3)");  
			  System.out.print("Enter 1, 2, or 3 ==> ");  
			  paycheckType = scan.nextInt();
			  if(paycheckType == 1) {
				  	//Instantiate the Hourly Class that loads the super class Employee.
					Hourly Hourly = new Hourly();
					Hourly.load();
			  }else if(paycheckType == 2){
				  	//Instantiate the Salaried Class that loads the super class Employee.
					Salaried Salaried = new Salaried();
					Salaried.load();
			  }else if(paycheckType == 3) {
				  	//Instantiate the Salaried Plus Commission Class that loads the super class Employee.
					SalariedPlusCommission SalariedPlusCommission = new SalariedPlusCommission();
					SalariedPlusCommission.load();
			  }else {
				  System.out.print("Please enter a valid pay type after restarting the program."); 
				  System.out.print("You may also continue with the other employees."); 
			  }//Pay type check.
		  }//End for loop
	}//End main
}//End Class
