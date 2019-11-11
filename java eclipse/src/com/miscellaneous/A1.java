package com.miscellaneous;

class A1 {
	static int x=10;
	int y=20;
	static
	{
		System.out.println("from sib of a");
	}
	{
		System.out.println("from iib of a");
	}
	A1()
	{
		System.out.println("from A1()");
	}

}
