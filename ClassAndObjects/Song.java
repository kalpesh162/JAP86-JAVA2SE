class Song{
	// fields
	// Instance Fields
	String title;
	String movieName;
	String composer;
	String singer;
	double duration;

    // Methods
    void displaySongDetails(){
    	int num;  // Local Variable
    	System.out.println("***********************");
    	System.out.println("Title  "+title);
    	System.out.println("MovieName  "+movieName);
    	System.out.println("Composer  "+composer);
    	System.out.println("Singer  "+singer);
    	System.out.println("Duration  "+duration);
    	//System.out.println(num);
    }

    String getSinger(){
    		return singer;
    }

    double songDuration(){
    	 return duration;
    }


	public static void main(String[] args) {
				int num=5;
				Song s1=new Song();		
				System.out.println("Hello");
				System.out.println("singer  "+s1.singer);  // State
 
				s1.displaySongDetails();  // Behaviour

				System.out.println(s1);  // Song@15db9742


	}
}