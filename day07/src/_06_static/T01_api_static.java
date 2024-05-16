package _06_static;

public class T01_api_static {
	// 인스턴스 필드(속성)
	int num = 10;			// 변수
	final int MAX = 25;		// 상수
	
	void method1() {  // 매개변수도 지역변수
		// 지역변수
		int me1 = 3;
		System.out.println(me1);
	}
	
	// 정적필드(속성)
	static int sNum = 20;
	static String sName = "이보영";
}
