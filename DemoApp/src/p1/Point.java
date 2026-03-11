package p1;

public class Point {
	private int x;
	private int y;

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// p1.equals(p1)
	@Override               //obj=p2
	public boolean equals(Object obj) {
		 Point p2=(Point)obj;  // 
		if(this.x==p2.x && this.y==p2.y)
			return true;
	
		return false;
	}

}
