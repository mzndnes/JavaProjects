package com.renu;

public class DefaultMethod {
	public static void main(String[] args) {
		PointInterface pi=()->System.out.println("Abstract Method");
		pi.show();
		pi.display();
	}
}
