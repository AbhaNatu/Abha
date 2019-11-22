package com.finalkeyword;

public class P2 extends P1 {
	void test()// cannot override the final method.
	{
		System.out.println("from test() of P2");
	}

public static void main(String[] args) {
	P2 ob=new P2();
	ob.test();//no cte because test() of P1 is inherited in P2.
}
}
