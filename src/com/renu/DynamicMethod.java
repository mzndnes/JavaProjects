package com.renu;

class Writerw{
	public void write() {
		
	}
}
class Penw extends Writerw{
	public void write() {
		System.out.println("Writing with pen");
	}
}

class Pencilw extends Writerw{
	public void write() {
		System.out.println("Writing with pencil");
	}
}

class WritingKit {
	public static void write(Writerw w) {
		w.write();
	}
}
public class DynamicMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penw pen=new Penw();
		Pencilw pencil=new Pencilw();
		WritingKit.write(pencil);
		WritingKit.write(pen);

	}

}
