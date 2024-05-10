package _02_conditional;

import java.util.Scanner;

public class T01_if {

	public static void main(String[] args) {
		// 조건문
		/*
		 if(조건식) {
		    조건이 참일때 실행할 프로그램
		 }
		 */
		
		int num1 = 100;
		// if문의 실행할 코드가 한줄일때는 중괄호({})를 않넣어도되고 넣어도됨
		if(num1 != 100) 
			System.out.println("100점이 아니다.");
		
		// if문의 실행할 코드가 한줄 이상일때는 반드시 중괄호를 넣어준다
		if(num1 == 100) {
			System.out.println("100점입니다.");
			System.out.println("안녕");
		}
		
		int num2 = 95;
		if(num1 < num2) {
			System.out.println(num1 + "은 " + num2 + "보다 작다");
		}
		System.out.println("if의 조건과 상관없이 실행");
		
		// 사용자로 부터 점수를 입력받아 80점 이상이면 합격입니다. 축하합니다
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 80) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		}
	}
}
