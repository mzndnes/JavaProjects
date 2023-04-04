package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		//c.add("hello");
		c.add(30);
		c.add(55);
		//c.add(20.45);
		c.remove(30);
		Iterator i=c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		for(Object i:c) {
//			System.out.println(i);
//		}
		
	}

}
