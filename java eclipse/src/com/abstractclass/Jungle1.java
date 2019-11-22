package com.abstractclass;

public class Jungle1 {
	public static void main(String[] args) {
		Animal a;
		a=new Dog(12,34.3);
		a.talk();
	System.out.println(a.hieght+" "+a.weight);
		
		a=new Lion(14,40.3);
		a.talk();
		System.out.println(a.hieght+" "+a.weight);
		
		
		a=new Cat(5,14.23);
		a.talk();
		System.out.println(a.hieght+" "+a.weight);
	}

}
