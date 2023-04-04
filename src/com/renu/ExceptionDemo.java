package com.renu;
import java.lang.Math;

public class ExceptionDemo {
	public void calculate(int n) throws Exception{
		System.out.println(5/n);
	}
	public static void main(String[] args) {
		ExceptionDemo ed =new ExceptionDemo();
		try {
			ed.calculate(0);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
