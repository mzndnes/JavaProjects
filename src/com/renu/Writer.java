package com.renu;

interface Writer {
	void write();
}
class Pen implements Writer{
	public void write() {
		System.out.println("Pen");
	}
}
class Pencil implements Writer{
	public void write() {
		System.out.println("Pencil");
	}
}
