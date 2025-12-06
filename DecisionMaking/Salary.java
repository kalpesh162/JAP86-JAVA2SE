/*
  Write a Java program to input basic salary of an employee and calculate
  its Gross salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;
    class Salary{
    	public static void main(String[] args) {    		
    		double basicSalary; 
    		double grossSalary;
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("Enter Employee basicSalary");
    		basicSalary=scanner.nextDouble();

    		if(basicSalary<=10000){
    			grossSalary=basicSalary+basicSalary*0.2 + basicSalary*0.8;
    		}
    		else if(basicSalary<=20000){  // salary>10000 &&salary<=20000
    			grossSalary=basicSalary+basicSalary*0.25 + basicSalary*0.9;	
    		}
    		else{
    			grossSalary=basicSalary+basicSalary*0.3 + basicSalary*0.95;	
    		}

    		System.out.println("grossSalary "+grossSalary);

    	}
    }