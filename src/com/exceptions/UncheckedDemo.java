package com.exceptions;

public class UncheckedDemo {

	public static void main(String[] args) {
		int []arr=null;
		arr=new int[4];
		try {
			//arr[0]=1;
			//arr[4]=5;
			System.out.println(5/0);
		}catch(NullPointerException e) {
			System.out.println("hello");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outofbound");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}

	}

}
