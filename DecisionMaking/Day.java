/*Write a Java program to input week number and print week day.*/
import java.util.Scanner;
class Day{

	public static void main(String[] args) {
		int weekNumber;
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Day Number");
        weekNumber=scanner.nextInt();

        if(weekNumber==1)
        	System.out.println("SUNDAY");
        else if(weekNumber==2)
        	System.out.println("MONDAY");
        else if(weekNumber==3)
        	System.out.println("TUESDAY");
        else  if(weekNumber==4)
        	System.out.println("WEDNESDAY");
        else if(weekNumber==5)
        	System.out.println("THRUSDAY");
		else if(weekNumber==6)
        	System.out.println("FRIDAY");
		else if(weekNumber==7)
        	System.out.println("SATURDAY");
		else
			System.out.println("NOT A VALID weekNumber!!!");
	}
}