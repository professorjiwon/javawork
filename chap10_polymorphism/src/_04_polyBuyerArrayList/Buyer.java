package _04_polyBuyerArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 500; 
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();

	void buy(Product p) { 
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);
		System.out.println(p + "를 구입함");
	}
	
	void getInfo() {
		int sum = 0;
		String list = "";
		
		if(cart.isEmpty()) {
			System.out.println("구입한 물품이 없습니다");
			return;
		}
		
		for(int i=0; i<cart.size(); i++) {
			Product p1 = cart.get(i);
			sum += p1.price;
			list += p1 + ", ";
		}
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
		System.out.println("구입한 물품 목록 : " + list);
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 반품");
		} else {
			System.out.println("구입하지 않은 상품입니다");
		}
	}
	/*
	void getInfo() {
		int sum = 0;
		
		System.out.print("구입한 물품 목록 : ");
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			sum += cart[i].price;
			System.out.print(cart[i] + ", ");
		}
		System.out.println();
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
	}
	*/
}