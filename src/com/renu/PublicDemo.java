package com.renu;


public class PublicDemo {
	public int x=5;

	public static void main(String[] args) {
		PublicDemo obj=new PublicDemo();
		System.out.println(obj.x);
//		System.out.println(PublicDemo.x);//Error
//		Point obj=new Point();
//		System.out.println(obj.x);
//		System.out.println(obj.y);
//		Point.show(); //Error

	}

}
class Point{
	int x;
	public int y;
	public Point() {
		x=5;
		y=10;
	}
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
}