package com.app;

import java.util.Iterator;
import java.util.List;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class App {

	public static void printStudents(List<Student> students) {
		Iterator<Student> itr = students.iterator();
		System.out.println("     ID      NAME          MARKS");
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.printf("%7d |", student.getId());
			System.out.printf("%15s|", student.getName());
			System.out.printf("%7.2f |", student.getMarks());
			System.out.println();

		}

	}

	public static void main(String[] args) {

		Student student = new Student(99, "Sachin", 85.55);

		// App Layer --> Service --> DAO --> mysql

		StudentService studentService = new StudentServiceImpl();
		// studentService.registerStudent(student);

		System.out.println("-------");
		
		printStudents(studentService.getAllStudents());
	}

}
