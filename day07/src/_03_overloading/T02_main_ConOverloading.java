package _03_overloading;

class Aaa {
	int num;
	double dou;
	String name;
	
	Aaa() {
		num = 1;
		dou = 1.0;
		name = "홍길동";
		System.out.println("매개변수가 없는 생성자");
	}
	
	Aaa(int num) {
		this.num = num;
		dou = 1.0;
		name = "홍길동";
		System.out.println("매개변수가 1개인 생성자");
	}
	Aaa(int num, double dou) {
		this.num = num;
		this.dou = dou;
		name = "홍길동";
		System.out.println("매개변수가 2개인 생성자(int,double)");
	}
	Aaa(int num, String name) {
		this.num = num;
		dou = dou;
		this.name = name;
		System.out.println("매개변수가 2개인 생성자(int,String)");
	}
	Aaa(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	// 가변인자 : 들어올 인자의 갯수를 모를때
	// (int... str) : 인자는 0개 이상
	void method(int... num) {
		System.out.println("인자가 0개 이상");
	}
	// (String name, String... str) : 인자는 1개 이상
	void method(String name, String... str) {
		System.out.println("인자가 반드시 1개 이상");
	}

	// 오류 : 모든 인자는 가변인자에 들어감
	/*
	void method(String... str, String num) {
		
	}
	*/
}

public class T02_main_ConOverloading {
	public static void main(String[] args) {
		Aaa a1 = new Aaa();
		Aaa a2 = new Aaa(5, 10.56, "나야나");
		Aaa a3 = new Aaa(10, "문자열");
		Aaa a4 = new Aaa(50, 50.1234);
		a4.method(5);
		a4.method("문자");
		a4.method();
	}
}
