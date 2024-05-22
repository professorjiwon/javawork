package _02_exception;

public class T03_nullPointer {

	public static void main(String[] args) {
		/*
		String data = null;
		System.out.println(data.toString());
		*/
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println("데이터가 들어있지 않습니다");
			System.out.println("메시지 : " + e);
		}
	}
}
