package _03_ex;

public class SmartPhone extends Phone {
	
	SmartPhone() {
		this("삼성", "흰색");	// 나의 다른 생성자 호출
	}
	/*
	SmartPhone() {
		super("삼성", "흰색");  // 부모 생성자에 직접 값을 넣어주기
	}
	*/
	SmartPhone(String model, String color) {
		super(model, color);
	}

	String search(String search) {
		System.out.println(search + "를 검색합니다");
		return "검색완료";
	}
}
