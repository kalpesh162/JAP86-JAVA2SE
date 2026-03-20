package p4;

import java.util.Iterator;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Amit", 85);
		Student s2 = new Student(12, "Neha", 90);
		Student s3 = new Student(30, "Rahul", 78);
		Student s4 = new Student(14, "Priya", 88);
		Student s5 = new Student(5, "Karan", 92);
		Student s6 = new Student(30, "Rahul", 78);
		// TreeSet
		// -- ? Hey Object are you type of Comparable
		TreeSet<Student> jpa86 = new TreeSet<Student>();
		jpa86.add(s1); // is S1 Comparable yes s1 is a type Student as well is type of Comparable
		//
		jpa86.add(s2);
		jpa86.add(s3);
		jpa86.add(s4);
		jpa86.add(s5);
		jpa86.add(s6);

		System.out.println(jpa86);

		Iterator<Student> itr = jpa86.iterator();
		System.out.println("ID      NAME   MARKS");
		System.out.println("_____________________________________");
		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.printf("%4d", student.getId());
			System.out.printf("%8s", student.getName());
			System.out.printf(" %6.2f\n", student.getMarks());
		}

		System.out.println("++++++++++++++++++++++++++++++");

		Student s7 = new Student(6, "Sneha", 81);
		Student s8 = new Student(7, "Vikram", 75);
		Student s9 = new Student(8, "Anjali", 89);
		Student s10 = new Student(9, "Rohit", 67);
		Student s11 = new Student(10, "Pooja", 93);

		// TreeSet(Compartor)
		StudentNameComparator byName = new StudentNameComparator();
		TreeSet<Student> newBatch = new TreeSet<Student>(byName);
		// Here StudentNameComparator class compare(s1,s2) will call internally
		// and compare(s1,s2) internally call String class compareTo
		// Comparator byName = new StudentNameComparator();
		// TreeSet<Student> newBatch = new TreeSet<Student>(new
		// StudentNameComparator());
		newBatch.add(s7);
		newBatch.add(s8);
		newBatch.add(s9);
		newBatch.add(s10);
		newBatch.add(s11);

		Iterator<Student> itr1 = newBatch.iterator();
		System.out.println("ID      NAME   MARKS");
		System.out.println("_____________________________________");
		while (itr1.hasNext()) {
			Student student = itr1.next();
			System.out.printf("%4d", student.getId());
			System.out.printf("%8s", student.getName());
			System.out.printf(" %6.2f\n", student.getMarks());
		}

	}

}
