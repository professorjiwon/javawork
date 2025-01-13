package _01_exception;
// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어났을 때

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		/*
		int[] num = {1,2,3,4,5};
		num[5] = 10;
		System.out.println(num[5]);
		*/
		try {
			int[] num = {1,2,3,4,5};
			num[5] = 10;
		} catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("배열의 index번호는 0~4까지만 사용가능");
			System.out.println(aiob);
		}
	}
}
