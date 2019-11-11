package com.methodoverriding;

public class MainClass1 {
	public static void main(String[] args) {
	A ob1=new A();
	ob1.display();
	System.out.println("_______________");
	B ob2=new B();
	ob2.display();
	System.out.println("_______________");
	C ob3=new C();
	ob3.display();
	System.out.println("_______________");
}
}
