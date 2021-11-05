/*
 * Savings account subclass
 * Author: Sean Roberts
 * */

public class SavingsAccount {

	private double balance;
	private final int ACCOUNT_NUMBER;
	private double annualInterestRate;

	 //constructor
	 public SavingsAccount(double balanceSum,int accountNumber) {
		 this.balance = balanceSum;
		 this.ACCOUNT_NUMBER = accountNumber;
	 }
	 
	  // Setter
	  public void setannualInterestRate(double InterestRate) {
	    this.annualInterestRate = InterestRate;
	  }
	  
	  // Getter
	  public int getACCOUNT_NUMBER() {
	    return ACCOUNT_NUMBER;
	  }
	  
	  // Getter
	  public double getBalance() {
	    return balance;
	  }
	  
	 //Update Interest 
	 public void addMonthlyInterest(){
		 this.balance += (this.balance * annualInterestRate) / 12; 
	 }	 
}
