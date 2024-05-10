package _02_repetitive;

public class T05_random {

	public static void main(String[] args) {
		// Math클래스(수학에 관련된 클래스)
		double random1 =Math.random();
		System.out.println(random1); // 실수형 : 0 ~ 0.99999999 * 10
		System.out.println("------------------------");
		
		random1 = Math.random() * 10;
		System.out.println(random1); // 실수형 : 0 ~ 9.99999999
		
		int random2 = (int)random1;		// 정수로 강제 형변환 : 0 ~ 9
		System.out.println(random2); 
		
		int random3 = (int)random1 + 1;	// 정수로 강제 형변환한 후 1증가 : 1 ~ 10
		System.out.println(random3);
		System.out.println("------------------------");
		
		// 0~4까지 숫자중 랜덤으로 추출
		// 0 ~ 0.99999 * 5 = 0 ~ 4.99999999999
		int random4 = (int)(Math.random() * 5);  // 0~4
		System.out.println(random4);
		
		int random5 = random4 + 1;  // 1~5
	}
}
