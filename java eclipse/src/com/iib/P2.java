package com.iib;

public class P2 
{
	int i;
	{
		System.out.println(i);
		i=20;
		System.out.println("form iib");
	}
		P2()
		{
			System.out.println("from P2()");
			
		}
		P2(int i)
		{
			
		 System.out.println(this.i);
		 this.i=i;
		 }
		public static void main(String[] args) {
			System.out.println("main starts");
			P2 ob = new P2();
			System.out.println(ob.i);
			P2 ob1=new P2(10);
			System.out.println(ob1.i);
			System.out.println("main ends");
	    }
	  
	}
