import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;


public class AccountManagementSystemTest {

	private SavingsAccount ZakatunderTest;
	private Account AccountunderTest;

	@Before
	public void setUp() {
		ZakatunderTest = new SavingsAccount();
		AccountunderTest = new Account();
		
	}

	//calculateZakat
	@Test
	public void testcalculateZakat() {
		double expected =0;
		
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
					
					
					//makeDeposit-False
					@Test
					public void testmakeWithdrawAC() {
						//boolean expectedF = false;
					
						//Act
						boolean resultF = AccountunderTest.makeDeposit(-2500, 0);
						//Assert
						assertFalse(resultF);
						//fail("Not yet implemented");
					}
	
	
	

}
