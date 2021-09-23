import java.util.LinkedList;
import java.util.Scanner;


class CheckingAccount extends Account {
	
	public void makeWithdrawAC (int index, int money)
	{
		if (index>=accBalanceL.size())
		{
			System.out.println("Your account is already empty can withdraw 5000 PKR maximum " );
		}
	}
	
	public void displayAllDeductions()
	{
		System.out.println("Following are all the deductions from Checking Account" );
	}
	
}