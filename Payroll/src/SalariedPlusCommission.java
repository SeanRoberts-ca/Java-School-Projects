/*
 * Load required classes
 * Author Sean Roberts
 * */

import java.util.Scanner;
import java.text.NumberFormat;

public class SalariedPlusCommission extends Employee{
	
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private double weeklySalary; //Base salry
	
	public void load() { //overloading load method from employee class
		super.load(); //using super to call load method from employee class
		Scanner scan = new Scanner(System.in);
		System.out.print("Salary ==> ");
		weeklySalary = scan.nextDouble();
		System.out.print("Sales for this past week ==> ");
		grossSales = scan.nextDouble();
		System.out.print("Sales commission rate (fraction paid to employee) ==>");
		commissionRate = scan.nextDouble();
		setCommissionRate(commissionRate);
	}
	
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	
    // set commission rate
    public void setCommissionRate( double rate )
    {
          commissionRate = rate;
       	  setGrossSales(grossSales);
    } // end method setCommissionRate
    
    // set gross sales amount
    public void setGrossSales( double sales )
    {
      if ( sales >= 0.0 ) {
          grossSales = sales;
          getEarnings();
      }
    }
    
	public double getEarnings() {
		super.getBonus(); //called getBonus method from Employee class to compute if there should be an additional 100
		paycheck += weeklySalary + (commissionRate * grossSales);
		if(paycheck > 1000) {
			paycheck = 1000.00;
		}
		System.out.print("paycheck: "  + defaultFormat.format(paycheck));
		return paycheck;   
	}
}
