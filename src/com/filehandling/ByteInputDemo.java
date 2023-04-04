package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputDemo {
	public static void main(String[] args) {
		int ch;
		try {
			FileInputStream fis=new FileInputStream("Student.txt");
			ch=fis.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=fis.read();
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {}
	}
}
