package com.renu;
public class InnerDemo {
	public static void main(String args[] ){
		Outer o1=new Outer();
		o1.display();
		Outer.Inner i1=new Outer.Inner();
		i1.display();
	}
}

class Outer{
	public void display() {
		System.out.println("Outer");
	}
	static class Inner{
		public void display() {
			System.out.println("Inner");
		}
	}
}