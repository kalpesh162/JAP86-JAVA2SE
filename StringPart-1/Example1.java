class Example1{
	
	public static void main(String[] args) {
			/*
			String str="Kareena";
			str.concat("Kapoor");
			System.out.println(str);
			*/
			StringBuilder sb=new StringBuilder("Kareena");
			sb.append("Kapoor");
			System.out.println(sb);

			StringBuilder sb1=new StringBuilder();  // 16
			System.out.println(sb1.capacity());
			sb1.append("Raveena");
			System.out.println(sb1.capacity());
			sb1.append("AAABBBCCC");
			System.out.println(sb1.capacity());
			sb1.append("D");
			System.out.println(sb1.capacity());
			// NewCapacity=CC*2+2

			StringBuilder sb2=new StringBuilder("Apple");
			System.out.println(sb2.capacity()); // 21 [(Default Capacity)16 + 5 ("Apple")]

			// char default value '/u0000'
			// char 2 bytes

			
			StringBuilder sb3=new StringBuilder(100000);

			StringBuilder sb4=new StringBuilder();

			// int capacity()
			// Overloaded
			//  public StringBuilder append()


	}
}

