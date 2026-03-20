package p5;

import java.util.HashSet;
import java.util.Objects;

class Student {
	private int id;
	private String name;
	private double marks;

	public Student() {

	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "] \n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}

}

public class App {

	public static void main(String[] args) {

		Student s1 = new Student(11, "Kareena", 66.66);
		Student s2 = new Student(11, "Kareena", 66.66);
		Student s3 = new Student(11, "Kareena", 66.66);
		Student s4 = new Student(11, "Kareena", 66.66);
		Student s5 = new Student(11, "Kareena", 66.66);
		Student s6 = new Student(11, "Kareena", 66.66);

		HashSet<Student> hs = new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		System.out.println(hs);

	}

}
