package com.merge;

import java.util.Random;
import java.util.Scanner;

public class App {

	private static void printArray(int[] arr) {
		System.out.println("**** Printing Array **** ");
		for (int i = 0; i < arr.length; i++)
			System.out.println(i + "  " + arr[i]);

	}

	private static void inputArray(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(2000000);

	}

	private static void mergeSort(int a[], int p, int r) {

		if (p < r) {
			int q = (p + r) / 2;
		//	System.out.println("merge (  a  " + p + "  , " + q + "  ) ==> GO  Left");
			mergeSort(a, p, q);
			//System.out.println("merge (  a  " + p + "  , " + (q + 1) + "  ) ==> GO  Right");
			mergeSort(a, q + 1, r);

			//System.out.println("merge Trigger (  a  " + p + "  , " + q + "  " + r + "  )");
			// mergeProcedure
			merge(a, p, q, r);
		}
	}

	// 11 22 33 44 55 p0 q=1 r=3
	private static void merge(int[] a, int p, int q, int r) {
		// Step 1 decide array size
		int N1 = q - p + 1;
		int N2 = r - q;
		// Step 2 Create 2 array
		int a1[] = new int[N1];
		int a2[] = new int[N2];
		// step 3 fill those array
		for (int i = 0; i < N1; i++)
			a1[i] = a[p + i];
		for (int i = 0; i < N2; i++)
			a2[i] = a[q + 1 + i];
		
		
		int i = 0;
		int j = 0;
		int k = 0;

		while (true) {
			if (a1[i] <= a2[j]) {
				a[p + k] = a1[i];
				i++;
				k++;

				if (i == N1) { // here is a1 array filled
					// a2 array may be remaining
					while (j < N2) {
						a[p + k] = a2[j];
						j++;
						k++;
					}
					break;
				}

			} else {
				a[p + k] = a2[j];
				j++;
				k++;

				if (j == N2) { // here a2 array is full
					// a1 is incomeplete
					while (i < N1) {
						a[p + k] = a1[i];
						i++;
						k++;
					}
					break;
				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of an Array ");
		size = scanner.nextInt();

		int arr[] = new int[size];

		inputArray(arr); // Array is filled with numbers

		printArray(arr);

		long sTime = System.currentTimeMillis();

		mergeSort(arr, 0, arr.length - 1);

		long eTime = System.currentTimeMillis();
		System.out.println("--------------------------------------------------");
		printArray(arr);

		System.out.println("--------------------------------------------------");
		System.out.println("Time Required To Sort  " + (eTime - sTime) + "  ms");

	}

}
