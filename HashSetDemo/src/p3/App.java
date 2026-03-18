package p3;

import java.util.HashSet;

class Data {
	int x;

	public Data(int x) {
		this.x = x;
	}

	public String toString() {
		return x + " ";
	}
	
	@Override
	public int hashCode() {
	
		return x%10;  
	}
}

// public boolean add(E e){
       // step  1 Ask hahsCode Value of tahta an Objeect 
       // Data d1=new Data(11)
	   //  d1.hashcode()


//}//

public class App {

	public static void main(String[] args) {

		Data d1 = new Data(11);
		Data d2 = new Data(21);
		Data d3 = new Data(12);
		Data d4 = new Data(31);
		Data d5 = new Data(11);

		HashSet<Data> hs = new HashSet<Data>();

		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);

		System.out.println(hs);
		System.out.println("--------");
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d4.hashCode());
		System.out.println(d5.hashCode());

	}

}
