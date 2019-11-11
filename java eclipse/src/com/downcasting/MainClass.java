package com.downcasting;

class MainClass {
	public static void main(String[] args) {
		A ob1=new A(20);
			display(ob1);
			A ob2=new A(30);
			display(ob2);
			B ob3=new B(15,35);
			display(ob3);
			C ob4=new C(20,21);
			display(ob4);
	}
	static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
		{
			System.out.println(((B)obj).j);
		}
		if(obj instanceof C)
		{
			System.out.println(((C)obj).k);
			
		}
		System.out.println("_____________");
	}

}
