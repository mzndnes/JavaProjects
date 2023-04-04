package com.lab;

import java.util.Scanner;

interface Polygon1{
	public float getArea();
	public void setData();
}
class Shape{
	protected float side1,side2;
}
class Rectangle1 extends Shape implements Polygon1{
	@Override
	public float getArea() {
		return side1*side2;
	}
	@Override
	public void setData() {
		System.out.println("Enter two side measurements");
		Scanner sc=new Scanner(System.in);
		side1=sc.nextFloat();
		side2=sc.nextFloat();
	}
}
class Triangle1 extends Shape implements Polygon1{
	private float side3;
	@Override
	public float getArea() {
		float s=(side1+side2+side3)/2;
		return (float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	@Override
	public void setData() {
		System.out.println("Enter three side measurements");
		Scanner sc=new Scanner(System.in);
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		side3=sc.nextFloat();
	}
	
}
public class Q3Demo {
	public static void main(String[] args) {
		Polygon1 obj=new Rectangle1();
		obj.setData();
		System.out.println(obj.getArea());

	}

}
