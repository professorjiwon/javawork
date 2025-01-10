package _02_polyBuyer;

public class Buyer {
	int money = 500; // 225
	int bonusPoint;  // 13 

	/*
	  - 매개변수로 객체를 받음. 
	    반환형 메서드이름(클래스명 변수명)  
	       -> 인자값은 반드시 클래스명으로 생성된 객체만 넘겨줘야 한다
			  그러면 객체의 주소가 넘어와서 변수명에 저장됨
	*/
	
	/*
	//  제품의 갯수만큼 만들어야 함
	void buy(Computer com) {
		if(money < com.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= com.price;
		bonusPoint += com.bonusPoint;
		System.out.println(com + "를 구입함");
	}
	void buy(Tv tv) {
		if(money < tv.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= tv.price;
		bonusPoint += tv.bonusPoint;
		System.out.println(tv + "를 구입함");
	}
	void buy(GameDevice gd) {
		if(money < gd.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= gd.price;
		bonusPoint += gd.bonusPoint;
		System.out.println(gd + "를 구입함");
	}
	*/

	// 형변환을 하면 모든 제품을 다 받을 수 있다
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}


















