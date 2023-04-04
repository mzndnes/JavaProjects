package com.renu;

public class InterfaceDemo{
//	public void doSomething(Writer w) {
//		w.write();
//	}
	public static void main(String[] args) {
//		InterfaceDemo id=new InterfaceDemo();
//		Pen pn=new Pen();
//		id.doSomething(pn);
//		Pencil pc=new Pencil();
//		id.doSomething(pc);
		PointInterface pi=new PointInterface() {
			public void show() {
				System.out.println("Interface");
			}
		};
		pi.show();
	}
}
