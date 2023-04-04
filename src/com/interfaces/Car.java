package com.interfaces;

class Car implements Vehicle{
	final int breakParameter=5;
	final int accelerationParameter=5;
	public void accelerate() {
		System.out.println("Accelerating by "+accelerationParameter);
	}
	public void applyBreak() {
		System.out.println("Slowing down by"+breakParameter);
	}
}
