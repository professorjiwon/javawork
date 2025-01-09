package _02_car;

public class Ambulance extends Car {

	public Ambulance(String model, String company) {
		super(model, company);  // super : 부모의 생성자 호출
	}

	boolean siren;
	
	public void siren() {
		if(siren = !siren)
			System.out.println("삐요삐요~~~~");
		else
			System.out.println("사이렌을 멈춥니다");
	}
	
	void firstAid() {
		System.out.println("응급처치를 합니다");
	}
}
