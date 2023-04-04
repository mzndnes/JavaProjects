package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private String name;
	private int roll;
	private String course;
	
	public Student(String name,int roll,String course) {
		this.name=name;
		this.roll=roll;
		this.course=course;
	}
	public void display() {
		System.out.print(name);
		System.out.print(roll);
		System.out.print(course);
	}
}
public class SerializationDemo {

	public static void main(String[] args) {
		Student s1=new Student("Dan",1,"Database");
		//Student s2=new Student("Patrick",2,"OOP");
		try {
			FileOutputStream fos=new FileOutputStream("Student1.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {}
	}
}
