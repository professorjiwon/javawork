package _04_tv;

public class Tv {
	// 속성 정의
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 65;
	int volume;  // 기본값 : 0
	int channel;
	boolean power;   // 기본값 : false
	
	// 메소드 정의
	void power() {
		power = !power;
		if(power)
			System.out.println("tv를 켭니다");
		else
			System.out.println("tv를 끕니다");			
	}
	
	int channelUp() {
		return ++channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	
}
