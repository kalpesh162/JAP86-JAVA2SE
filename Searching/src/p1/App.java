package p1;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static int linearSearch(int A[], int key) {
		for (int i = 0; i < A.length; i++)
			if (A[i] == key)
				return i;
		return -1;
	}
 
	private static void inputArray(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
		}
	}

	public static void printArray(int A[]) {
		System.out.println("Printing Array  ******");
		for (int i = 0; i < A.length; i++)
			System.out.println(i + "  " + A[i]);

		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		// Step 1 Array N
		// fill Array
		// Key to Search
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of an Array ");
		size = scanner.nextInt();

		int arr[] = new int[size];
		inputArray(arr); // Array is filled with numbers

		printArray(arr);

		System.out.println("Enter ELEMENT TO SEARCH");
		int ele = scanner.nextInt();

		long sTime=System.currentTimeMillis();
		int index = linearSearch(arr, ele);
		long eTime=System.currentTimeMillis();
		
		if (index != -1)
			System.out.println("Ele Ment Found " + ele + " AT index " + index);

		else
			System.out.println("NOT FOUND");

	}

}
