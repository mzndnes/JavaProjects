package com.console;
import java.util.Scanner;

public class StringWithScanner2 {

	public static void main(String[] args) {
		String full_name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name");
		full_name=sc.nextLine();
		System.out.println("Your full name is "+full_name);
	}
}