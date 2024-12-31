package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자
		/*
		 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행 
		 */
		
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(result);
				
		char re1 = num1 < num2 ? '소' : '대';
		System.out.println("num2의 숫자는 num1의 숫자보다 " + re1);
		
		// num3의 값을 절대값으로 변경하기
		int num3 = -9;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		
		// 사용자로 부터 점수를 입력받아
		// 80점 이상이면 합격 그렇지 않으면 불합격을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		String re3 = score >= 80 ? "합격" : "불합격";
		System.out.println("시험에 " + re3 + "했습니다.");
		
		String re4 = 
				score > 100  ? "잘못입력했습니다" : 
				score >= 90 ? "A학점" :
				score >= 80 ? "B학점" :
				score >= 70 ? "C학점" :
				score >= 60 ? "D학점" :
				score >= 0 ? "F학점" : "잘못입력했습니다";
				// score >= 60 ? "D학점" : "F학점";
        System.out.println("당신의 학점은 " + re4);         
	}

}
