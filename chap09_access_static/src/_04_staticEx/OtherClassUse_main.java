package _04_staticEx;

import _02_car.Ambulance;
// 다른 package의 클래스를 사용하려면 import한 후 사용가능
// import 패키지이름.클래스이름  (클래스이름은 패키지이름.클래스이름이 원래 클래스 이름)      
import _03_bank.Bank;

public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(9000);
		bank.getBanlance();
		bank.withdraw(5000);
		bank.getBanlance();
		
		Ambulance ab = new Ambulance("amCar", "기아");
		System.out.println(ab.model);
		ab.siren();
	}

}
