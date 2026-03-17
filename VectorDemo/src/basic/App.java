package basic;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class App {

	public static void main(String[] args) {

		Vector<Integer> vect = new Vector<Integer>();
		// Vector<Integer> vect=new Vector<Integer>(1000);
		// Vector<Integer> vect=new Vector<Integer>(Collection);

		// Resource
		ArrayList<Integer> list = new ArrayList<Integer>();
		// if we want to list to be synchronized
		// Vector<Integer> sync=new Vector<Integer>(list);

		// Collections.synchronizedList(list);

		vect.add(11);
		vect.addElement(22);
		vect.remove(new Integer(11));
		vect.removeElementAt(0);
		vect.removeElement(new Integer(22));

		// Vector print --> for
		// for each
		// Iteartor
		// Enumerator

		vect.add(33);
		vect.add(13);
		vect.add(23);
		vect.add(43);
		vect.add(33);

		// iterator() = elements()
		Enumeration<Integer> ent = vect.elements();

		while (ent.hasMoreElements()) {
			System.out.println(ent.nextElement());
		}

	}

}
