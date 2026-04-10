package com.bubble;

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
			arr[i] = random.nextInt();

	}

	public static void bubbleSort(int A[]) {
		for (int i = 0; i < A.length - 1; i++) { // PASS

			for (int j = 0; j < A.length - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
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

		bubbleSort(arr);
		long eTime = System.currentTimeMillis();

		printArray(arr);

		System.out.println("Time Required To Sort  " + (eTime - sTime) + "  ms");

	}

}
