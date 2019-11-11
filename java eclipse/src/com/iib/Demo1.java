package com.iib;

public class Demo1 {
Demo1()
{
	System.out.println("from demo1()");
}
Demo1(int x)
{
	this(20,10);
 System.out.println("from demo1(int)");
}
Demo1(int x,int y)
{
	this();
	System.out.println("from demo1(int,int)");
}

public static void main(String[] args) {
	Demo1 ob1=new Demo1();
	System.out.println("* * * * *");
	Demo1 ob2= new Demo1(10);
	Demo1 ob3= new Demo1(10,20);
}
}
