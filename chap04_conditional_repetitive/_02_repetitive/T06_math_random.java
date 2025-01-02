package _02_repetitive;

public class T06_math_random {

	public static void main(String[] args) {
		// Math(수학에 관련된 클래스)
		// random : 실수형으로 출력(0 ~ 0.99999999999)
		double random1 = Math.random();
		System.out.println(random1);
		
		double random2 = Math.random() * 10; // 0 ~ 9.999999999
		System.out.println(random2);
		
		// 0~9까지 정수만 출력
		int random3 = (int)(Math.random() * 10);
		System.out.println(random3);
		
		// 1~10까지 정수만 출력
		int random4 = (int)(Math.random() * 10) + 1;
		System.out.println(random4);
		
		// 0~4까지 정수만 출력
		int random5 = (int)(Math.random() * 5);
		System.out.println(random5);
		
		// 1~5까지 정수만 출력
		int random6 = random5 + 1;
		System.out.println(random6);
	}

}
