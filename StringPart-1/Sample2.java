class Sample2{
	public static void main(String[] args) {
		// char[]
		String sent="India";  // literal Pool
		// I n d i a
		System.out.println("Char At  "+sent.charAt(3)); // i
		System.out.println("length "+ sent.length());

		for(int i=0;i<sent.length();i++)
			System.out.print("  "+sent.charAt(i));

		// ASCII   A 65  a 97   0 48   SPACE 32
		// UTF UNICODE TEXT FORMAT UTF-8 
		// UTF 16
		// URF 32
		// \n
		System.out.println();
		// codePointAt()
		System.out.println("CODE "+sent.codePointAt(0));

		char letter='A';
		System.out.println((int)letter);

		// char --> String
		// String st=""+letter;

		// int	compareTo(String anotherString)

		String str1="Kareena";
		//65
		String str2="Kareena";
		String str3="Raveena";
		//66

		// int compareTo()    return --> 0 Equal 
		System.out.println("compareTo  "+str1.compareTo(str2)); 
		System.out.println("compareTo  "+str1.compareTo(str3));	
		System.out.println("compareTo  "+str3.compareTo(str1));

		String s1="AABB";
		String s2="BB";
		System.out.println("compareTo  "+s1.compareTo(s2));	
		System.out.println("compareTo  "+s2.compareTo(s1));
		// int	compareToIgnoreCase(String str)  --->  [ "ABCD"   "abcd" ]

		// String concat(String str)

		String movie="Hum Apke Hai Kaun";
		// boolean	contains(CharSequence s)
		System.out.println("contains  "+movie.contains("Apke"));

		//static String	copyValueOf(char[] data)

		char arr[]={'A','P','P','L','E'};

		//String value=new String(arr);
		
		String newString=String.copyValueOf(arr);
		System.out.println(newString);

		System.out.println(String.valueOf(arr));

		// static String valueOf(char[])  overloaded method

		int num=111;  // Primitve Type
		String number=String.valueOf(num);  // Reference Type
		// What is Boxing and UNBoxing
		// Converting Primitve Type to Reference Type  Called Boxing

		// boolean byte char short int long float double    --> Primitve Type
		// Boolean Byte Character Short Long Float Double    --> Wrapper Classes

		Integer i1=new Integer(10);
		int x=i1;   // Reference type Converting to Primitve Type --> UNBoxing
		System.out.println(x);

		// UNBOXING
		String password="1234";
		int key=Integer.parseInt(password);
		System.out.println(key);


		// boolean	endsWith(String suffix)
		// boolean	startsWith(String prefix)

		String data="Hello i love India";
		System.out.println("startsWith  "+data.startsWith("Hello"));
		System.out.println("endsWith  "+data.endsWith("India"));

		//String substring(int start)
		//String substring(int start,int end)
		// int indexOf('i')  int lastIndexOf(i)
		// Importanrt Method
		System.out.println(data.substring(6));
		System.out.println(data.substring(8,12));  // start=  <end

		// String toLowerCase(String)
		// String toUpperCase(String)

		// public String trim();

		String sent2="   Hello How Are U ?   ";
		System.out.println(sent2);
		System.out.println(sent2.trim());

		// char[]	toCharArray()

		String name="Raveena";
		char actress[]=name.toCharArray();
		// 

		// VVVVVV IMP
		//String[] split(String patter);

		String film="Amar-Akabar-Anthony";
		// Amar
		// Akabar
		// Anthony
		String actors[]=film.split("-");
		for(String var : actors)
			System.out.println(var);

		// replace(char old ,char new)

		// 	String movie="Hum Apke Hai Kaun";

		System.out.println(movie.replace('H','T'));

		// replace(String old ,String new)

		String film2="Chori Chori Chupke Chupke";
		System.out.println(film2.replace("Chupke","dekha"));

	// String	replaceFirst(String regex, String replacement)
	//String	replaceAll(String regex, String replacement)		






		
	}
}