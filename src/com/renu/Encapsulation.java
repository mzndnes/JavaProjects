package com.renu;

class Point8{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Point8 p8=new Point8();
		p8.setX(8);
		p8.setY(8);
	}
}
