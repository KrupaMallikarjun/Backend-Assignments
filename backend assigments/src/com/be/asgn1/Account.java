package com.be.asgn1;

public class Account {
private double balance;
public Account()
{
	balance=0.0;
}
public void deposite(int amount) {
	balance=balance+amount;
	System.out.println("customer deposited amount is "+balance);
	System.out.println("--------------------------------------------------------------------------------");
}
public void withdraw(int amount)
{
	if(amount<=balance)
	{
	balance=balance-amount;
	System.out.println("customer withdraw amount is "+amount);
	}
	else
	{
		System.out.println("insufficient balance");
	}
	System.out.println("--------------------------------------------------------------------------------");
}
public double getbalance()
{
	System.out.println("customer current balance is:");
	return balance;
}
}
