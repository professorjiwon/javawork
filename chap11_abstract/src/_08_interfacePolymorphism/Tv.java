package _08_interfacePolymorphism;

public class Tv implements Product {
	boolean power;
	
	@Override
	public void power() {
		power = !power;
		if(power) 
			System.out.println("전원을 켭니다");
		else
			System.out.println("전원을 끕니다");
	}

	@Override
	public int volume(int volume) {		
		return volume;
	}
	
	int channel(int channel) {
		return channel;
	}
	
	@Override
	public void search(String search) {
		System.out.println(search + "를 유튜브에서 검색합니다.");
	}
	
	@Override
	public String toString() {	
		return "Tv";
	}
}
