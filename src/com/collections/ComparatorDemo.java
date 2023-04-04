package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparableImp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1>o2?1:-1;
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		List<Integer>values=new ArrayList<Integer>();
		values.add(4);
		values.add(44);
		values.add(22);
		values.add(1);
		Comparator c=new ComparableImp();
		Collections.sort(values,c);
		for(Integer i:values)
			System.out.println(i);
	}
}
