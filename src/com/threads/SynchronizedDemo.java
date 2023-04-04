package com.threads;

class syncThread implements Runnable{
	SavingAccount sa;
	public void run() {
		for(int i=0;i<5;i++) {
			sa.withDraw(200);
			try{Thread.sleep(500);}catch(Exception e) {};}
	}
}

//public class SynchronizedDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SavingAccount sa=new SavingAccount();
//		Thread t1=new Thread(
//				()->{
//					for(int i=0;i<5;i++) {
////						System.out.println("Withdrawal from "+Thread.currentThread().getName());
//						sa.withDraw(200);
//						try{Thread.sleep(500);}catch(Exception e) {};}
//				},"Thread1"
//		);
//		
//		Thread t2=new Thread(
//				()->{
//					for(int i=0;i<5;i++) {
////						System.out.println("Withdrawal from "+Thread.currentThread().getName());
//						sa.withDraw(200);
//						try{Thread.sleep(500);}catch(Exception e) {};}
//				},"Thread2"
//		);
//		t1.start();
//		t2.start();
//	}
	
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount();
		syncThread r1=new syncThread();
		syncThread r2=new syncThread();
		
		r1.sa=sa;
		r2.sa=sa;
		
		Thread t1=new Thread(r1,"t1");
		Thread t2=new Thread(r2,"t2");
		t1.start();
		t2.start();
	}

}
