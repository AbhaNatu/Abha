package com.arrayList;

import java.util.ArrayList;

public class HetroAL {
	public static void main(String[] args) {
		ArrayList hetro=new ArrayList();
		hetro.add(new Bike("red",60));
		hetro.add(new Emp(1,"Vishnu"));
		//Movie m=new Movie("Bala",5.3);
		hetro.add(m);
		hetro.add(10);
		System.out.println(hetro);
}
}
