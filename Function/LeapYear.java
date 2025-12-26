
public class LeapYear{

// Function | Method 
	static boolean isLeapYear(int year){

		   if(year%400==0 || year%100!=0 && year%4==0)
		   	return true;

		   return false;
	}

	public static void main(String[] args) {
		
		int year=2004;

		boolean yesOrNO=isLeapYear(year);


		System.out.println(yesOrNO);

	}
}