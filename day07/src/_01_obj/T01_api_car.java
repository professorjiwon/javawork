package _01_obj;

public class T01_api_car {
	String company = "삼성";
	String model = "SM7";
	String color = "흰색";
	int speed;
	boolean power;
	
	void power() {
		power = !power;
		if(power)
			System.out.println("시동을 켭니다");
		else
			System.out.println("시동을 끕니다");
	}

	int speed(int speed) {
		this.speed += speed;
		return this.speed;
	}
	
	int speedDown() {
		speed -= 5;
		return speed;
	}
}
