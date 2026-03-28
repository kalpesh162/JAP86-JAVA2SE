package com.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.model.Student;

public class Deserilize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// studinfo.txt Read
		// Read --> Student
		// Student

		FileInputStream fis = new FileInputStream("studinfo.txt");
		// public ObjectInputStream(FileInputStream)
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student student = (Student) ois.readObject();
		// readObject() --> Student.class
		// Student s1=new Student();
		// studinfo.txt
		// 10101010101 s1.setId() s1.setName() s1.setMarks()

		// Student s1=new Student(; ; )

		System.out.println(student);

		fis.close();
		ois.close();

		System.out.println("__________");

	}

}
