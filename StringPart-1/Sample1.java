class Sample1{

	public static void main(String[] args) {

/*
	String s1="Kareena";

	s1.concat("Kapoor");

	System.out.println(s1);  // Kareena
*/
		
	/*	
	String s1="Kareena";

	s1=s1.concat("Kapoor");

	System.out.println(s1);  
	*/

	String str="Hello";
	for(int i=1;i<=5;i++){
	        str=str.concat("Bye");
	}

	System.out.println(str);//HelloByeByeByeByeBye


	}
}


char	charAt(int index)

char letter=str.charAt(4);

int	indexOf(int ch)

int index=str.indexOf('o');


String str="";

boolean	isEmpty()

int	lastIndexOf(int ch)

int	length()

String	replace(char oldChar, char newChar)

String	substring(int beginIndex)	

String	substring(int beginIndex, int endIndex)

char[]	toCharArray()

String	toLowerCase()

String	toUpperCase()


static String	valueOf(boolean b)	

static String	valueOf(char c)	

static String	valueOf(char[] data)	



static String	valueOf(double d)	

static String	valueOf(float f)	

static String	valueOf(int i)	

static String	valueOf(long l)	

