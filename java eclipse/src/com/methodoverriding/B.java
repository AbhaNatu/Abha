package com.methodoverriding;

public class B extends A {
	int j=20;
	void display()
	{
		super.display();
		//System.out.println(i);
		System.out.println(j);
	}


}
