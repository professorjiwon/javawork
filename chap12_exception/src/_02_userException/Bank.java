package _02_userException;
/*
 * throw : 강제로 예외 발생 시킴
 * throws : 예외가 발생할 수 있는 메서드
            예외처리는 사용하는 곳에서 처리
 */
public class Bank {
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws UserException {
		if(balance >= money)
			balance -= money;
		else
			throw new UserException("잔고부족 : " + (money-balance) + "모자람");
	}
	
	public void getBanlance() {
		System.out.println("잔액 : " + balance);
	}
}
