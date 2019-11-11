package com.methodoverriding;

public class C  extends B{
	int k=30;
	void display()
	{
		super.display();
		System.out.println(k);
	}


}
