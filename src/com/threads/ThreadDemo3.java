package com.threads;

public class ThreadDemo3 {

	public static void main(String[] args) throws InterruptedException {
		Counter r1=new Counter();
		Counter r2=new Counter();
		Thread t1=new Thread(r1,"Thread1");
		Thread t2=new Thread(r2,"Thread2");
		t1.start();
		t2.start();
//		t2.join();
//		t1.join();
//		
//		System.out.println(r1.count);

	}

}
