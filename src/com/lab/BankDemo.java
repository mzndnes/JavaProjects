package com.lab;

abstract class Bank{
	protected double currentBalance;
	protected double savingBalance;
	public abstract double getCurrentInterest(double time);
	public abstract double getSavingInterest(double time);
}

class SCB extends Bank{
	final double savingInterestRate=10.0;
	final double currentInterestRate=12.0;
	public SCB(double saving,double current) {
		currentBalance=current;
		savingBalance=saving;
	}
	public double getCurrentInterest(double time) {
		return currentBalance*time*savingInterestRate/100;
	}
	public double getSavingInterest(double time) {
		return savingBalance*time*savingInterestRate/100;
	}	
	
}

class NMB extends Bank{
	final double savingInterestRate=12.0;
	final double currentInterestRate=14.0;
	public NMB(double saving,double current) {
		currentBalance=current;
		savingBalance=saving;
	}
	public double getCurrentInterest(double time) {
		return currentBalance*time*savingInterestRate/100;
	}
	public double getSavingInterest(double time) {
		return savingBalance*time*savingInterestRate/100;
	}	
	
}
public class BankDemo {
	
	public static void main(String[] args) {
		Bank obj=new SCB(5000.0,70000);
		System.out.println(obj.getCurrentInterest(2));
		System.out.println(obj.getSavingInterest(2));
		
		obj=new NMB(4000.0,50000);
		System.out.println(obj.getCurrentInterest(2));
		System.out.println(obj.getSavingInterest(2));

	}

}
