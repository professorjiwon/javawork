package _03_userDefineException;
//같은 프로젝트의 다른 패키지의 것을 쓰려면 그냥 import
import _01_anonymous.TestMain; 

// 다른 프로젝트의 클래스를 사용하려면 프로젝트 속성에서 우선 프로젝트를 포함시키고 난후
// import해야됨
import _03_bank.T01_api_bank;

public class AccountRun {

	public static void main(String[] args) {
		T01_api_bank b = new T01_api_bank();
		TestMain aa = new TestMain();
		
		Account bank = new Account();
		bank.deposit(1000);
		try {
			bank.witdraw(4000);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}
}
