package com.example.JUnitDemo;

public class BankAccount {

	private double balance;
	public BankAccount(double initialAmt)
	{
		this.balance=initialAmt;
	}
	public double getBalance()
	{
		return balance;
	}
	public void withDraw(double amt)
	{
		if(amt>0 && amt<balance)
		{
			balance-=amt;
		}
	}
	public void deposit(double amt)
	{
		balance+=amt;
	}
}
