package com.abstractIninterface;

public class ATMImplementation implements ATM {
long balance;
ATMImplementation(){}
ATMImplementation(long balance)
{
	this.balance=balance;
}

public void deposit(long depositAmount)
{
	if(depositAmount>0)
	{
		balance =depositAmount+balance;
		//checkBalance();
	}
	else
		System.out.println("invalid amount");
}

public void withdrawal(long withdrawalAmount)
{
	if(withdrawalAmount<=balance)
	{
		balance=balance-withdrawalAmount;
		System.out.println("Sucessfully withdrawn"+ " "+withdrawalAmount);
	}
	else
		System.out.println("Insufficient Balanace");
}
  public long checkBalance()
  {
	  if(balance>0)
	  {
		  System.out.println(balance);
	  }
	  else
		  System.out.println("not sufficient balance");
  }
}