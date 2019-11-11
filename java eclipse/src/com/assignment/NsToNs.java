package com.assignment;
class NsToNs {
	int i;
	int j;
	
	void m1()
	{
	   i=60;
	   j=20;
	   System.out.println(this.i);
	   System.out.println(j);
	}
	public static void main(String[] args) {
		NsToNs ob=new NsToNs();
		ob.m1();
	}
}
