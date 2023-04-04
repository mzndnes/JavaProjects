package com.renu;

interface RandomForest{
	int x=10;
	void show();
	static void showMessage() {
		System.out.println("Static method");
	}
}
public class StaticInterface {
	public static void main(String[] args) {
		RandomForest.showMessage();

	}

}
