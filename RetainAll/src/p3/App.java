package p3;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer>numbers=new ArrayList<Integer>();  // 10
		
		for(int  i=1;i<=100;i++)
			numbers.add(i);
	
		for(Integer i:numbers) {
			System.out.println(i+"  ");
		}
		
		// RESIZE 6 
		// Improve
		
		ArrayList<Integer>numbers1=new ArrayList<Integer>(100);  // 10
		
		// RESIZE 1
		/*
		for(int  i=1;i<=100;i++)
			numbers1.add(i);
		*/

		for(int  i=1;i<=5;i++)
			numbers1.add(i);
		
		numbers.trimToSize();
		
	}
	
	
}
