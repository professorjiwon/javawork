package _01_abstract;
/*
 * 추상클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야 한다
 */
public class Frog extends Pet {
	Frog() {
		this("청개구리","초록색","말을 안들음");
	}
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	/*
	// 추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야됨
	void sound() {  }
	*/
	
	@Override
	void sound() {
		System.out.println("개굴개굴~~");
	}
}
