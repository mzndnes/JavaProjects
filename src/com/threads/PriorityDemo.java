package com.threads;

public class PriorityDemo {

	public static void main(String[] args) throws InterruptedException {
		Hi r1=new Hi();
		Hi r2=new Hi();
		Thread t1=new Thread(r1,"Thread1");
		Thread t2=new Thread(r2,"Thread2");
		
		System.out.println("Thread1 " +t1.getPriority());
		System.out.println("Thread2 " +t2.getPriority());
		
		t1.setPriority(2);
		t2.setPriority(8);
		t2.start();
		t1.start();
	}
}
