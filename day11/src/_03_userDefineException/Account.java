package _03_userDefineException;

public class Account {
private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	void witdraw(int money) throws UserException {
		if(balance < money)
			throw new UserException("잔고부족:" + (money-balance) +"모자람");
		else
			balance -= money;
	}
	
	int getBalance() {
		return balance;
	}
}
