package com.binary;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of an Array ");
		size = scanner.nextInt();

		int arr[] = new int[size];
		inputArray(arr); // Array is filled with numbers

		Arrays.sort(arr); // Array already Sorted
		printArray(arr);

		System.out.println("Enter Element To Search ");

		int element = scanner.nextInt();

		long sTime = System.currentTimeMillis();
		// int index = binarySearch(arr, element); // CALL
		int index = recurisveBinarySearch(arr, 0, arr.length - 1, element);
		long eTime = System.currentTimeMillis();

		if (index != -1)
			System.out.println("Found At " + index);
		else
			System.out.println("NO  Found " + element);

		System.out.println("Time Required To Search  " + (eTime - sTime) + "  ms");
	}

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

	public static int binarySearch(int arr[], int element) {
		int low = 0;
		int high = arr.length;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == element)
				return mid;
			else if (arr[mid] < element)
				low = mid + 1;
			else if (arr[mid] > element)
				high = mid - 1;

		}
		return -1;
	}

	public static int recurisveBinarySearch(int arr[], int low, int high, int element) {

		int mid = (low + high) / 2;

		if (low > high)
			return -1;

		if (arr[mid] == element)
			return mid;

		else if (arr[mid] < element) {
			low = mid + 1;
			return recurisveBinarySearch(arr, low, high, element);
		} else
			high = mid - 1;
		return recurisveBinarySearch(arr, low, high, element);

	}

}
