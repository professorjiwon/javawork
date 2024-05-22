package _02_exception;

public class T01_exception {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// 예외가 나올수 있는 프로그램
			System.out.println(3);
			System.out.println(4);
		} catch(Exception e) {
			// 예외가 발생 했을 때 수행
			System.out.println(5);
		}
		System.out.println(6);
	}
}
