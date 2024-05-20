package _02_car;

public class Car {
	String model;
	String company;
	boolean power;
	int speed;
	
	Car(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	void power() {
		if(power = !power)
			System.out.println("차가 출발합니다");
		else
			System.out.println("차가 멈춤니다");
	}
	int speedUp() {
		speed += 5;
		return speed;
	}
	int speedDown() {
		speed -= 5;
		return speed;
	}
}
