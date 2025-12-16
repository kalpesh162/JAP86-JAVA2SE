import java.util.Scanner;
class BMI{

	public static void main(String[] args) {
		double bmi;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter BMI VALUE");
		bmi=scanner.nextDouble();
		if(bmi<18.5){
			System.out.println("Underweight");
		}
		else if((bmi==18.5) || (bmi<=24.9)){
			System.out.println("Healthy Weight");
		}
		else if((bmi==25) || (bmi<=29.9)){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obesity");
		}
		
	}
}