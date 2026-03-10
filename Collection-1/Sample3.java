import java.util.ArrayList;
import java.util.Iterator;
public  class Sample3{
	public static void main(String[] args) {
			// Generic List
// Reason 1 : fixed size
// Array  --> index
// Search
// Allows duplicate
// insertion Order

			ArrayList<String>family=new ArrayList<String>();
			family.add("Kalpesh");
			System.out.println(family.add("Kalpesh"));
			family.add("Navin");
			family.add("Sneha");
			family.add("Anup");

			System.out.println(family.contains("Kalpesh"));
			System.out.println(family);
			family.remove("Kalpesh");// first occureance will be delated
			System.out.println(family);
			System.out.println("E remove(index)"+family.remove(0));
			System.out.println(family);

			// int size()
			// boolean isEmpty()
			// void clear()

			ArrayList<String>family1=new ArrayList<String>();
			family1.add("Raju");
			family1.add("Kareena");
			family1.add("Sharukh");
			family1.add("Ravi");

			family.addAll(family1);

			System.out.println(family);

			System.out.println("contains All "+family.containsAll(family1));

			family.removeAll(family1);
			System.out.println(family);

			// ArrayList --> Array Object[]

			// public Object[] toArray()
			Object[] arr=family.toArray();

			for(Object ob:arr)
				System.out.println(ob);
			System.out.println("---------------");

			//  public T[] toArray(T[])
			String names[]=new String[family.size()];

			names=family.toArray(names);
			for(String name : names){
				System.out.println(name);
			}

			//Iterator iterator()

			Iterator<String> itr=family.iterator();

			while(itr.hasNext()){
				  System.out.println(itr.next());
			}










	}
}