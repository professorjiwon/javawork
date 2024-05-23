package _01_langPackage;
class Card {
	String kind;
	int num;
	Card() {
		this("HEART", 7);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	// toString 오버라이딩
	/*
	@Override
	public String toString() {
		return "" + kind + ", " + num;
	}
	*/
}
public class T03_toString {
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("SPADE", 10);
		Card card3 = null;
		
		// 객체를 넣은 변수를 출력하면 toString()메소드가 호출됨
		// Object클래스의 toString()은 패키지명.클래스명@해시코드(16진수로)
		System.out.println(card1);
		System.out.println(card1.toString());
		System.out.println("-------------------------------");
		
		System.out.println(card2);
		System.out.println(card2.toString());
		System.out.println("-------------------------------");
		
		//객체를 넣은 변수의 값이 null일때는 null을 출력해줌(toString() 호출안함)
		System.out.println(card3);
	}
}
