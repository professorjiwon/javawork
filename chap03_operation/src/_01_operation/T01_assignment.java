package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		// % : 나머지
		int result = 10 % 3;  //1
		System.out.println("10을 3으로 나눈 나머지 : " + result);
		
		
		result += 1;  // result = result + 1; 와 같은말
		System.out.println("result + 1 = " + result);
		
		result *= 3;  // result = result * 3
		System.out.println("result * 3 = " + result);
		
		result -= 3;  // result = result - 3
		System.out.println("result - 3 = " + result);
		
		result /= 2;  // result = result / 2 => 몫
		System.out.println("result / 2 = " + result);
		
		result = 7;
		result %= 5;  // result = result % 2 => 나머지
		System.out.println("result % 5 = " + result);
		
		int num2 = 300_000_000;	// 사람이 보기 편하게
		System.out.println(num2);
	}
}
