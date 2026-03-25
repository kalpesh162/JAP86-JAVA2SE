package com.app;

import com.dao.StudentDao;
import com.model.Student;

public class App {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();

		// User Case Menu
		Student student = new Student(21, "Neha", 77.77);

		int res = dao.addStudent(student);
		if (res > 0)
			System.out.println("Student Added");
		else
			System.out.println("Student Failed To ADD");

	}

}
