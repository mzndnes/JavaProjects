package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer>name=new HashMap<>();
		name.put("ram", 1);
		name.put("ram", 2);
		name.put("gita", 4);
	
		for(String n:name.keySet())
				System.out.println(name.get(n));
	}

}
