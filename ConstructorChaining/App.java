class Data{
  
    int i ;
    int j ;
    int k;
    Data(){ 
        this(0,0);
        // error: call to this must be first statement in constructor
        //this(1,1,1);
        
    }

    Data(int i,int j){
      this.i=i; this.j=j;
    }
     Data(int i,int j,int k){
      this.i=i; this.j=j; this.k=k;
    }

}
class App{
	public static void main(String[] args) {
			Data d1=new Data();	
	}
}