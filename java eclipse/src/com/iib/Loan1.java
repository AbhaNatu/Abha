package com.iib;

public class Loan1 {
	String name;
	double roi;
	Loan1()
	{
		
	}
	Loan1(String name,double roi)
	{
		this.name=name;
		this.roi=roi;
	}
	void interest()
	{
		System.out.println(name+ " "+roi);
	}
	public static void main(String[] args) {
		Loan1 l1=new Loan1("Vehicle loan",10.0);
		Loan1 l2=new Loan1("Home loan",13.3);
		Loan1 l3=new Loan1("Personal loan",14.0);
	
	Loan1[] loan= {l1,l2,l3,new Loan1("Jewel loan",10.0)};
	for(int i=0;i<loan.length;i++)
	{
		System.out.println(loan[i].name+" "+loan[i].roi);
		
	}
	
  }
}
	

