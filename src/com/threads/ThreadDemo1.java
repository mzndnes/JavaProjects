package com.threads;

public class ThreadDemo1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hi t1=new Hi();
		Hi t2=new Hi();
		t1.setName("Patrick");
		t2.setName("Dan");
//		t1.run();
//		t2.run();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
		
		
	}

}
