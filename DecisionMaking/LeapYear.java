 /*Write a Java program to check whether a year is a leap year or not.*/
 import java.util.Scanner;
 class LeapYear{
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year");
        year=scanner.nextInt();

//  year%100==0  year%400==0
 
        if(year%100==0 && year%400==0){
                    System.out.println("LeapYear !!!");
        }
        else{
            if(year%4==0)
                System.out.println("LeapYear !!!");
            else
                System.out.println("NOT LeapYear !!!");

        }

    }

 }