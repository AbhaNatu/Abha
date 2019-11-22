package com.finalkeyword;

public class B extends A {
	static void test() {
		System.out.println("from test() of B");//can't perform method shadowing
		//for final method test() of A
	}

}
