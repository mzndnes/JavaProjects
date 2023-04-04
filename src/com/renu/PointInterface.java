package com.renu;

interface PointInterface {
	void show();
	default void display() {
		System.out.println("Default Method");
	}
}
