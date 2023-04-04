package com.lab;

public interface Writer {
	public void write();
}
class Pen implements Writer{
	public void write() {
		System.out.println("Writing with pen");
	}
}

class Pencil implements Writer{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Writing with pencil");
	}
	
}