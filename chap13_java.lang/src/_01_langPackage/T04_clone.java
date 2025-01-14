package _01_langPackage;

class Point implements Cloneable{
	int x;
	int y;
	Point() { }
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	@Override
	public Object clone() {
		
		return new Object();
	}
}

public class T04_clone {
	public static void main(String[] args) {
		Point original = new Point(3, 4);
		
		Point copy = (Point)original.clone();
		

	}
}
