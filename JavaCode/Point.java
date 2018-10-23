package JavaCode;

public class Point implements MyComparable{
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance(Point point) {
		return Math.sqrt(Math.pow(this.x - point.getX(), 2)
				+ Math.pow(this.y - point.getY(), 2));
	}
	
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	@Override
	public int compareTo(Object other) {
		if(!(other instanceof Point)){
			throw new IllegalArgumentException();
		}
		Point otherPoint=(Point)other;
		double delta=distance()-otherPoint.distance();
		if(delta<0){
			return -1;
		}else if(delta>0){
			return 1;
		}else{
			return 0;
		}
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";

	}
	
}
