package chap02_casting02;

public class Casting_02 {

	public static void main(String[] args) {
		int num1 = 1234567;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		// java에서 정수의 기본자료형 double
		float float1 = 5.345f;
				
		// java에서 정수의 기본자료형 int
		long long1 = 1113456711111111111L;
		float flo2 = long1;
		
		// 65535
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
	}
}
