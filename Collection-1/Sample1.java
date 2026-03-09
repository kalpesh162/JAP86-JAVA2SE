
import java.util.ArrayList;
public class Sample1{
	public static void main(String[] args) {
			ArrayList list=new ArrayList();
			list.add(11);
			list.add("11");
			list.add(11.11);
			list.add('1');
			list.add(null);

			System.out.println(list);
			// [11, 11, 11.11, 1, null]

			// int size()
			// index=0;

			System.out.println(list.get(0));
			//System.out.println(list.get(9)); 
			// java.lang.IndexOutOfBoundsException: Index: 9, Size: 5

			for(int i=0;i<list.size();i++){
				 System.out.println(list.get(i));
			}

			System.out.println("---------------");

			for(Object ob:list)
				System.out.println(ob);

	}
}