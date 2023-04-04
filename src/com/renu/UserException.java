package com.renu;

class DineshException extends Exception{
	public DineshException(String msg) {
		super(msg);
	}
}
public class UserException {
	public static void main(String[] args) {
		int a=-5,b=0;
		try {
			if (a<0)
				throw new DineshException("Not good");
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(DineshException e) {
			System.out.println(e);
		}
	}
}
