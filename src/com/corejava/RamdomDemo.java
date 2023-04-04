package com.corejava;
import java.util.Random;

public class RamdomDemo {

	public static void main(String[] args) {
		Random random=new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		byte[]bs=new byte[5];
		random.nextBytes(bs);
		for(byte b:bs)
			System.out.println((char)b);
	}
}
