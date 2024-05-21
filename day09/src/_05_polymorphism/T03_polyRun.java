package _05_polymorphism;
class Car {
	String color;
	int speed;
	void dirve() {
		System.out.println("운전중 빵빵!!!!");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireCar extends Car {
	void water() {
		System.out.println("물을 뿌립니다!~~~");
	}
}
public class T03_polyRun {
	public static void main(String[] args) {
		FireCar fCar = new FireCar();
		fCar.dirve();
		fCar.water();
		fCar.stop();
		
		Car car = fCar;
		car.dirve();
		car.stop();
		// car.water(); 사용불가
		
		FireCar fCar2 = (FireCar)car;  // 부모타입 => 자식타입으로 강제형변환
		/*
		 * 주의
		    반드시 부모는 최초객체생성시 자식의 타입으로 객체 생성 되어 있어야 됨
		 */
		
		Car car2 = new Car();
		
		// 컴파일 오류(실행시 오류가 발생)
		// FireCar fCar3 = (FireCar)car2;
		
		// instanceof : 좌측의 객체가 우측의 타입으로 만들어졌느냐 검사(true)
		FireCar fCar3 = null;
		if(fCar3 instanceof FireCar) {
			fCar3 = (FireCar)car2;
		} else {
			System.out.println("변환할 수 없음");
		}
	}
}



