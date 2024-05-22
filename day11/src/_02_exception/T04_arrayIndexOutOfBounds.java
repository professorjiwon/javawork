package _02_exception;

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		/*
		String[] str = {"abc","def","ghi"};
		str[3] = "kim";
		*/
		try {
			String[] str = {"abc","def","ghi"};
			str[3] = "kim";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 index 2까지만 사용가능");
			e.printStackTrace();
		}
	}
}
