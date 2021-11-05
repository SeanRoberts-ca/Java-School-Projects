/*
 * Savings account sub class
 * Author: Sean Roberts
 * */
//Used to format dollar amount.
import java.text.NumberFormat;

//Subclass that extends BankAccount.
public class Savings extends BankAccount {
	
	private double intRate;
	
	// constructor
	public Savings(double balanceSum, double interest) {
		super(balanceSum);
		intRate = interest;
	}
	
	//Call parent class deposit.
	public void deposit(double depositSum) {
		super.deposit(depositSum);	
	}
	
	//Call parent class withdraw,
	public void withdraw(double withdrawSum) {
		super.withdraw(withdrawSum);	
	}
	
	//Deposit calculated interest sum.
	public void addInterest() {
		super.deposit(intRate * super.getBalance());	
	}
	
	//Display balance in Dollar format.
	public void display() {
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Savings account balance   = " + defaultFormat.format(super.getBalance()));
	}
}