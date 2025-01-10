package _05_ex;

public class Dog extends Pet {
	Dog() {
		this("똥개","누렁색","똥을 잘먹음");
	}
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("멍멍~~");
	}
}
