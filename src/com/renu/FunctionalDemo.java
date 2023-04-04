package com.renu;

@FunctionalInterface
interface Classifier{
	void classify();
}
public class FunctionalDemo {
	public static void main(String[] args) {
		Classifier c=()->System.out.println("Random Forest");
		c.classify();
	}
}
