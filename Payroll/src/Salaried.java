/*
 * Load required classes
 * Author Sean Roberts
 * */

import java.util.Scanner;

public class Salaried extends Employee{
	
	public double weeklySalary;
	
	public void load() { //overloading load method from employee class
		super.load(); //using super to call load method from employee class
		Scanner scan = new Scanner(System.in);
		System.out.print("Salary ==> ");
		paycheck = scan.nextDouble();
		getEarnings();
	}

	public double getEarnings() {

		super.getBonus(); //called getBonus method from Employee class to compute if there should be an additional 100
		if(paycheck > 1000) {
			paycheck = 1000.00;
		}
		System.out.print("Paycheck: " + paycheck);
		return paycheck;
	}
}