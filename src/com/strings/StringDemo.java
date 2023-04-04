
package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2=new String("abc");
		String s3="def";
		String s4="Abc";
		String s5=s1+s2;
		s3=s1.concat(s2);
		
		
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); // 97- 100
		System.out.println(s1.compareTo(s4)); //97- 65
		
		String s6="45";
		String s7="45.8f";
		int num1=Integer.parseInt(s6);
		float num2=Float.parseFloat(s7);
		
		int num3=89;
		String s8=String.valueOf(num3);
		
		s3=s3.toLowerCase();
		
		boolean isSame=s1.equals(s2);
		isSame=s1.equalsIgnoreCase(s2);
		
		
		for(int i=0;i<s1.length();i++)
			System.out.println(s1.charAt(i));
		
		char ch[]=new char[10];
		s1.getChars(0, 1, ch, 1);
		
		for(int i=0;i<2;i++)
			System.out.println(ch[i]);
		
		
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		
		byte bs[]=s1.getBytes();
		for(byte b:bs)
			System.out.println(b);
	}

}
