package com.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters,  or 'q' to quit.");
		 // read characters
		 do {
		 c = (char) br.read();
		 System.out.println(c);
		 } while(c != 'q'); 
	}
}
