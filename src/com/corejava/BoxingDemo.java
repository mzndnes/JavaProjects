package com.corejava;

public class BoxingDemo {
	public static void main(String[] args) {
		int num1=10;
		Integer obj1=num1; //autoboxing
		Integer obj2=new Integer(num1);
		Double obj3=new Double("6.84");
		Double obj4=Double.valueOf(num1);
		Integer obj5=Integer.valueOf(num1);
		Integer obj6=Integer.parseInt("45");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		
		System.out.println(obj1.compareTo(10));
		System.out.println(obj2.equals(2.5));
	}
}
