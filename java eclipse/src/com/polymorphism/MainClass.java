package com.polymorphism;

public class MainClass {
	public static void main(String[] args) {
	Bank ob;
	ob=new ICICI();
	System.out.println(ob.rateOfInterest());
	ob=new CanaraBank();
	System.out.println(ob.rateOfInterest());
	ob=new SBIInTouch();
	System.out.println(ob.rateOfInterest());
	ob=new SBI();
	System.out.println(ob.rateOfInterest());
	}
}
