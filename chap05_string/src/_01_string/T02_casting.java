package _01_string;

public class T02_casting {

	public static void main(String[] args) {
		// 문자 -> 기본자료형(boolean제외)으로 변환
		String str1 = "100";
		int num = Integer.parseInt(str1);
		double doub = Double.parseDouble(str1);
		
		System.out.println(str1 + 10);
		System.out.println(num + 10);
		System.out.println(doub + 10);
		
		// 기본자료형을 -> 문자 변환
		int num2 = 50;
		double dou2 = 3.14;
		
		String str2 = String.valueOf(num2);
		String str3 = String.valueOf(dou2);
		
		System.out.println(num2 + 100);
		System.out.println(dou2 + 100);
		System.out.println(str2 + num2);
		System.out.println(str3 + dou2);
	}
}