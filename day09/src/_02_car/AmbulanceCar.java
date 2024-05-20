package _02_car;

public class AmbulanceCar extends Car {
	boolean siren;
	
	AmbulanceCar(String model, String company) {
		super(model, company);
	}
	
	void siren() {
		if(siren = !siren)
			System.out.println("삐요삐요~~~~");
		else
			System.out.println("사이렌을 멈춤니다");
	}
	/*
	void sirenRun() {
		System.out.println("삐요삐요~~~~");
	}
	void sirenStop() {
		System.out.println("사이렌을 멈춤니다");
	}
	*/
	
	void firstAid() {
		System.out.println("응급처치를 합니다");
	}

}
