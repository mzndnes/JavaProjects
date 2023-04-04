package com.threads;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Counter c=new Counter();
		Runnable r1=()-> {
			String name=Thread.currentThread().getName();
			for(int i=0;i<5;i++) 
				System.out.println(name);
				try{Thread.sleep(1000);}catch(Exception e) {};
			};
			
			Runnable r2=()-> {
				String name=Thread.currentThread().getName();
				for(int i=0;i<5;i++) 
					System.out.println(name);
					try{Thread.sleep(100);}catch(Exception e) {};
				};
					
		Thread t1=new Thread(r1,"Thread1");
		Thread t2=new Thread(r2,"Thread2");
		
		t1.start();
		
		t2.start();
		System.out.println("Main"+c.count);
	}

}
