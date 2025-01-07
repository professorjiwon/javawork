package _05_constructor;

class ConOver2 {
	int num;	// 인스턴스 변수
	double dou;
	String name;
	
	// 다른 생성자 호출
	ConOver2() {
		this(1, 1.0, "홍길동"); // 무조건 첫째줄에 넣어야 함
		System.out.println("매개변수가 없는 생성자");
	}
	
	ConOver2(int num) {
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	
	ConOver2(int num, double dou) {
		this(num, dou, "홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	
	ConOver2(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	// 가변인자 : 들어올 인자(매개변수에 넣어줄 값)의 갯수를 모를 때
	// (int... num) : 인자가 0개 이상
	//  * 반드시 들어와할 인자가 있다면 먼저 선언하고 가변인자는 맨 마지막에 넣는다
	
	void method(int... num) {
		System.out.println("인자가 0개 이상");
		for(int result : num) {
			System.out.println(result);
		}
		System.out.println("--------------------------");
	}
	
	void method2(int num, int... num2) {
		System.out.println("인자가 1개 이상");
		System.out.println("첫번째 값 : " + num);
		
		for(int result : num2) {
			System.out.println(result);
		}
		
		System.out.println("--------------------------");
	}

	void method3(String str, String... name) {
		for(String n1 : name) {
			System.out.print(n1 + " " + str + " ");
		}
	}
              
}

public class ConOver2_main {
	public static void main(String[] args) {
		ConOver2 con = new ConOver2(5);
		System.out.println(con.num);
		System.out.println(con.dou);
		System.out.println(con.name);
		
		con.method();
		con.method(2);
		con.method(3,6,7,8,9);
		
		con.method2(5);
		con.method2(5,6,7,8);
		
		String[] names = {"홍길동", "강감찬", "이순신"};		
		con.method3("/", names);
	}
}