import java.util.Scanner;
class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(){ }

	Employee(int id,String name,double salary){
		 this.id=id; this.name=name; this.salary=salary;
	}
	// Getter
	// Setter
	int getId(){ return id ;}
	String getName() { return name; }
	double getSalary() { return salary; }

	void setId(int id){ this.id=id;}
	void setName(String name) { this.name=name;}
	void setSalary(double salary){ this.salary=salary; }

	void empDetails(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);

	}

}

class Test{

	public static void main(String[] args) {
			int size;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter No Of Employee");
			size=scanner.nextInt();

			Employee []empList=new Employee[size];

			for(int i=0;i<empList.length;i++){
				System.out.println("Enter ID");
				
				int id=scanner.nextInt();
				System.out.println("Enter Name");
				scanner.nextLine(); // Omitt your White Space Charcter [ENTER]
				String name=scanner.nextLine();
				System.out.println("Enter Salary");
				double salary=scanner.nextDouble();
				
				empList[i]=new Employee(id,name,salary);

			}

			// To display All Employees

			for(Employee emp:empList){
				System.out.println("------------------");
				emp.empDetails();
			}


	}
}