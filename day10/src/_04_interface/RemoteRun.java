package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// 인터페이스는 객체생성할 수 없다
		//  그러나 형변환은 가능
		
		// RemoteControl rc1 = new RemoteControl();
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		System.out.println("----------------");
		
		RemoteControl rc = audio1;
		rc.turnOn();
		rc.turnOff();
		System.out.println("----------------");
		
		rc = new Tv();
		rc.turnOn();
		rc.turnOff();
	}

}
