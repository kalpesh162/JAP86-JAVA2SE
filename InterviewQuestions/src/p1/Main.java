package p1;

import java.util.Arrays;
import java.util.HashSet;

// Write a program to remove all duplicate elements from an Array.

public class Main {

	public static Integer[] removeDuplicate(int arr[]) {
		HashSet<Integer> hs = new HashSet<Integer>(arr.length);
		for (int ele : arr)
			hs.add(ele);
		Integer newArr[]= {};
		newArr = hs.toArray(newArr);

		return newArr;
	}
	
	public static Integer[] removeDuplicate1(int arr[]) {
		HashSet<Integer> hs = new HashSet<Integer>(arr.length);
		for (int ele : arr)
			hs.add(ele);
		Integer newArr[]= {};
		newArr = hs.toArray(newArr);
		
		// Convert Intger[]  --> int[]
		int unique[]=new int[newArr.length];
		for(int i=0;i<unique.length;i++)
			unique[i]=newArr[i];
		
		//int A[]=Arrays.copyOf(unique, newArr.length);
		
		//System.out.println(Arrays.toString(A));
		System.out.println("+++++++++++++++++++++");
		
		return newArr;
	}

	public static void main(String[] args) {
		
		int []arr = { 5, 7, 5, 9, 1, 7, 3, 1, 4, 9};
		// Set
		// HashSet  
		// LinkedHashSet
		// TreeSet
		
		Integer unique[]=removeDuplicate1(arr);
		for( int x : unique)
			System.out.print(x+"  ");
		
	}
}
