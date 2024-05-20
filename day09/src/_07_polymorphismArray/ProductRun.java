package _07_polymorphismArray;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new GameDevice());
		b.info();

		b.buy(new Tv());
	}
}
