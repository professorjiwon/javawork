package _01_polymorphosm;

public class Pet {
	private String kind;
	private String color;
	
	Pet(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	void sound() {
		System.out.println("울음소리");
	}
	void feature() {
		System.out.println("특징");
	}
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상" + color;
	}
	void info() {
		System.out.println("종류 : " + kind + ", 색상" + color);
	}
}
