/*
 * Savings account driver
 * Author: Sean Roberts
 * */
//Used to format dollar amount.
import java.text.NumberFormat;

public class SavingsAccountDriver {

	public static void main(String[] args) {
		
		boolean displayedHeader= false;
		double dblTotalBalance = 0;
		String[][] strLineNumber = { {"", "", "", "", "", "", "", "", "", "", "", "", ""}, {"", "", "", "", "", "", "", "", "", "", "", "", ""} };
		//Format Dollar
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
			//Object creation
			  SavingsAccount[] accounts = new SavingsAccount[2];

			  accounts[0] = new SavingsAccount(2000, 10002);
			  accounts[0].setannualInterestRate(.05);

			  accounts[1] = new SavingsAccount(3000, 10003);
			  accounts[1].setannualInterestRate(.05);
			  
			  for (int i=0; i<accounts.length && accounts[i] != null; i++)
			  {
				  for (int j=0; j < 13; j++)
				  {
					  int account = i;
					  int month= j;
					  
					  if (j==0) {
							//Generate Header
							if(displayedHeader == false) {
								if (month == 0 && account == 0) {
									System.out.println("");
									System.out.println("Monthly balances for one year with 0.05 annual interest:");
									System.out.println("");
									System.out.println("Month\tAccount #\t Balance\t Account #\t" + "Balance");
									System.out.println("-----\t---------\t -------\t ---------\t" + "-------");
								}
								//Save opening balance to array string.
								if (account == 0) {
									strLineNumber[account][month] = month + "\t " + accounts[account].getACCOUNT_NUMBER() + "\t\t "  +  defaultFormat.format(accounts[account].getBalance());
								}else {
									strLineNumber[account][month] = "\t " + accounts[account].getACCOUNT_NUMBER() + "\t\t "  +  defaultFormat.format(accounts[account].getBalance());
								}
								displayedHeader = true;
							}else {
								//Save monthly balances for both saving accounts.
								if (account == 0) {
									strLineNumber[account][month] = month + "\t " + accounts[account].getACCOUNT_NUMBER()+ "\t\t "  +  defaultFormat.format(accounts[account].getBalance());
								}else {
									strLineNumber[account][month] = "\t " + accounts[account].getACCOUNT_NUMBER() + "\t\t "  +  defaultFormat.format(accounts[account].getBalance());
								}	
							}
							//End Display Code Segment.
							//Calculate Total balance
							if (j==12) {
								dblTotalBalance = accounts[account].getBalance();
							}
					  }else{
						  accounts[i].addMonthlyInterest();
							//Save monthly balances for both saving accounts.
							if (account == 0) {
								strLineNumber[account][month] = month + "\t " + accounts[account].getACCOUNT_NUMBER() + "\t\t "  +  defaultFormat.format(accounts[account].getBalance());
							}else {
								strLineNumber[account][month] = "\t " + accounts[account].getACCOUNT_NUMBER() + "\t\t "  +  defaultFormat.format(accounts[account].getBalance());
							}
							//End Display Code Segment. 
							if (j==12) {
								dblTotalBalance += accounts[account].getBalance();
							}
					  }
				  }//End For loop
			  }//End Outer for loop

				//Display Summary
						System.out.println(strLineNumber[0][0] + strLineNumber[1][0]);
						System.out.println(strLineNumber[0][1] + strLineNumber[1][1]);
						System.out.println(strLineNumber[0][2] + strLineNumber[1][2]);
						System.out.println(strLineNumber[0][3] + strLineNumber[1][3]);
						System.out.println(strLineNumber[0][4] + strLineNumber[1][4]);
						System.out.println(strLineNumber[0][5] + strLineNumber[1][5]);
						System.out.println(strLineNumber[0][6] + strLineNumber[1][6]);
						System.out.println(strLineNumber[0][7] + strLineNumber[1][7]);
						System.out.println(strLineNumber[0][8] + strLineNumber[1][8]);
						System.out.println(strLineNumber[0][9] + strLineNumber[1][9]);
						System.out.println(strLineNumber[0][10] + strLineNumber[1][10]);
						System.out.println(strLineNumber[0][11] + strLineNumber[1][11]);
						System.out.println(strLineNumber[0][12] + strLineNumber[1][12]);
						System.out.println("");
						System.out.println("Final balance of both accounts combined: " + defaultFormat.format(dblTotalBalance));
				//End Display Summary

	}//End main

}//End SavingsAccountDriver
