
class Data{
	boolean is;
	byte bt;
	char letter;
	short sh;
	int in;
	long lo;
	float fl;
	double dl;
	String s;

  void displayData(){
  	System.out.println("Boolean  "+is);
  	System.out.println("Byte  "+bt);
  	System.out.println("Char  "+letter);
  	System.out.println("Short  "+sh);
  	System.out.println("Int  "+in);
  	System.out.println("LOng  "+lo);
  	System.out.println("Float  "+fl);
  	System.out.println("Double  "+dl);
  	System.out.println("Strig  "+s);
  }

}

class App{
	public static void main(String[] args) {

		Data d1=new Data();

		d1.displayData();
	
	}
}