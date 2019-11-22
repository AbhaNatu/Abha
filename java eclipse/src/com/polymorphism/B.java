package com.polymorphism;

public class B extends A {
	void test() {
		System.out.println("from test () of B");
	}
 public static void main(String[] args) {
	A ob;
	ob=new A();
	ob.test();//from test () of A
	
	ob=new B();//upcatsing
	ob.test();//polymorphism
	
	ob=new C();
	ob.test();
	
	ob=new A();//upcatsing
	ob.test();
}
}
