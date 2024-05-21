package _02_abstract;

public class Dog extends Pet{
	Dog() {
		// super("똥개","누렁색","똥을 잘먹음");
		this("똥개","누렁색","똥을 잘먹음");
	}
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	@Override
	void info() {
		System.out.println("종류 : " + super.getKind());	
	}
}
