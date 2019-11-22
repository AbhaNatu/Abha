package com.practice;

public class MethodOverloading {
	int i;
	int j;
 void add()
 {
	 System.out.println("from empty add");
 }
 void add(int i,int j)
 {
	 System.out.println(i+j);
 }
 public static void main(String[] args) {
	 MethodOverloading mo=new MethodOverloading();
			 mo.add();
	 mo.add(12,21);
}
}
