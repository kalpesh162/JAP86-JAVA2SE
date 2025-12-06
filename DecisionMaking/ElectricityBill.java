/*  Write a Java program to input electricity unit charges and
   calculate total electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
    For unit above 250 Rs. 1.50/unit
    An additional surcharge of 20% is added to the bill

*/
import java.util.Scanner;
class ElectricityBill{
	public static void main(String[] args) {	
		int unit; double bill;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no Of Units");
		unit=scanner.nextInt();

		if(unit>=1 && unit<=50){
			bill=unit*0.5;
		}
		else if(unit>50 && unit<=150){
			bill=unit*0.75;
		}
		else if(unit>150 && unit<=250){
			bill=unit*1.2;
		}
		else{
			bill=unit*1.5;	
		}

        double totalBill=bill+bill*0.2;

        System.out.println("------ElectricityBill-------");
        System.out.println("No Of Units  :  "+unit);
        System.out.println("Bill         :  "+bill);
        System.out.println("SurCharge    :  "+(bill*0.2));
        System.out.println("Total Bill   :  "+totalBill);

	}
}