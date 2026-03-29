package p2;

public class App {

	public static void main(String[] args) {

		Student student = new Student(11, "Rahul", 66.66);
		Address address = new Address("FC ROAD", "PUNE", 411025);
		student.setAddress(address);

		System.out.println(student);
		Student student2 = null;
		try {
			student2 = (Student) student.clone();
		} catch (CloneNotSupportedException e) {
		}

		System.out.println(student2);

		System.out.println("Deep Copy");
		student.getAddress().setCity("Mumbai");
		System.out.println(student);
		System.out.println(student2);

		System.out.println("Show hascode of address");
		System.out.println(student.getAddress().hashCode());
		System.out.println(student2.getAddress().hashCode());

	}

}
