package _01_abstract;
/*
 * 추상클래스(abstract class)
  - 추상메서드가 1개라도 포함되어 있으면 반드시 추상클래스로 해야됨
    * 추상메서드 : 메서드에 선언부만 있고 내용(프로그램) 없는 메서드
                 ex) void 메서드명(매개변수);   (추상메서드는 앞에 abstract를 붙임)
                     -> abstract 메서드명(매개변수); 
  - 추상클래스는 객체를 생성할 수 없다(그래서 상속으로 받아서 사용됨) 
*/

// 추상클래스(추상메서드가 1개이상 포함)
abstract public class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	// 추상 메서드
	abstract void sound();
	
	void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	} 
	
	// getter메소드
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
