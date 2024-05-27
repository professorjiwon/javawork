/*package _01_langPackage;


class Point implements Cloneable {
	int x;
	int y;
	Point() { }
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x=" + x + ", y=" +y;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}

public class T04_clone {
	public static void main(String[] args) {
		Point original = new Point(3,5);

		Point copy = (Point)original.clone();
		Point p1 = new Point();
		
		System.out.println(original);
		System.out.println(copy);
		System.out.println(p1);
		System.out.println("-----------");
		
		p1.x = 10;
		p1.y = 20;
		copy = (Point)p1.clone();
		System.out.println(p1);
	}
}














*/