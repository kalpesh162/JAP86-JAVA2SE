class Example2{
	public static void main(String[] args) {	
		StringBuilder sb=new StringBuilder("Hello I Love India");
		//int  length()
		// char charAt(index)
		//  l -- index
		// o -- last index
		System.out.println(sb.indexOf("l"));  // "l"  -- String

		// char --> String
		// String.valueOf(char)
		System.out.println(sb.indexOf(String.valueOf('l')));  // "l"  -- String		
		// int lastIndexOf()

		// int	codePointAt(int index)  // UNICODE VALUE
		// StringBuilder	delete(int start, int end)  start= <end
		//StringBuilder	deleteCharAt(int index)

		StringBuilder movie=new StringBuilder("Hum Apke Hai Kaun");
		int index=movie.indexOf(String.valueOf('K'));
		// return -1 
		movie.deleteCharAt(index);
		System.out.println(movie);

		movie.delete(12,16);
		//movie.delete(12)
		System.out.println(movie);  // Hum Apke Hai

		// StringBuilder insert(int offset,type);  // Overload

		//Hum Apke Hai
		//HumHai Apke Hai
		movie.insert(3,"Hai");
		System.out.println(movie);  //HumHai Apke Hai	

 		
	}
}
