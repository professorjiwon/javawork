package chap01_print;

public class String_Integer_04 {

	public static void main(String[] args) {
		// +는 숫자일때는 연산을 하지만 문자가 들어오면 연결해주는 역할
		// -는 문자가 들어와도 연결해주지 않지만 문자와 숫자 혼합되어있으면 원하는 결과가 다를 수 있음
		System.out.println(5+3 + " : 5+3의 연산결과");
		// 처음 문자열이 나오면 뒤에는 모두다 문자로 인식
		System.out.println("5+3=" + 5 + 3);
		// 문자열 뒤에 숫자로 인식하게 하고 싶은면 소괄호안에 넣어준다
		System.out.println("5+3=" + (5+3));
		
		// 오류 : +,-는 문자열로 인식. -는 정의되어 있지 않음 
		// System.out.println("5-3=" + 5-3);
		
		// +와-를 제외한 연산자는 그냥 연산자로 인식하여 소괄호를 안해줘도 됨
		System.out.println("5*3=" + 5*3);
		System.out.println("5/3=" + 5/3);
	}
}
