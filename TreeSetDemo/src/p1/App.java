package p1;

import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		
		//  cant add heterogenous type in TreeSet
		TreeSet ts=new TreeSet();
		ts.add(11);
		ts.add(11.11);  // java.lang.ClassCastException:
		ts.add("11");
		ts.add('1');
		ts.add(null);
		ts.add(true);
		
		System.out.println(ts);
		
		
	}

}
