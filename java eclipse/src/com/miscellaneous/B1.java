package com.miscellaneous;

class B1 extends A1 {
static int i;
int j=200;
static
{
	System.out.println("from sib of b");
}
{
	System.out.println("from iib of b");
}
B1()
{
	System.out.println("from b()");
}
}
