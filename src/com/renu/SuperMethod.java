package com.renu;

class Point7{
	public Point7() {
		System.out.println("Parent Constructor");
	}
	public Point7(String msg) {
		System.out.println(msg);
	}
}
public class SuperMethod extends Point7{
	public SuperMethod() {
		System.out.println("child Constructor");
	}
	public SuperMethod(String msg) {
		super("msg Parent");
		System.out.println(msg);
	}
	public static void main(String[] args) {
		SuperMethod sm=new SuperMethod();
		SuperMethod sm2=new SuperMethod("msg child");
	}
}
