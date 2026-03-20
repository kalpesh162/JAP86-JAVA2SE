package p4;

import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Amit", 85);
		Student s2 = new Student(12, "Neha", 90);
		Student s3 = new Student(30, "Rahul", 78);
		Student s4 = new Student(14, "Priya", 88);
		Student s5 = new Student(5, "Karan", 92);
		Student s6 = new Student(30, "Rahul", 78);
		// TreeSet 
		// -- ? Hey Object are you type of Comparable
		TreeSet<Student> jpa86=new TreeSet<Student>();
		jpa86.add(s1);  // is S1 Comparable ?  thats leads to ClassCasteException
		jpa86.add(s2);
		jpa86.add(s3);
		jpa86.add(s4);
		jpa86.add(s5);
		jpa86.add(s6);
		
		System.out.println(jpa86);
		
		
	}

}
