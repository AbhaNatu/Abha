package com.hashCode;

public class MainClass {
	public static void main(String[] args) {
		TestEngineer e1=new TestEngineer(1,"abha",20.2,"Selenium");
		TestEngineer e2=new TestEngineer(2,"abc",25.2,"ALM");
		Developer d1=new Developer(3,"jef",12.3,"Java");
		Developer d2=new Developer(3,"jef",12.3,"Java");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(d1.equals(d2));
		System.out.println(e1==e2);
		System.out.println(d1==d2);
		
	
	}

}
