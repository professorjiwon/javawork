package _04_polyBuyerArrayList;

public class Product_main {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		GameDevice game1 = new GameDevice();
		GameDevice game2 = new GameDevice();
		GameDevice game3 = new GameDevice();

		b.buy(game1);
		b.buy(com);
		b.buy(game2);
		b.buy(tv);	
		b.buy(game3);
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점");
		
		b.refund(game2);
		
		b.getInfo();
	}
}





