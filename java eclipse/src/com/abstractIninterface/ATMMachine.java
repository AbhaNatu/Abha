package com.abstractIninterface;

public class ATMMachine {
 public static void main(String[] args) {
	ATM atm=new ATMImplementation(10000);
	atm.deposit(5000); 
	System.out.println("******");
	atm.checkBalance();
	System.out.println("******");
	atm.withdrawal(5000);
	
}
}
  