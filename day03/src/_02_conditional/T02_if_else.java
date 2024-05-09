package _02_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		 if(조건식) {
		 	조건이 참일 때 실행할 프로그램
		 } else {
		 	조건이 거짓일 때 실행할 프로그램
		 }		  
		 */
		
		// 실행할 프로그램이 한줄이면 중괄호 생략가능
		int num1 = 100;
		if(num1 > 0)
			System.out.println("양수");
		else
			System.out.println("양수가 아니다");
		
		// 실행할 프로그램이 한줄이상이면 중괄호를 반드시 넣어야 된다
		int score = 68;
		if(score >= 80) {
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에!!!");
		}
		
		// 사용자부터 숫자하나를 입력받아 짝수, 홀수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}
}
