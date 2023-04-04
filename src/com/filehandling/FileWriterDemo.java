package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterDemo {

	
	public static void main(String[] args) {
		int ch=1;
		String data;
		try {
			FileWriter fw=new FileWriter("Student.txt");
//			PrintWriter pw = new PrintWriter(fw);
			Scanner sc=new Scanner(System.in);
			while(ch==1)
			{
				System.out.println("Enter text to write");
				data=sc.nextLine();
				fw.write(data);
//			    pw.println(data);
			    System.out.println("Enter 1 to add more otherwise 0");
			    ch=Integer.parseInt(sc.nextLine());
			}
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {}

	}

}
