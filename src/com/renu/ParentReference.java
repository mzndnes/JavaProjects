package com.renu;

class Living{
	boolean canBreadth=true;
	boolean canEat=true;
	public void move() {
		System.out.println("Every Living can move");
	}
}
class Animal extends Living{
	boolean haveLegs=true;
	public void move() {
		System.out.println("Can walk and run");
	}
}
class Bird extends Living{
	boolean haveWings=true;
	public void move() {
		System.out.println("Can fly");
	}
}

public class ParentReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Living living=new Animal();
		living.move();
		System.out.println(living.canBreadth);
		living=new Bird();
		living.move();
	}

}
