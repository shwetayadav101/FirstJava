package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class Account {

	String accType;
	String accNumber;
	double balance;
	public Account(String accType, String accNumber, double balance) {
		super();
		this.accType = accType;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	public double withDraw(double amt) throws MinBalNotMaintainedException
	
	{
		System.out.print("Transaction starts ......'");
		try {
			
		
			if(amt <= 0)
			{
				throw new IllegalArgumentException("Withdrawn ammout should be greater than 0");
			}
			if(this.balance - amt < 1000)
			{
				throw new MinBalNotMaintainedException("Balance cannot go below 1000");
				
			}
			this.balance -= amt;
			return this.balance;
		}
		finally {
			System.out.print("Transaction ends.....");
		}
		
	}
	
	public double Deposit(double amt)
	{
		return balance += amt;
	}
	
	
}
