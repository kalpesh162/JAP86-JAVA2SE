package p1;

import java.util.HashSet;

// hashcode

// public int hashCode()
// int	hashCode()	
//Returns a hash code value for the object.

public class App {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(11);
		hs.add(31);
		hs.add(21);
		hs.add(12);
		hs.add(11);
		
		System.out.println(hs);
	}

}


// java.lang.Integer
// public boolean equals() {}