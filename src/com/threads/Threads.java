package com.threads;
class Hi extends Thread{
	@Override
	public void run() {
		String name;
		System.out.println(Thread.currentThread().isAlive());
		for(int i=0;i<5;i++) {
			name=Thread.currentThread().getName();
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hello implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Account{
	private int balance;
	private boolean valueSet=false;
	public synchronized void set(int b) {
		while(valueSet) {
			try{wait();}catch(Exception e) {}
		}
		balance=b;
		System.out.println("Put: "+balance);
		valueSet=true;
		notify();
	}
	public synchronized void get() {
		while(!valueSet) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Get: "+balance);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable{
	Account account;
	public Producer(Account account) {
		this.account=account;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int balance=1;
		while(true) {
			account.set(balance++);
			try {Thread.sleep(500);} catch (InterruptedException e) {	}
		}
	}
}
class Consumer implements Runnable{
	Account account;
	public Consumer(Account account) {
		this.account=account;
		Thread t=new Thread(this,"Consumer");
		t.start();
		try {Thread.sleep(5000);} catch (InterruptedException e) {	}
	}
	public void run() {
		while(true) {
			account.get();
		}
	}
}
class Counter implements Runnable{
	public int count;
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<5;i++) {
			count++;
			System.out.println(name);
			try {Thread.sleep(1000);}catch(Exception e) {};
		}
			
	}
}

class SavingAccount {
	private int balance=5000;
	public boolean withDraw(int amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Remaining balance "+balance);
			return true;
		}	
		return false;
	}
}

public class Threads {

}
