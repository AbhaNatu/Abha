package com.tostring;

public class MainClass {
	public static void main(String[] args) {
	Employee e=new Employee(1,"Abha",12);
	TestEngineer t=new TestEngineer(3,"Madhu",10.32,"Selenium");
	Developer d=new Developer(4,"Durga",10.33,"java");
	System.out.println(e);
	System.out.println(t);
	System.out.println(d);
	}
}
