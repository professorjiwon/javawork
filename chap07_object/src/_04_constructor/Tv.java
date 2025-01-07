package _04_constructor;
// 생성자
// - 객체가 만들어 질 때 딱 한번 호출

public class Tv {
	String company;
	String model;
	int inch;
	
	// 기본 생성자
	Tv() {
		System.out.println("기본 생성자 호출");
	}
	
	// 매개변수 1개인 생성자
	Tv(String company1) {
		System.out.println("매개변수가 1개인 생성자 호출");
		company = company1;
	}
	
	Tv(String company2, String model2, int inch2) {
		System.out.println("매개변수가 3개인 생성자 호출");
		company = company2;
		model = model2;
		inch = inch2;
	}
}














