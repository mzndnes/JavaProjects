package com.lab;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class GoldenBoot {
	
	public static String getMaximumGoal(Map<String,Integer>goals) {
		String striker="";
		int numGoal=-1;
		for(String key:goals.keySet()) {
			if(goals.get(key)>numGoal) {
				striker=key;
				numGoal=goals.get(key);
			}
		}
		return striker;
	}

	public static void main(String[] args) {
		Map<String,Integer> goals=new HashMap<>();
		try {
			FileReader fr=new FileReader("Golden.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line!=null)
			{
				String []record=line.split(" ");
				
				if (goals.containsKey(record[0]))
					goals.put(record[0], Integer.parseInt(record[1])+goals.get(record[0]));
				else
					goals.put(record[0], Integer.parseInt(record[1]));
			    
			    line= br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {}
		System.out.println(getMaximumGoal(goals));

	}

}
