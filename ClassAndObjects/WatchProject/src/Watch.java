class Watch{
	private int hr;
	private int min;
	private int sec;

	Watch(){
	 hr=min=sec=10;
	}
	
	Watch(int hr,int min,int sec){
		//hr=hr this.hr=this.hr
		 this.hr=hr;this.min=min;this.sec=sec;
	}

	Watch(int hr,int min){ }
  // Getters
	int getHr(){ return hr;}
	int getMin(){ return min;}
	int getSec(){ return sec;}
// Setter
	void setHr(int hr){ this.hr=hr;}
	void setMin(int min){ this.min=min;}
	void setSec(int sec){ this.sec=sec;}

	void displayWatch(){
		System.out.println("Hr "+hr + "  Min "+min +"  sec "+sec);
	}
}