package anonymous;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Amit", 85);
		Student s2 = new Student(12, "Neha", 90);
		Student s3 = new Student(30, "Rahul", 78);
		Student s4 = new Student(14, "Priya", 88);
		Student s5 = new Student(5, "Karan", 92);
		Student s6 = new Student(30, "Rahul", 78);

		TreeSet<Student> jpa86 = new TreeSet<Student>();
		jpa86.add(s1); // is S1 Comparable ? thats leads to ClassCasteException
		jpa86.add(s2);
		jpa86.add(s3);
		jpa86.add(s4);
		jpa86.add(s5);
		jpa86.add(s6);

		System.out.println(jpa86);

		Comparator<Student> byName = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		TreeSet<Student> jpa86NEW = new TreeSet<Student>(byName);
		jpa86NEW.add(s1); // is S1 Comparable ? thats leads to ClassCasteException
		jpa86NEW.add(s2);
		jpa86NEW.add(s3);
		jpa86NEW.add(s4);
		jpa86NEW.add(s5);
		jpa86NEW.add(s6);

		System.out.println(jpa86NEW);

	}

}
