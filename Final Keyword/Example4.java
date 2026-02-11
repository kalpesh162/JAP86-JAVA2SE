class Ticket{
	String name;
	int age;
	char gender;
	int birthNo;
	String trainName;

	Ticket(String name,int age,char gender,int birthNo,String trainName){
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.birthNo=birthNo;
			this.trainName=trainName;
	}

}

class MakeMyTrip{
	 public static void displayTicket(final Ticket ticket){
	 		//ticket.name="Rajesh";  // If we want field not to bec changed inside Object --> Then Make field as a final
	 	
	 		
	 		// If ref not to be used by some other Object make reference type final
	 	  	// ticket=new Ticket("Ravi",28,'M',45,"Pune Patana Exp");;
	 }
}

class Example4{
	public static void main(String[] args) {

		Ticket ticket=new Ticket("Kalpesh",24,'M',55,"Maharstra Exp");

			MakeMyTrip.displayTicket(ticket);
		
	}
}