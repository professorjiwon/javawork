package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		// % 값을 나눈 나머지
		int num1 = 10;
		int num2 = 3;
		int result = num1 % num2;
		System.out.println("몫 : " + num1 / num2);
		System.out.println("나머지 : " + result);
		
		num1 = num1 + 10;
		System.out.println(num1);
		
		num1 += 10;  // num1 = num1 + 10을 줄여서 씀
		System.out.println(num1);
		
		num1 += 5;
		System.out.println(num1);
		
		num1 -= 8;
		System.out.println(num1);
		
		num1 -= 17;
		System.out.println(num1);
		
		num1 *= 3;
		System.out.println(num1);
		
		num1 /= 3;
		System.out.println(num1);
		
		num1 %= 4;
		System.out.println(num1);
		
		

		
	}

}
