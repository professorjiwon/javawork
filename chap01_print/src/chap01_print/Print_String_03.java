package chap01_print;

public class Print_String_03 {

	public static void main(String[] args) {
		// 쌍따옴표("") 는 문자열을 그대로 출력
		System.out.print("3+5=");
		System.out.println("8");
		
		// 연산은 쌍따옴표("")를 넣지 않는다
		System.out.println(3+5);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);  // 정수/정수=정수 : 몫만 출력
	}
}
