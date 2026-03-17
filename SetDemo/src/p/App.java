package p;

import java.util.HashSet;

public class App {
	
	public static void main(String[] args) {
		
		// Heterogenous types allowes in HashSet
		
		HashSet<Integer>box=new HashSet<Integer>();
		box.add(11);
		box.add(111);
		box.add(12);
		box.add(21);
		box.add(342);
		box.add(12);
		box.add(111);
		box.add(11);
		box.add(null);
		
		System.out.println(box);
		
		System.out.println(box.contains(11));
		
		
	}

}
