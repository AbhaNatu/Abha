package com.abstractclass;

public class Main {
	public static void main(String[] args) {
		Shape s;
		s=new Circle(2);
		System.out.println(((Circle)s).radius);
		s.area();
		System.out.println(s.area());
		s=new Rectangle(10,2);
		s.area();
		
		System.out.println(s.area());
	}

}
