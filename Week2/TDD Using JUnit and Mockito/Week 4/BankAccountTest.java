package com.example.JUnitDemo;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
public class BankAccountTest {
  private BankAccount account;
	@Before
	public void setUp()
	{
		account=new BankAccount(15000.0);
		System.out.println("Test Setup is Done");
	}
	
	@Test
	public void testDeposit()
	{
		double depositamt=400;
		account.deposit(depositamt);
		assertEquals(15400,account.getBalance(),0.001);
	}
	public void testWithdraw()
	{
		double withdrawamt=600;
		account.withDraw(withdrawamt);
		assertEquals(14400,account.getBalance(),0.001);
	}
	@After
	public void tearDown()
	{
		account=null;
		System.out.println("Test teardown done");
	}
	 public void testWithdrawMoreThanBalance() {
	       //Arrange
	        double withdrawAmount = 20000.0;
	        // Act
	        account.withDraw(withdrawAmount);
	        // Assert
	        assertEquals(15000.0, account.getBalance(), 0.001);
	    }
}
