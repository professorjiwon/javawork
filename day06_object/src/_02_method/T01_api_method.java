package _02_method;

public class T01_api_method {
	// 반환형이 없는 메소드
	void print1() {
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	}
	
	// 반환형이 있는 메소드
	int print2() {
		System.out.println("반환값이 int이고 매개변수는 없는 메소드");
		return 10;
	}
}
