package com.app;

import java.util.Iterator;
import java.util.List;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class App {
	private final static String RESET = "\u001B[0m";
	private final static String GREEN = "\u001B[32m";
	private final static String YELLOW = "\u001B[33m";
	private final static String BLUE = "\u001B[34m";
	private final static String RED = "\u001B[35m";

	public static void printStudents(List<Student> students) {

		Iterator<Student> itr = students.iterator();
		System.out.println(GREEN + "     ID      NAME          MARKS" + RESET);
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.print(BLUE);
			System.out.printf("%7d |", student.getId());
			System.out.print(RESET);
			System.out.print(YELLOW);
			System.out.printf("%15s|", student.getName());
			System.out.print(RESET);
			System.out.print(RED);
			System.out.printf("%7.2f |", student.getMarks());
			System.out.print(RESET);
			System.out.println();

		}

	}

	public static void main(String[] args) {

		Student student = new Student(-99, "Sachin", 85.55);

		// App Layer --> Service --> DAO --> mysql

		StudentService studentService = new StudentServiceImpl();
		// studentService.registerStudent(student);

		System.out.println("-------");

		printStudents(studentService.getAllStudents());
	}

}
