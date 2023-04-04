package com.renu;

public class IUboxing {
	public static void main(String[] args) {
		int a=10;
		Integer b=new Integer(a); //boxing
		int c=b.intValue(); //unboxing
		
		Integer d=a; //auto boxing
		c=d; // auto unboxing
		
		System.out.println(d);
		System.out.println(c);
		
		String salary="1234";
		c=Integer.parseInt(salary);
		System.out.println(salary);
	}
}
