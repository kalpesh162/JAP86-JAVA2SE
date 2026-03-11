package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.model.Student;

public class App {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter No Of Students");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		ArrayList<Student> jpa86 = new ArrayList<Student>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Id");
			int id = scanner.nextInt();
			System.out.println("Enter Name");
			String name = scanner.next();
			System.out.println("Enter Marks");
			double marks = scanner.nextDouble();

			Student student = new Student(id, name, marks);
			jpa86.add(student);
		}

		Iterator<Student> itr = jpa86.iterator();
		System.out.println(" ID      NAME       MARKS");
		System.out.println("_________________________________");
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.printf("%4d", student.getId());
			System.out.printf("%10s", student.getName());
			System.out.printf("%10.2f", student.getMarks());
			System.out.println();
		}
		System.out.println("_________________________________");

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

		Student checkStudent = new Student(1, "Raju", 55.55);
		// jpa86

		if (jpa86.contains(checkStudent))
			System.out.println("IS PRESENT");
		else
			System.out.println("NOT IS PRESENT");

	}

}
