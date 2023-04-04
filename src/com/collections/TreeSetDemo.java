package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> prices=new TreeSet();
		prices.add(45);
		prices.add(1);
		prices.add(3);
		prices.add(4);
		prices.add(3);
		
		for(Integer price:prices) {
			System.out.println(price);
		}
	}
}
