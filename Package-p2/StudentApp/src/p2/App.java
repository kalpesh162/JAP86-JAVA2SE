package  p2;
import static  p1.Student.getInstituteName;
//static import  p1.Student.getInstituteName;

import static java.lang.Math.pow;

import static java.lang.System.out;

class App{
	public static void main(String[] args) {
		/*
		Student s1=new Student(11,"Ramesh",77.77);

		//System.out.println(s1.getInstituteName());
		System.out.println(Student.getInstituteName());
		s1.displayStudent();
		System.out.println(Student.getInstituteName());
		System.out.println(Student.getInstituteName());
		*/
		// static field
		// static methods
		//System.out.println(Student.getInstituteName());
	//	System.out.println(institute);
		System.out.println(getInstituteName());

		System.out.println(pow(3,3));

		out.print("Hello");

		// Whats the diff between import and static import
		

	}
}