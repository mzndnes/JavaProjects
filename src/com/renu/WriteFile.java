package com.renu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteFile {
	static String foodName;
	static int price;
	public static void writeFood(FileWriter fw) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter food name");
		foodName=s.next();
		System.out.println("Enter the price");
		price=s.nextInt();
		fw.write(foodName);
		fw.write(String.valueOf(price));
		fw.write("\n");
	}
	public static void main(String[] args) {
		FileWriter fw;
		Scanner s;
		int ch=1;
		String name;
		try {
			fw=new FileWriter("Food.txt");
			s=new Scanner(System.in);
			while(ch==1) {
				writeFood(fw);
				System.out.println("Press 1 to add more otherwise 0");
				ch=s.nextInt();
			}
			fw.close();
		}
		catch(Exception e) {
			System.out.println("Could not open file");
		}
	}
}
