package _01_polymorphosm;

public class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	void sound() {
		System.out.println("울음소리");
	}
	void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	}
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
}
