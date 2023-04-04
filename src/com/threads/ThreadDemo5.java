package com.threads;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Hi t1=new Hi();
		Hi t2=new Hi();
		t1.setName("Thread1");
		t2.setName("Thread2");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		t1.start();
		t2.start();
	}
}
