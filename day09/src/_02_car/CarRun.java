package _02_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar aCar = new AmbulanceCar("amCar","기아");
		
		aCar.power();
		System.out.println("현재속도 : " + aCar.speedUp());
		System.out.println("현재속도 : " + aCar.speedUp());
		aCar.siren();
		aCar.firstAid();
		aCar.siren();
		aCar.power();
	}
}
