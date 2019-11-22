package com.hashCode;

public class Developer extends Employee {
	String language;
	Developer()
	{
		
	}
	public Developer(int id,String name,double salary,String language) {
		super(id,name,salary);
		
		this.language = language;
	}
	
	public String toString() {
		return super.toString()+ " " +language;
	}
	public boolean equals(Object ob)
	{
		Developer temp=(Developer)ob;
		return super.equals(ob) && this.language==temp.language;
	}
	public int hashCode()
	{
		int hash=super.hashCode()+language.hashCode();
		return hash;
	}
}
