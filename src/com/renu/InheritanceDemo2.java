package com.renu;

class Vehicle{
	public String brand;
	public void setBrand(String b) {
		brand =b;
	}
	public void displayBrand() {
		System.out.println(brand);
	}
	public void canDrive() {
		System.out.println("Vehicle can drive");
	}
}

class MotorBike extends Vehicle{
	private int gearCount;
	public void setGear(int gear) {
		gearCount=gear;
	}
	public void displayGear() {
		System.out.println(gearCount);
	}
}

public class InheritanceDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike mb=new MotorBike();
		mb.setBrand("Kawasaki");
		mb.setGear(5);
		mb.displayBrand();
		mb.canDrive();
		mb.displayGear();

	}

}
