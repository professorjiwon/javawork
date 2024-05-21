package _01_polymorphosm;

public class Dog extends Pet{
	Dog() {
		super("똥개","누렁색");
	}
	Dog(String kind, String color) {
		super(kind, color);
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	@Override
	void feature() {
		System.out.println("똥을 잘먹음");
	}
}
