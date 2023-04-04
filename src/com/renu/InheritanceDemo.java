package com.renu;

class Shape{
	public void draw() {
		System.out.println("Drawing some shape");
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapeObj=new Shape();
		shapeObj.draw();
		Rectangle rectObj=new Rectangle();
		rectObj.draw();
		Circle circleObj=new Circle();
		circleObj.draw();

	}

}
