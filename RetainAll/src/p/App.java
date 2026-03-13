package p;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		list1.add(55);

		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(88);
		list2.add(55);
		list2.add(12);
		list2.add(44);
		list2.add(55);

		
		list1.retainAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		
		
	}

}
