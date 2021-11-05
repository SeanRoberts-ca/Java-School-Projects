/*
 * Load required classes
 * Author Sean Roberts
 * */
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
abstract class Employee {
	//Declaring instance variables
	private String name; //not static so I could use it with different values in it
	private String socialSecNum;//not static so I could use it with different values in it
	private int birthMonth;
	private int birthWeek;
	protected double paycheck;
	protected static int month;
	protected static int week;
	

	public void load() { //load method to prompt user to fill name, ssn, birth month and birth week
		Scanner scan = new Scanner (System.in);
		System.out.print("Name ==> ");
		name = scan.nextLine();
		System.out.print("Social security number ==> ");
		socialSecNum = scan.nextLine();
		System.out.print("Birthday month (1-12) ==> ");
		birthMonth = scan.nextInt();
		System.out.print("Birthday bonus week ==> ");
	    birthWeek = scan.nextInt();
	}
	
	public String toString() {//toString method to return a string 
		if(this.paycheck> 1000) {
			this.paycheck=1000.00;
		}
		return String.format("\nEmployee: %s %nSocial Security Number: %s %nPaycheck: $%.2f%n",this.name,this.socialSecNum,this.paycheck);
		
	}
	
	public void getBonus() { //getBonus method - to add 100 if birth month and birth week are equal to the local month and week
		Date date = new Date();
		Calendar calendar =Calendar.getInstance(); //used the calendar class to generate current date
		calendar.setTime(date);
		month = calendar.get(Calendar.MONTH)+1; //getting the month integer and adding one because it's defaulted to give 0 if it's January
		week = calendar.get(Calendar.WEEK_OF_MONTH);
		if(birthMonth == month && birthWeek == week) { //check if it's the same with the employee birth month and week - if true add 100
			paycheck +=100;
		}
	}
	
	
	abstract double getEarnings(); //Abstract method
}

