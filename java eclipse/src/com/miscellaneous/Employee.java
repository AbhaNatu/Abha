package com.miscellaneous;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	static Employee createObject(int id,String name,double sal)
	{
		return new Employee(id,name,sal);
	}
	Employee initialize(double sal)
	{
		this.sal=sal;
		return this;
	}
	Employee display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.sal);
		System.out.println("______________________");
		return this;
	}
	
}
 