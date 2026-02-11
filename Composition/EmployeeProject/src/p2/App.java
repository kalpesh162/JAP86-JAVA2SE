package p2;
import p1.Employee;
import p1.Address;
class App{
	public static void main(String[] args) {
		Employee emp=new Employee(11,"Sachin",4543);
		// Address null
		Address address=new Address("Vibrant Minds","PUNE",44252);

		emp.setAddress(address);

		System.out.println("Id  "+emp.getId());
		System.out.println("Name  "+emp.getName());
		System.out.println("Salary  "+emp.getSalary());

		// 
		System.out.println("LandMark  "+emp.getAddress().getLandMark());
		System.out.println("City  "+emp.getAddress().getCity());
		System.out.println("PinCode  "+emp.getAddress().getPincode());

		//
		Address address2=new Address("FC Road ","PUNE",411012);
		Employee emp2=new Employee(12,"Kareena",45454,address2);


	}
}