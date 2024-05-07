package _02_variable;

public class T02_char {

	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = '김';
		char ch3 = '&';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'A' + 1;
		System.out.println(ch4);
		char ch5 = 'C';
		// char ch6 = ch5 + 1;  자동형변환 때문에 오류
		
		char ch7 = 'A' + '1';  // A의 유니코드(65)+ 1의 유니코드(49) = 114
		System.out.println(ch7);
	}
}
