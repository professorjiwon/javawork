package chap02_variable;

public class 자리바꿈_03 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("x와 y를 자리바꿈");
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		}
}
