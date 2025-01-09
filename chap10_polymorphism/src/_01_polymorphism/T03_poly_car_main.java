package _01_polymorphism;
class Car {
	String color;
	int speed;
	void dirve() {
		System.out.println("운전중~~~~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}
class FireCar extends Car {
	void water() {
		System.out.println("물을 뿌립니다~~");
	}
}
public class T03_poly_car_main {
	public static void main(String[] args) {
		FireCar fc1 = new FireCar();
		fc1.dirve();
		fc1.water();
		fc1.stop();
		
		Car car = fc1;
		car.dirve();
		car.stop();
		// car.water();   사용불가
		
		// 강제 형변환 : 부모타입 -> 자식타입
		FireCar fc2 = (FireCar)car;
		/*
		 * 주의 
		   부모는 반드시 최초객체생성시 자식 타입으로 객체가 생성되어 있어야만 가능
		 */
		
		Car car2 = new Car();
		// FireCar fc3 = (FireCar)car2;	// 컴파일 오류(실행시 오류가 발생)
		
		// instanceof : 좌측의 객체가 우측의 타입으로 만들어 졌느냐 검사(true)
		if(car2 instanceof FireCar) {
			FireCar fc3 = (FireCar)car2;
		} else {
			System.out.println("변환할 수 없음");
		}
		
		
		Car car3 = new FireCar();
		if(car3 instanceof FireCar) {
			FireCar fc4 = (FireCar)car3;
			System.out.println("변환함");
		} else {
			System.out.println("변환할 수 없음");
		}

	}
}
