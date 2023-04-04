package com.renu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		Scanner sc;
		String name;
		try {
			FileReader fr=new FileReader("Food.txt");
			sc=new Scanner(fr);
			while(sc.hasNext()) {
				name=sc.next();
				System.out.println(name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
