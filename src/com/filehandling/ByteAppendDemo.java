package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteAppendDemo {
	static String word;
	static void writeToFile(FileOutputStream fos) throws IOException {
		for(int i=0;i<word.length();i++)
			fos.write(word.charAt(i));
			fos.write('\n');
	}
	public static void main(String[] args) {
		int ch=1;
		try {
			FileOutputStream fos=new FileOutputStream("Student.txt",true);
			Scanner s=new Scanner(System.in);
			while(ch==1) {
				System.out.println("Enter the text to write");
				word=s.next();
				writeToFile(fos);
				System.out.println("Press 1 to add more otherwise 0");
				ch=s.nextInt();
			}
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {}

	}

}
