import java.util.LinkedList;
import java.util.Scanner;

class Account{
	private String name;
	private String address;
	private String mob_no;
	private String acc_no;
	private String acc_type;
	String storeTotal;
	//Linked List that will maintain account balance
	LinkedList<String> accBalanceL = new LinkedList<String>();
	String addup=null;
	int total=0;
	
	
	//Getter Setters
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	
	//The Deposit Function will deposit the specified amount in the account.
	public boolean makeDeposit(int amount,int index) 
	{
		if (amount < 0)
		{
			System.out.println("Amount you've entered is negative");
			return false;
		}
		String amountStr = String.valueOf(amount);
		
		if (index>=accBalanceL.size())
		{
			System.out.println("Your account was empty previously" );
			accBalanceL.add(index,amountStr);
			System.out.println("The amount has been added successfully" );
			addup = accBalanceL.get(index);
			return true;
		}
	
		else 
		{
			int finalAm = Integer.parseInt(amountStr);
			int addupint = Integer.parseInt(addup);
			finalAm = finalAm + addupint;
			String amountStrnow = String.valueOf(finalAm);
			accBalanceL.add(index,amountStrnow);
			System.out.println("The amount has been added successfully" );
			addup = accBalanceL.get(index);
			return true;
		}
		
		
		
	}
	
	public int checkBalance(int index) 
	{
		System.out.println("The total amount in your bank is " + accBalanceL.get(index));
		int retInt = Integer.parseInt(accBalanceL.get(index));
		   return retInt;
	}
	

}

public class AccountingSystem {

	public static void main(String[] args) {
		int count = -1;
		int i=0;
		
		// TODO Auto-generated method stub
		//Linked List that will maintain names
		LinkedList<String> nameL = new LinkedList<String>();
		
		//Linked List that will maintain addresses
		LinkedList<String> addressL = new LinkedList<String>();
		
		//Linked List that will maintain addresses
		LinkedList<String> mobileL = new LinkedList<String>();
		
		//Linked List that will maintain account numbers
		LinkedList<String> accNumL = new LinkedList<String>();
		
		//Linked List that will maintain account types
		LinkedList<String> accType = new LinkedList<String>();
		
		//Linked List that will maintain account balance
		//LinkedList<String> accBalanceL = new LinkedList<String>();
		
		boolean abort = false; 
		
		//Creating objects of our classes
		Account ac = new Account();
		CheckingAccount checkAcc = new CheckingAccount();
		SavingsAccount SavAcc = new SavingsAccount();
		
		do
		{
			count++;
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Enter   1. To open an acount or close an account");
			System.out.println("	2. To login to your account to perform further actions");
			//System.out.println("	3. To deposit a specified amount in the account.");
			System.out.println("	0. To abort the program");
			System.out.println("----------------------------------------------------------------------------------");
		
		int choice;
		Scanner ch = new Scanner(System.in);
		choice = ch.nextInt();
		
		switch(choice) {
			case 1:{
				
				System.out.println("Enter 'open' to open an Account and 'close' to close an Account");
				String open = "open"; String close = "close";
				Scanner oc = new Scanner(System.in);
				String openIn = oc.next();
				
				
				
				if (openIn.equals(open)) {
					//ACCOUNT CRAETION
					System.out.println("Follow the following steps to create an account");
					System.out.println("Enter your name");
					Scanner nm = new Scanner(System.in);
					ac.setName(nm.nextLine());
					nameL.add(ac.getName());
					
					
					System.out.println("Enter your address");
					Scanner addr = new Scanner(System.in);
					ac.setAddress(addr.nextLine());
					addressL.add(ac.getAddress());
					
					System.out.println("Enter your Phone number");
					Scanner ph = new Scanner(System.in);
					ac.setMob_no(ph.nextLine());
					mobileL.add(ac.getMob_no());
					
					System.out.println("What type of account do you want to create 'checking/savings'");
					Scanner acIn = new Scanner(System.in);
					String accTypeIn = acIn.next();
					String checking = "checking";	String savings = "savings";
					
					//if(accTypeIn.equals(checking) && accTypeIn.equals(savings)) 
					{
						ac.setAcc_type(acIn.nextLine());
						accType.add(ac.getAcc_type());
					}
					//else
					{
						//System.out.println("Please enter 'checking/savings' CORRECTLY!!");
						//break;
					}
						
					String accNo = String.valueOf(count);
					ac.setAcc_no(accNo);
					accNumL.add(ac.getAcc_no());
					System.out.println("Your account number is: " + accNo);
					
					System.out.println("CONGRATULATIONS!!! Your account has been created successfully! ");
				}
				
				else if (openIn.equals(close))
				{
					//ACCOUNT DELETION
					System.out.println("Follow the following steps to close an account");
					System.out.println("Enter the account no you want to get closed");
					Scanner closeIn = new Scanner(System.in);
					int closeNum = closeIn.nextInt();
					
					//Checking if the entered account number exists or not
					String check = String.valueOf(closeNum);
					if (accNumL.contains(check))
						{
						nameL.remove(closeNum);
						addressL.remove(closeNum);
						mobileL.remove(closeNum);
						accNumL.remove(closeNum);
						
						System.out.println("The account having account number " + closeNum + " has been closed");
						}
					
					else
						System.out.println("The specified account number does not exist");
						
				}
				
				else
					System.out.println("Please enter 'open'/'close' correctly!!");
					
			
				
				break;
			}
			
			case 2:
			{
				System.out.println("Enter your account number in order to log in to your account");
				Scanner accIn = new Scanner(System.in);
				int logIn = accIn.nextInt();
				try {
				System.out.println("The name of this account holder: "+nameL.get(logIn));
				System.out.println("The address of this account holder: "+addressL.get(logIn));
				System.out.println("The mobile number of this account holder: "+mobileL.get(logIn));
				System.out.println("The user has : "+accType.get(logIn) + " account");
				}
				catch (Exception e)
				{
					System.out.println("The specified account number does not exist");
					break;
				}
				
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("Enter 5. if you want to deposit money");
				System.out.println("Enter 6. if you want to withdraw from Checking Account ");
				System.out.println("Enter 7. if you want to withdraw from Savings Account ");
				System.out.println("Enter 8. if you want to check your total balance");
				System.out.println("Enter 9. if you want to calculate Zakaat");
				System.out.println("Enter 10. if you want to calculate interest");
				System.out.println("Enter 11. if you want to display deductions from Checking Account ");
				System.out.println("----------------------------------------------------------------------------------");
				
				int choice2;
				Scanner ch2 = new Scanner(System.in);
				choice2 = ch2.nextInt();
				
				switch(choice2)
				{
				case 5:
					{
						System.out.println("Enter the amount you want to deposit");
						Scanner moneyIn = new Scanner (System.in);
						int moneyEntered = moneyIn.nextInt();
						ac.makeDeposit(moneyEntered,logIn);
						break;
					}
					
				case 6:
					{
						System.out.println("Enter the amount you want to withdraw from Checking Account");
						Scanner moneyWithD = new Scanner (System.in);
						int moneyEnteredAC = moneyWithD.nextInt();
						checkAcc.makeWithdrawAC(logIn,moneyEnteredAC);
						break;
					}
					
				case 7:
				{
					System.out.println("Enter the amount you want to withdraw from Checking Account");
					Scanner moneyWD = new Scanner (System.in);
					int moneyEnteredAC = moneyWD.nextInt();
					SavAcc.makeWithdrawSA(logIn,moneyEnteredAC);
					break;
				}
					
					
				case 8:
				{
					ac.checkBalance(logIn);
					break;
				}
				
				case 9:
				{
					//String TotalB = null;
					  i = ac.checkBalance(logIn);
					 //System.out.println(i);
					if (accType.get(logIn).equals("savings"))
					{
						SavAcc.calculateZakat(logIn,i);
					}
					else
						System.out.println("You do not have savings account, You can not calculate zakaat");
					break;
				}
				
				
				case 10:
				{
					if (accType.get(logIn).equals("savings"))
					{
						 i = ac.checkBalance(logIn);
						SavAcc.calculateInterest(logIn,i);
					}
					else
						System.out.println("You do not have savings account, You can not calculate interest");
					break;
				}
				
				case 11:
				{
					checkAcc.displayAllDeductions();
					break;
				}
				
				default:
					System.out.println("Invalid Entry!! Please enter a number within the specified range again");
				
				}
				break;
			}
			
			case 3:
			{
				/*System.out.println("Enter the amount you want to deposit");
				Scanner moneyIn = new Scanner (System.in);
				int moneyEntered = moneyIn.nextInt();
				ac.makeDeposit(moneyEntered);
				break;*/
				
			}
			
			case 0:
				abort = true;
				break;
				
			default:
				System.out.println("Invalid Entry!! Please enter a number within the specified range again");
		
		}
		
	}while(!abort);
		System.out.println("Program Aborted!!");
			

	}

}
