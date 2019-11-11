package com.miscellaneous;

public class Company {
	public static void main(String[] args) 
	{
		Employee.createObject(1, "Abha", 10002.0).display();
		Employee.createObject(2, "Madhu", 2002.1).display().initialize(20000.1).display();
	 }

}
