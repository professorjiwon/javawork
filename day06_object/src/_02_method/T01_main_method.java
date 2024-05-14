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
		
		System.out.println(ob1.print3());
		
		ob1.print4(5);
		
		int re2 = ob1.print5(7, 8);
		System.out.println(re2);
		
		ob1.print6("더조은", 100);
		
		T02_api_method ob2 = new T02_api_method();
		System.out.println(ob2.add(5, 9));
		System.out.println(ob2.minus(10, 3));
		System.out.println(ob2.multiply(7, 3));
		System.out.printf("%.2f", ob2.divide(10, 3));
	}
}
