package _06_polymorphismEx;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price*0.05);
	}
}
