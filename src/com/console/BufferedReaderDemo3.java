package com.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo3 {

	public static void main(String[] args) throws IOException {
		int length,breadth;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length");
		length=br.read();
		System.out.println("Enter breadth");
		breadth=br.read();
		int area=length*breadth;
		System.out.println("Area ="+area);
	}

}
