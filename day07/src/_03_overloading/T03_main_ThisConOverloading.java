package _03_overloading;

class ThisAaa {
	int num;
	double dou;
	String name;
	
	// 생성자에서 this() : 다른 생성자 호출
	// this()는 맨 첫줄에 있어야 됨
	ThisAaa() {
		this(1, 1.0, "홍길동");
		System.out.println("매개변수가 없는 생성자");
	}
	ThisAaa(int num) {
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	ThisAaa(int num, double dou) {
		this(num, dou, "홍길동");
		System.out.println("매개변수가 2개인 생성자(int,double)");
	}
	ThisAaa(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
}

public class T03_main_ThisConOverloading {
	public static void main(String[] args) {
		ThisAaa a1 = new ThisAaa();
		/*ThisAaa a2 = new ThisAaa(5, 10.56, "나야나");
		ThisAaa a4 = new ThisAaa(50, 50.1234);*/
	}
}
