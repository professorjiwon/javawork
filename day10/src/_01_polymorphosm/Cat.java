package _01_polymorphosm;

public class Cat extends Pet{
	Cat() {
		this("페르시안","갈색","새침함");
	}
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
