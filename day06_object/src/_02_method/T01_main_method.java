package _02_method;

public class T01_main_method {

	public static void main(String[] args) {
		T01_api_method ob1 = new T01_api_method();
		
		ob1.print1();
		// 주의 : 반환형이 없는 메소드는 main 클래스에서 변수에 저장할 수 도 없고, 출력할 수 도 없다
		// int abc = ob1.print1();
		// System.out.println(ob1.print1());
		
		int result = ob1.print2(); // 값 10이 들어옴
		System.out.println(result);
		System.out.println(ob1.print2());

	}

}
