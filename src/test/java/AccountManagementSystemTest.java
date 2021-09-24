import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.*;
import org.junit.Before;
import org.junit.Test;


public class AccountManagementSystemTest {

	private SavingsAccount ZakatunderTest;
	private Account AccountunderTest;
	private CheckingAccount CheckingunderTest;

	@Before
	public void setUp() {
		ZakatunderTest = new SavingsAccount();
		AccountunderTest = new Account();
		CheckingunderTest = new CheckingAccount();
		
		LinkedList<String> accBalanceL = new LinkedList<String>();
		accBalanceL.add(0, "435");
		
	}

	//calculateZakat-Positive
	@Test
	public void testcalculateZakat() {
		double expected =250000;
		
		//Act
		double result = ZakatunderTest.calculateZakat(0, 250000);
	
		//Assert
		assertEquals(expected,result,250000);
		//fail("Not yet implemented");
	}
	
	
	//calculateZakat-Negative
		@Test
		public void testcalculateZakatNeg() {
			double expected =80;
			
			//Act
			double result = ZakatunderTest.calculateZakat(0, 25);
		
			//Assert
			assertEquals(expected,result,0);
			//fail("Not yet implemented");
		}
	
	//calculateInterest
	@Test
	public void testcalculateInterest() {
		double expected =0.625;
		
		//Act
		double result = ZakatunderTest.calculateInterest(0, 25);
		
		//Assert
		assertEquals(expected,result,0);
		//fail("Not yet implemented");
	}
	
	//calculateInterest-Negative
		@Test
		public void testcalculateInterestNeg() {
			double expected =0.625;
			
			//Act
			double result = ZakatunderTest.calculateInterest(-2, 250);
			
			//Assert
			assertEquals(expected,result,0);
			//fail("Not yet implemented");
		}
	
	//makeDeposit-True
		@Test
		public void testmakeDeposit() {
			//boolean expectedT = true;
			
			//Act
			boolean resultT = AccountunderTest.makeDeposit(2500, 0);

			//Assert
			assertTrue(resultT);
			//fail("Not yet implemented");
		}
		
		//makeDeposit-False
				@Test
				public void testmakeDepositF() {
					//boolean expectedF = false;
				
					//Act
					boolean resultF = AccountunderTest.makeDeposit(-2500, 0);
					//Assert
					assertFalse(resultF);
					//fail("Not yet implemented");
				}
			

				//checkBalance
					@Test
					public void testcheckBalance() 
					{
						int expected = 435;
						int result = AccountunderTest.checkBalance(0);
						assertEquals(expected,result);
					}
					
					
					//makeWithdrawAC-True
					@Test
					public void testmakeWithdrawAC() {
						//boolean expectedF = false;
					
						//Act
						boolean resultF = CheckingunderTest.makeWithdrawAC(4500, 0);
						//Assert
						assertFalse(resultF);
						//fail("Not yet implemented");
					}
					
					//makeWithdrawAC-True
					@Test
					public void testmakeWithdrawACFalse() {
						//boolean expectedF = false;
					
						//Act
						boolean resultT = CheckingunderTest.makeWithdrawAC(45000, 0);
						//Assert
						assertTrue(resultT);
						//fail("Not yet implemented");
					}
	
	
	

}
