class Digit{

	public  static void main(String a[]){

		int num=1293;

		int unit=((num%10)+1)%10;
		num=num/10;
		int tens=((num%10)+1)%10;
		num=num/10;
		int huns=((num%10)+1)%10;
		num=num/10;
		int ths=((num%10)+1)%10;

		System.out.println(ths);
		System.out.println(huns);
		System.out.println(tens);
		System.out.println(unit);
	}
}