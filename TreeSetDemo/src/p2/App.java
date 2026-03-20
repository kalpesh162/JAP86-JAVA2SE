package p2;

import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		// null can not be add in TreeSet
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(11);
		ts.add(40);
		ts.add(40);
		ts.add(15);
		ts.add(null);
		// Here internally Integer is going to compare with null --> leads to  java.lang.NullPointerException
		System.out.println(ts);
		
		
	}

}
