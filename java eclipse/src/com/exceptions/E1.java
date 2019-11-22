package com.exceptions;

public class E1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		int a=10;
		System.out.println(1);
		int b=0;
		System.out.println(2);
		int c=a/b;                    //ArithmaticException
		System.out.println("main ends");
	}

}
