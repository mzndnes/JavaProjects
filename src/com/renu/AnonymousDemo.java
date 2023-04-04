package com.renu;

public class AnonymousDemo {

	public static void main(String[] args) {
		Parent p1=new Parent() {
			public void show() {
				System.out.println("Anonymous");
			}
		};
		p1.show();
	}
}
