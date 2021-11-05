/*
 * Bank account driver
 * Author: Sean Roberts
 * */
public class BankAccountDriver {
	
	public static void main(String[] args)
	{
	//Object creation
	  BankAccount[] accounts = new BankAccount[100];
	 //Class creation + Constructor
	  accounts[0] = new Savings(1100, .05);
	  //Methods
	  accounts[0].deposit(100);
	  accounts[0].withdraw(200);
	  ((Savings) accounts[0]).addInterest();
	 //Class creation + Constructor
	  accounts[1] = new Checking(-100);
	  //Method
	  accounts[1].deposit(50);
	 //Class creation + Constructor
	  accounts[2] = new Checking(200);
	  //Methods
	  accounts[2].withdraw(210);
	  accounts[2].deposit(100);
	  ((Checking) accounts[2]).writeACheck(50);
	   //Display method of each subclass.
	  for (int i=0; i<accounts.length && accounts[i] != null; i++)
	  {
	    accounts[i].display();
	  }
	}

}
