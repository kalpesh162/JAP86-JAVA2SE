package app;

import stud.Student;  // How to import class  "stud" --> package "Student" --> Class

class App{
	public static void main(String[] args) {
		
		Student student=new Student(11,"Kareena",66);

		System.out.println(student.getMarks());

		student.displayStudent();
	}
}