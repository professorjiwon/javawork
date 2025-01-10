package _03_polyBuyerArray;

public class Product_main {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new GameDevice());
		b.buy(new Computer());
		b.buy(new GameDevice());
		b.buy(new Tv());	
		b.buy(new GameDevice());
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점");
		
		b.getInfo();
	}
}





