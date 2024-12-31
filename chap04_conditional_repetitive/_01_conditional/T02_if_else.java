package _01_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		 if(조건식){
		 	조건식이 참일 때 실행할 구문
		 } else {
		 	조건식이 거짓일 때 실행할 구문
		 }
		 */
		int score = 65;
		if(score >= 70) {
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에!!!");
		}
		
		System.out.println("------------------------------");
		
		if(score >= 70)
			System.out.println("합격입니다");
		else
			System.out.println("불합격입니다");
		
		System.out.println("------------------------------");
		
		int num1 = -100; // 양수(0포함)인지 음수인지 출력
		if(num1 >= 0)
			System.out.println("양수");
		else
			System.out.println("음수");
		
		// 사용자로부터 정수를 입력받아 짝수, 홀수 구분
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		
		if(num2 % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		/*
		if(num2 % 2 == 1 || num2 % 2 == -1)  // 음수일때 나머지는 -1
			System.out.println("홀수");
		else
			System.out.println("짝수");
		*/
	}
}
