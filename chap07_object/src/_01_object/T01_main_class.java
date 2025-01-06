package _01_object;

public class T01_main_class {

	public static void main(String[] args) {
		// T01_api_class 객체 생성

		/*
		 - new는 객체를 생성하는 키워드
		 - 객성 생성하기
		   클래스이름 변수명 = new 클래스이름();
		 */
		
		T01_api_class t1 = new T01_api_class();
		System.out.println(t1.num);
		System.out.println(t1.name);
		
		t1.name = "홍길동";
		System.out.println(t1.name);
		
		T01_api_class t2 = new T01_api_class();
		System.out.println(t2.name);
		
		T01_api2 api2 = new T01_api2();
		System.out.println(api2.name);
	}

}
