package com.upcasting;

class MainClass {
 public static void main(String[] args) {
	A ob1= new B();
	System.out.println(ob1.i);
	//System.out.println(ob1.j);cte because can't access child class mem using parent type ref
	
	B ob2=new B();
	A ob3=ob2;
	System.out.println(ob2.i);
	System.out.println(ob2.j);
	//System.out.println(ob3.j);because can't access child class mem using parent type ref1
	System.out.println(ob3.i);
	
	C ob4=new C();
	B ob5=ob4;
	 System.out.println(ob4.i);//UC
	 System.out.println(ob4.j);//UC
	 System.out.println(ob4.k);//UC
	 
	 A ob6=ob4;
	 System.out.println(ob6.i);
	 //System.out.println(ob6.j);cte
	 //System.out.println(ob6.j);cte
 }
}  