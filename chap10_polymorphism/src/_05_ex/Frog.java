package _05_ex;

public class Frog extends Pet {
	Frog() {
		this("청개구리","초록색","말을 안들음");
	}
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("개굴개굴~~");
	}
}
