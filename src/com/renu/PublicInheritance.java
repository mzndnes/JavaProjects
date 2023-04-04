package com.renu;
import com.dnes.Student;
public class PublicInheritance extends Student{

	public static void main(String[] args) {
		PublicInheritance obj=new PublicInheritance();
		obj.x=20;
		obj.y=30;
		//obj.z=40;// Error
	}
}
