package com.renu;

public class CopyConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point6 p6=new Point6();
		Point6 p2=p6;
		p2.show();

	}

}

class Point6{
	int x;
	int y;
	public Point6() {
		x=10;
		y=20;
	}
	public Point6(Point6 p) {
		x=p.x;
		y=p.y;
	}
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
}