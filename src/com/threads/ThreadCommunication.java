package com.threads;

public class ThreadCommunication {

	public static void main(String[] args) {
		Account account=new Account();
		Producer producer=new Producer(account);
		Consumer consumer=new Consumer(account);
	}

}
