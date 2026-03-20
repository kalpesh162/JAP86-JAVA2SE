package p4;
// If we want Student should be print on order based on id
// What to do ?  --> Student class must be type Comparable
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
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
	public int compareTo(Student o) {
		Integer i1=new Integer(this.id);
		Integer i2=new Integer(o.id);
		//return i1.compareTo(i2); // ASC
		return i2.compareTo(i1); // ASC
 	}

}
