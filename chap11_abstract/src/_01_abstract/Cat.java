package _01_abstract;
/*
 * 추상클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야 한다
 */
public class Cat extends Pet {
	Cat() {
		this("페르시안","흰색","빛나는 카리스마");
	}
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	/*
	// 추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야됨
	void sound() {  }
	*/
	
	void sound() {
		System.out.println("야옹~~");
	}
}
