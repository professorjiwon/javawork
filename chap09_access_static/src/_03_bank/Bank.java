package _03_bank;

public class Bank {
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance >= money)
			balance -= money;
		else
			System.out.println("잔액 부족");
	}
	
	public void getBanlance() {
		System.out.println("잔액 : " + balance);
	}
	/*
	int getBanlance() {
		return balance;
	}
	*/
}
