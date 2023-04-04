package com.renu;

interface Tester{
	default void show() {
		System.out.println("Tester");
	}
}
interface Trainer{
	default void show() {
		System.out.println("Trainer");
	}
}
public class MultipleInheritance implements Tester,Trainer {
	public static void main(String[] args) {
		MultipleInheritance mi=new MultipleInheritance();
		mi.show();
	}
	@Override
	public void show() {
		Tester.super.show();
	}
}
