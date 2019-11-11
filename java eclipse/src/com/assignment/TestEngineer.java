package com.assignment;

 class TestEngineer extends Employee1 {
 String tool;
TestEngineer(int id,double salary,String name,String tool)
{
	super( id, salary, name);
	this.tool=tool;
}
public static void main(String[] args) {
      TestEngineer ob1=new TestEngineer(34,2300.3,"Abha","eclipse");
      System.out.println(ob1.id);
      System.out.println(ob1.name);
      System.out.println(ob1.salary);
      System.out.println(ob1.tool);
}
}
