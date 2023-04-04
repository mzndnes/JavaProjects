package com.console;
import java.util.Scanner;

public class StringWithScanner {

	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name");
//		name=sc.next();
		name=sc.nextLine();
		System.out.println("Your full name is "+name);
	}
}
