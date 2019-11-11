package com.instanceOf;

public class MainClass {
	public static void main(String[] args) {
	A ob1=new B();
	System.out.println(ob1 instanceof A);
	System.out.println(ob1 instanceof B);
	//System.out.println(ob1 instanceof D);
	
	B ob2=new B();
	System.out.println(ob2 instanceof B);
	System.out.println(ob2 instanceof A);
	//System.out.printl(ob2 instanceof D);
	
	A ob3= new A();
	System.out.println(ob3 instanceof A);
	System.out.println(ob3 instanceof B);
	
	}

}
