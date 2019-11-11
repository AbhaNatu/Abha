package com.constructor;

public class Books {
	String name;
	int price;
	int isbn;
	static int x;
	Books()
	{
		++x;
		this.isbn=x;
	}
	Books(String name,int price)
	{
		this();
		this.isbn=isbn;
		this.name=name;
		this.price=price;
		
	}
void genre(String genre)
	{
		System.out.println(name+" is of "+genre+"genre");
	}
		
}
