package _05_constructor;

class ConOver {
	int num;	// 인스턴스 변수
	double dou;
	String name;
	
	ConOver() {
		num = 1;
		dou = 1.0;
		name = "홍길동";
	}
	
	ConOver(int num) {  // 지역변수
		this.num = num;  // this : 나 자신의 객체
		dou = 1.0;
		name = "홍길동";
	}
	
	ConOver(int num, double dou) {
		this.num = num;
		this.dou = dou;
		name = "홍길동";
	}

	ConOver(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
	}
}

public class ConOver_main {
	public static void main(String[] args) {
		ConOver co1 = new ConOver();
		ConOver co2 = new ConOver(3, 6.7);
	}
}


