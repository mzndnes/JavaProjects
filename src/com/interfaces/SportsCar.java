package com.interfaces;

public class SportsCar implements Vehicle{
	final int breakParameter=10;
	final int accelerationParameter=10;
	
	public void accelerate() {
		System.out.println("Accelerating by "+accelerationParameter);
	}
	public void applyBreak() {
		System.out.println("Slowing down by"+breakParameter);
	}
}
