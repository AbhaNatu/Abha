package com.practice;
class Demo
{
	Demo()
	{
		
	}
	/*Demo(int i,int j)
	{
		System.out.println(i+j);
	}*/
	Demo(boolean b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		Demo ob=new Demo(true);
		//Demo ob1=new Demo(22,12);
	}
}