class Data{
	// static Block
	 static{
	 	 System.out.println("Data static Block");
	 }

	 

	 // Constructoe Block
	 Data(){
	 		 System.out.println("Data Costructor");	
	 }

	 // Instance Block
	 {
	 	System.out.println("Instance Block");
	 }
}

class Test{

	public static void main(String[] args) {

		//Data d1;	
		//Data d1=null;
		Data d1=new Data();
		Data d2=new Data();

	}
}