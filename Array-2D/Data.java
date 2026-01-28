class Patient{
	int id;
	String name; 
	int tablet[];  // Reference Type

	Patient(int id,String name,int []tablet){
		this.id=id; this.name=name; this.tablet=tablet;
	}

	Patient(int id,String name){
		this.id=id; this.name=name;
	}
	// setter 
	// getter
	void setTablets(int tablet[]){
		 this.tablet=tablet;
	}

	int[] getTablets(){
		return tablet;
	}

	void printDetails(){
		System.out.println("ID   "+id);
		System.out.println("Name   "+name);
		System.out.println("Tablets   ");
		for(int tab:tablet)
			System.out.print(" "+tab+" mg  ");
	}
}
class Data{

	public static void main(String[] args) {
		int arr[]={50,100,50};
		Patient p1=new Patient(11,"Ramesh",arr);

		Patient p2=new Patient(22,"Ravi");

		int arr1[]={150,100,100};
		p2.setTablets(arr1);


		p1.printDetails();
		p2.printDetails();

	}

}