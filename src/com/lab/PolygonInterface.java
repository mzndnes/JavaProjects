package com.lab;

abstract class Polygon{
	protected double side1;
	protected double side2;
	public abstract double getArea();
}

class Rectangle extends Polygon{
	public Rectangle(int a,int b) {
		side1=a;
		side2=b;
	}
	public double getArea() {
		return side1*side2;
	}
}
class Triangle extends Polygon{
	private double side3;
	public Triangle(int a,int b,int c) {
		side1=a;
		side2=b;
		side3=c;
	}
	public double getArea() {
		double s=(side1+side2+side3)/2;
		System.out.println(Math.sqrt(9));
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
}
public class PolygonInterface {

	public static void main(String[] args) {
		Polygon p=new Triangle(4,5,9);
		System.out.println(p.getArea());
		
		p=new Rectangle(5,30);
		System.out.println(p.getArea());
	}

}
