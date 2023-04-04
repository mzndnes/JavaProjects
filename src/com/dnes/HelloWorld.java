package com.dnes;
import com.renu.Point5;

public class HelloWorld {
	public static int x=5;
	
	public void display() {
		System.out.println("Display");
		System.out.println(x);
		show();
	}
	public static void show() {
		System.out.println("Show");
	}
	public static void main(String[] args) {
		HelloWorld obj=new HelloWorld();
		obj.display();
		System.out.println(obj.x);
		
		Point5 p5=new Point5(); //Error DefaultDemo different package
		
	}

}

class P extends Point5{
	public void show() {
		System.out.println(x);
	}
	
}
