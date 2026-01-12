class Bird{
 static int cnt=0;
  Bird(){
  	cnt++;
  }
}
class Program1{
	public static void main(String[] args) {
		Bird b1=new Bird();	
		Bird b2=new Bird();	
		System.out.println(Bird.cnt);  // Bird.cnt;
		Bird b3=new Bird();	
		System.out.println(Bird.cnt);
		System.out.println(Bird.cnt);
	}
}