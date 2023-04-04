package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("Food.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String s = br.readLine();
			while(s!=null)
			{
			    System.out.println(s);
			    s = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {}
	}
}
