package com.abstractclass;

class Rectangle extends Shape {
	int length;
	int breadth;
	Rectangle(){}
	Rectangle(int length,int breadth)
	{
		this.breadth=breadth;
		this.length=length;
	}
   double area()
   {
	   return(length*breadth);
   }
}
