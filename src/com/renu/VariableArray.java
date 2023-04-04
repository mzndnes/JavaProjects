package com.renu;

public class VariableArray {
	public int sum(int ... n) {
		int s=0;
		for(int i:n) {
			s+=i;
		}
		return s;
	}
	public static void main(String[] args) {
		int num[]= {4,5,10};
		VariableArray va=new VariableArray();
		System.out.println(va.sum(num));
	}
}


