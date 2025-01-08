package _03_bank;

public class Bank {
	private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(balance >= money)
			balance -= money;
		else
			System.out.println("잔액 부족");
	}
	
	void getBanlance() {
		System.out.println("잔액 : " + balance);
	}
	/*
	int getBanlance() {
		return balance;
	}
	*/
}
