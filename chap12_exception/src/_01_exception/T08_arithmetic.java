package _01_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나누기할 정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			System.out.println("몫 : " + num1/num2);
			System.out.println("나머지 : " + num1%num2);
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
}
