class Alphabet{
	public static void main(String[] args) {
		
		char letter='A';
		int n=1;

		while (letter<='Z') {
			System.out.print(letter +"  ");
			if(n%5==0)
				System.out.println();
			letter++;
			n++;
		}
		n=1;
			System.out.println();
		char letter1='a';
		while (letter1<='z') {
			System.out.print(letter1 +"  ");
			if(n%5==0)
				System.out.println();
			letter1++;
			n++;
		}

	}
}