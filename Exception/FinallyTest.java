class FinallyTest{
	
	public static void main(String[] args) {
		System.out.println("Hi");
		try{
			String num="1234A";
			int x=Integer.parseInt(num);  // NumberFormatException
		}	
		catch(Exception  e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("finally Executes");
		}

	System.out.println("Bye");

	}
}