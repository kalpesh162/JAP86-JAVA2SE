class Example3{
	public static void main(String[] args) {
		
		//StringBuilder	replace(int start, int end, String str)
		// StringBuilder reverse()
		StringBuilder name=new StringBuilder("ABABABABBA");
		name.replace(0,4,"DDDD");
		// DDDDABABBA
		System.out.println(name);

		StringBuilder str=new StringBuilder("Hello");	
		System.out.println(str.reverse());

		//str.reverse().toString()  StringBuilder  --> String
		//new String(str.reverse()) StringBuilder  --> String
		// String.valueOf(str.reverse())

		// void	setCharAt(int index, char ch)

		StringBuilder sb=new StringBuilder("Krishna");  //Kri-shna
		System.out.println("Original  "+sb);
		//sb.setCharAt(3,'-');  // Kri-hna
		sb.insert(3,'-');  //Kri-shna
		System.out.println("Modified  "+sb);

		// String substring(int start)
	    // String substring(int start,int end)

	    StringBuilder movie=new StringBuilder("Hum Apke Hai Kaun");
	    System.out.println(movie.substring(4,8));

	}
}