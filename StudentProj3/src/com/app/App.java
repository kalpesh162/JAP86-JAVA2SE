package com.app;

import java.util.Iterator;
import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class App {

	public static void printStudents(List<Student> students) {
		Iterator<Student> itr = students.iterator();
		System.out.println("     ID      NAME      MARKS");
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.printf("%7d |", student.getId());
			System.out.printf("%15s|", student.getName());
			System.out.printf("%7.2f |", student.getMarks());
			System.out.println();

		}

	}

	public static void main(String[] args) {

		// StudentDAO

		StudentDao dao = new StudentDaoImpl();
		Student student = new Student(31, "Raju", 87.77);
		// dao.addStudent(student);
		// dao.updateStudent(student);

		List<Student> students = dao.findAllStudents();

		printStudents(students);
		System.out.println("+++++++++++++++++++++");

	}

}
