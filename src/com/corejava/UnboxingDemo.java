package com.corejava;

public class UnboxingDemo {

	public static void main(String[] args) {
		Integer obj=10;
		
		int num1=obj.intValue();  //unboxing
		int num2=Integer.parseInt("22");
		String str=String.valueOf(num1);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str);

	}

}
