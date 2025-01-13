package _01_exception;

public class T02_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4/0);
			System.out.println(5);
		}catch(Exception e) {
			System.out.println("예외 처리함");
		}
		
		System.out.println(6);

	}

}
