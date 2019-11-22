package com.finalkeyword;

public class Demo2 {
public static void main(String[] args) {
	test(10);
}
static void test(final int i)
{
	System.out.println(i);
	i=20;//cte: becoz can't reassign value of final variable
   System.out.println(i+20);//we can use the variable
}
}
