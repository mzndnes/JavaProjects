package com.lab;

public class InterfaceDemo {
	public void writingKit(Writer writer) {
		writer.write();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo obj=new InterfaceDemo();
		Pen pen=new Pen();
		Pencil pencil=new Pencil();
		obj.writingKit(pencil);
		obj.writingKit(pen);
	}

}
