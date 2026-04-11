package com.insert;

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

	// Time Complexity n*n
	public static void insertionSort(int A[]) {

		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}

			A[j + 1] = key;
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

		insertionSort(arr);
		long eTime = System.currentTimeMillis();

		printArray(arr);

		System.out.println("Time Required To Sort  " + (eTime - sTime) + "  ms");

	}

}
