package _03_bank;

public class Bank_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(30000);
		bank.withdraw(25000);
		bank.getBanlance();
		
		bank.withdraw(20000);
		bank.getBanlance();
		
		/*
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.println("무엇을 하실 겁니까? ");
			System.out.print("1: 입금, 2: 출금, 3: 잔액확인, 0:끝내기 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 :
				System.out.print("입금할 금액을 넣으세요 : ");
				int money = sc.nextInt();
				bank.deposit(money);
				break;
			case 2 :
				System.out.print("출금할 금액을 넣으세요 : ");
				int money2 = sc.nextInt();
				bank.withdraw(money2);
				break;
			case 3 :
				bank.getBanlance();
			}
			System.out.println();
		} while(input != 0);
		System.out.println("은행업무 종료");
		*/
	}
}
