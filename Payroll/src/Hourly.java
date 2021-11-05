/*
 * Load required classes
 * Author Sean Roberts
 * */
import java.util.Scanner;
import java.text.NumberFormat;

public class Hourly extends Employee {
	
	//declared instance variables
	public double hourlyPay;
	public int pastWeekHours;
	
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

	public void load() { //overloading load method from employee class
		super.load(); //using super to call load method from employee class
		Scanner scan = new Scanner(System.in);
		System.out.print("Hourly Pay ==> ");
		hourlyPay = scan.nextDouble();
		System.out.print("Hours worked this past week ==> ");
		pastWeekHours = scan.nextInt();
		getEarnings();
	}
	
	
	public double getEarnings() {
		//computing paycheck and checking for overtime to add to paycheck
		double overtime = 0;
		if(pastWeekHours>40) {
			overtime = (pastWeekHours-40)*(hourlyPay*1.5);
			paycheck +=(hourlyPay * pastWeekHours) + overtime;
		}else {
			paycheck += hourlyPay * pastWeekHours;
		}
		super.getBonus(); //called getBonus method from Employee class to compute if there should be an additional 100
		if(paycheck > 1000) {
			paycheck = 1000.00;
		}
		System.out.print("Paycheck: " + paycheck);
		return paycheck;
	}
}