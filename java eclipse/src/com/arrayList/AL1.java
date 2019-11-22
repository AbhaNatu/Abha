package com.arrayList;

import java.util.ArrayList;

public class AL1 {
	 public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Tejha");
		System.out.println(al);
		al.add(1,"Sudarshan");
		System.out.println(al);
		al.add("Hitesh");
		
		al.add("Adithya");
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		Object ob=al.set(5,"Harshit");
		System.out.println(ob);
		System.out.println(al);
		System.out.println(al.contains("Ashmitha"));
		System.out.println(al.add(20));
		System.out.println(al);
		System.out.println(al.indexOf("Theja"));
		System.out.println(al.size());
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
