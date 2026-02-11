package p1;
// Employee  Address
// Employee has an Address
public class Employee{
	private int id;
	private String name;
	private double salary;

	// has-a [composition]
	private  Address address;

	public Employee(int id,String name,double salary){
		this.id=id; this.name=name; this.salary=salary;
	}


	public Employee(int id,String name,double salary,Address address){
		this.id=id; this.name=name; this.salary=salary;
		this.address=address;
	}

	public void setId(int id){ this.id=id;}
	public void setName(String name){ this.name=name;}
	public void setSalary(double salary) { this.salary=salary;}
	public void setAddress(Address address){this.address=address;}

	public int getId(){return this.id;}
	public String getName(){return this.name;}
	public double getSalary(){return this.salary;}

	public Address getAddress(){ return this.address;}
}