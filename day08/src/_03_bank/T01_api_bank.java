package _03_bank;

public class T01_api_bank {
	private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	void witdraw(int money) {
		if(balance < money)
			System.out.println("잔고부족");
		else
			balance -= money;
	}
	
	int getBalance() {
		return balance;
	}
}
