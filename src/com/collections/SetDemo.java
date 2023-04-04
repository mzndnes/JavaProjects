package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> prices1=new HashSet();
		Set<Integer> prices2=new HashSet();
		prices1.add(45);
		prices1.add(3);
		prices1.add(4);
		prices1.add(3);
		
		prices2.add(45);
		prices2.add(5);
		prices2.add(4);
		prices2.add(7);
		
		
		for(Integer price:prices1) {
			System.out.println(price);
		}
	}
}
