package _01_operation;

public class T03_compare {

	public static void main(String[] args) {
		// 비교연산자(같은가) : ==
		//         (다른가) : !=
		
		int num1 = 10;
		int num2 = 50;
		
		boolean re1 = num1 == num2;
		System.out.println("num1과 num2의 값이 같은가? " + re1);
		
		System.out.println("num1과 num2의 값이 같은가? " + (num1 == num2));
		
		System.out.println("num1과 num2의 값이 다른가? " + (num1 != num2));

	}

}
