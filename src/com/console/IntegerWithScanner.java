package com.console;
import java.util.Scanner;

public class IntegerWithScanner {

	public static void main(String[] args) {
		int length,breadth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		length=sc.nextInt();
		System.out.println("Enter breadth");
		breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("Area ="+area);
	}
}
