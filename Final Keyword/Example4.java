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
	 		//ticket.name="Rajesh";
	 	//   Ticket ticket=new Ticket();
	 	  // ticket=ticket;
	 }
}

class Example4{
	public static void main(String[] args) {

		Ticket ticket=new Ticket("Kalpesh",24,'M',55,"Maharstra Exp");

			MakeMyTrip(ticket);
		
	}
}