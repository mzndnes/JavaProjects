package com.lab;

abstract class Animal{
	private String color="white";
	public void display() {
		System.out.println(color);
	}
}

class Dog extends Animal{
	private String color="brown";
	public void display() {
		System.out.println(color);
		super.display();
	}
}
public class Q2Demo {
	public static void main(String[] args) {
		Animal obj=new Dog();
		obj.display();
	}
}
