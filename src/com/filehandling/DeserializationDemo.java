package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationDemo {
	public static void main(String[] args) {
		Student s1;
		try {
			FileInputStream fis=new FileInputStream("Student1.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s1=(Student)ois.readObject();
			fis.close();
			s1.display();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {}
	}
}
