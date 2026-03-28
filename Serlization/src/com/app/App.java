package com.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.model.Student;

public class App {

	public static void main(String[] args) throws IOException {

		Student student = new Student(11, "Kalpesh", 66.66);
		// AIM Serilization
		// student --> 10101010101 ---> studinfo.txt

		// Step 1 Create File FileOutputStream
		FileOutputStream fos = new FileOutputStream("studinfo.txt");

		// public ObjectOutputStream(FileOutputStream )
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(student); // JAVA OBJECT --> BYTESTREAM --> "studinfo.txt"

		oos.flush();
		fos.close();
		oos.close();
	}

}
