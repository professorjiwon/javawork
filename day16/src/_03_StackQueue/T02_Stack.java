package _03_StackQueue;

import java.util.*;

class Money {
	private int value;

	public Money(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}	
}
public class T02_Stack {

	public static void main(String[] args) {
		Stack<Money> monStack = new Stack<Money>();
		
		monStack.push(new Money(1000));
		monStack.push(new Money(30));
		monStack.push(new Money(500));
		monStack.push(new Money(40));
		
		System.out.println("스택의 크기 : " + monStack.size());
		
		while(!monStack.isEmpty()) {
			Money money = monStack.pop();
			System.out.println("꺼내온 금액 : " + money.getValue() + "원");
		}
	}
}
