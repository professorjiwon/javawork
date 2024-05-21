package _03_abstract;

public class SmartPhone extends Phone {
	SmartPhone(String owner) {
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("옆으로 밀어서 전화를 받습니다");
	}

	@Override
	void turnOff() {
		System.out.println("종료버튼을 눌러 전화를 끊습니다");
	}
	
	void search(String search) {
		System.out.println(search + "를 검색함");
	}
}
