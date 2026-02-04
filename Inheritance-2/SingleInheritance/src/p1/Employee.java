package p1;
public class Employee extends Person{
	private double salary;

	public Employee(int age,String name,double salary){
		//this.age=age;
		//this.name=name;
		super(age,name);
		this.salary=salary;
	}
	public Employee(int age,String name){
		super(age,name);
	}

	public void setSalary(double salary){ this.salary=salary;}
	public double getSalary() { return salary;}

	public void displayEmployee(){
		//System.out.println("Age  "+this.age);
		//System.out.println("Age  "+super.age);
		System.out.println("Age  "+super.getAge());
		System.out.println("Name  "+super.getName());
		//super.displayPerson();		
		System.out.println("Salary  "+this.salary);
	}

}