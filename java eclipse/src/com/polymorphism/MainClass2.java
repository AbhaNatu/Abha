package com.polymorphism;

public class MainClass2 {
	public static void main(String[] args) {
		Bank[] b=new Bank[4];
		b[0]=new ICICI();
		b[1]=new CanaraBank();
		b[2]=new SBI();
		b[3]=new SBIInTouch();
		for(Bank bank:b)
		{
			System.out.println(bank.rateOfInterest());
		}
	}

}
