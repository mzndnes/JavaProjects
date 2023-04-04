package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> prices=new ArrayList();
		prices.add(45);
		prices.add(3);
		prices.add(0,88);
		
		for(Integer price:prices) {
			System.out.println(price);
		}
	}
}
