package _07_ex;

public class Game implements Product  {
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
	
	void changeGame(String gameName) {
		System.out.println(gameName + "로 변환합니다");
	}
	
	@Override
	public String toString() {	// class의 최상위 클래스 Object에 있는 메소드
		return "game";
	}
}
