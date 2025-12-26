class ArmStrong{
	static int countDigits(int num){
			int cnt=0;
			while(num!=0){
				cnt++;
				num=num/10;
			}
			return cnt;
	}
/*
	static boolean isArmStrong(int num,int power){
			int temp=num;
			int sum=0;
			while (num!=0) {
				int rem=num%10;
					sum+=(int)Math.pow(rem,power);
				num=num/10;
			}
			return temp==sum;
	}
*/
	static boolean isArmStrong(int num){
			int power=countDigits(num);
			int temp=num;
			int sum=0;
			while (num!=0) {
				int rem=num%10;
					sum+=(int)Math.pow(rem,power);
				num=num/10;
			}
			return temp==sum;
	}

	public static void main(String[] args) {
		
		int num=153;

		int count=countDigits(num);

	//	boolean yesOrNo=isArmStrong(num,count);
			boolean yesOrNo=isArmStrong(num);

		System.out.println(yesOrNo);

	}
}