package _02_abstract;
// 추상클래스 : 클래스 앞에 abstract 키워드 사용
//			  추상메서드가 1개이상 포함되어 있으면 반드시 추상클래스로 해야한다.
abstract public class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	// 추상 메서드 : 메서드 앞에 abstract 키워드 사용
	//             선언부만 있고 실행부가 없는 메서드
	//   		   상속받는 곳에서 반드시 구현해야됨
	abstract void sound();
	abstract void info();
	
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
