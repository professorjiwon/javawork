package _03_ex;

public class Phone {
	String model;
	String color;
	
	Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	
	void hangUp() {
		System.out.println("전화를 받는다");
	}
	
	void sendVoice(String message) {
		System.out.println(message);
	}
	
	void receveVoice(String message) {
		System.out.println(message);
	}
	
	void hangOut() {
		System.out.println("전화를 끊는다");
	}
}
