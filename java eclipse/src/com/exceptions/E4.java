package com.exceptions;

public class E4 {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			Class.forName("java.util.Scanner");
			System.out.println("Exception not  Occurred");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("main ended");
	}

}
