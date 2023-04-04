package com.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo2 {
	public static void main(String[] args) throws IOException {
		String line;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter line,  or 'quit' to quit.");
		 // read characters
		 do {
		 line = br.readLine();
		 System.out.println(line);
		 } while(!line.equalsIgnoreCase("quit")); 
	}
}
