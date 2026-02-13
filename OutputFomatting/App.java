class App{
	public static void main(String[] args) {
		int n=100;
		for(int i=1;i<=10;i++){
			//System.out.println(n+"  "+" * "+i+" = "+ (5*i));
			System.out.printf("%3d * %2d = %4d\n",n,i,(n*i));

		}
		String[][] names = {
	    {"Liam", "Alexander", "Cruz"},
	    {"Noah", "Benjamin", "Clark"},
	    {"Ethan", "Sebastian", "Hall"},
	    {"Mason", "Christopher", "King"},
	    {"Lucas", "Nathaniel", "Scott"},
	    {"Logan", "Theodore", "Adams"},
	    {"Aiden", "Maximillian", "Reed"},
	    {"Elijah", "Dominic", "Ward"},
	    {"James", "Emmanuel", "Gray"},
	    {"Oliver", "Zachariah", "Brooks"}
	};

		System.out.printf("%10s %c %15s  %c %10s \n","Name",'|',"MiddleName",'|',"LastName");
		System.out.println("________________________________________________");
		for(int i=0;i<names.length;i++){
			for(int j=0;j<1;j++){
				System.out.printf("%10s %c %15s  %c %10s \n",names[i][j],'|',names[i][j+1],'|',names[i][j+2]);
			}
			
	}
		}
}