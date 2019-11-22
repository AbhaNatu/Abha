package com.encapsulation;

public class Main {
	public static void main(String[] args) {
		Employee E=new Employee(1,"abha",10.0);
		System.out.println("Employee name"+E.getName());
		System.out.println("Employee id"+ E.getId());
		System.out.println("Current Salary"+E.getSalary());
		E.setSalary(1000.0);
		System.out.println("employee salary"+E.salary);
	
	}

}
