package com.exceptions;

public class E5 {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int arr[]= {1,22,33};
		int x=1;
		E5 ob= new E5();
		try
		{
			c=a/b;
			System.out.println(c);
			System.out.println(arr[x]);
			//System.out.println(ob.i);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e +" has occurred");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+ " has occurred");
		}
		catch(Throwable e)
		{
			System.out.println("some error has occurred");
		}
	}

}
