/*
 * checking account sub class
 * Author: Sean Roberts
 * */
//Used to format dollar amount.
import java.text.NumberFormat;

//Subclass that extends BankAccount.
public class Checking extends BankAccount {
	
	//Constructor
	public Checking(double balanceSum) {
		super(balanceSum);
	}

	//Withdraw Sum plus $1 fee.
	public void writeACheck(double checkSum) {
		super.withdraw(checkSum + 1);	
	}
	
	//Display balance in Dollar format.
	public void display() {
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Checking account balance  = " + defaultFormat.format(super.getBalance()));
	}

}
