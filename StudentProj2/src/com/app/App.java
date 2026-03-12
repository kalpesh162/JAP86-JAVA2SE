package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.model.Student;

public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static Student getStudent() {
		System.out.println("Enter Id");
		int id = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter Marks");
		double marks = scanner.nextDouble();
		Student student = new Student(id, name, marks);
		return student;
	}

	private static void displayStudents(ArrayList<Student> studList) {
		Iterator<Student> itr = studList.iterator();

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
	}

	private static Student findStudentById(int id, ArrayList<Student> studList) {
		for (Student stud : studList) {
			if (stud.getId() == id)
				return stud;
		}
		return null;
	}

	public static void main(String[] args) {

		ArrayList<Student> jpa86 = new ArrayList<Student>(); // STORE
		char letter=' ';
		do {
		
		System.out.println("******MENU**********");
		System.out.println("1 : ADD STUDENT");
		System.out.println("2 : EXIST STUDENT OR NOT");
		System.out.println("3 : REMOVE STUDENT");
		System.out.println("4 : SHOW ALL STUDENTS");
		System.out.println("5 : SHOW STUDENT WITH ID");
		System.out.println("---------------------------");
		System.out.println("ENTER VALID OPTION ");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			Student student = getStudent();
			jpa86.add(student);
			break;

		case 2:
			Student checkStudent = getStudent();
			String message = jpa86.contains(checkStudent) ? "Exist" : "NOT EXIST";
			System.out.println(message);
			break;
		case 3:
			Student deleteStudent = getStudent();
			String delMessage = jpa86.remove(deleteStudent) ? "Exist" : "NOT EXIST";
			System.out.println(delMessage);
			break;

		case 4:

			displayStudents(jpa86);
			break;

		case 5:
			System.out.println("Enter Student ID To Search");

			int id = scanner.nextInt();
			Student findStudent = findStudentById(id, jpa86);
			if (findStudent != null) {
				System.out.println("Student EXIST");
				System.out.printf("%4d", findStudent.getId());
				System.out.printf("%10s", findStudent.getName());
				System.out.printf("%10.2f", findStudent.getMarks());
				System.out.println();
			} else {
				System.out.println("Student NOT   EXIST");
			}

		}
		
		System.out.println("DO YOU WANT TO CONTINUESS PRESS Y or y");
		letter=scanner.next().charAt(0);
		
		
		}while(letter=='Y' || letter=='y');

		
		System.out.println("   THANK YOU   ");
	}

}
