package com.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle v=new Car();
		v.accelerate();
		v.applyBreak();
		v=new SportsCar();
		v.accelerate();
		v.applyBreak();

	}

}
