package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AverageDemo {

	public static void main(String[] args) {
		List<Integer> c=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
			c.add(sc.nextInt());
		
		float sum=0;
		for(int i=0;i<c.size();i++)
			sum+=c.get(i);
		sum=sum/c.size();
		
		System.out.println("Average = "+sum);
		
	}

}
