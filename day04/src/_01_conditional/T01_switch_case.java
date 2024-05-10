package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		// switch-case
		int num1 = 1;  // 1~2만 들어있는 변수
		
		switch(num1) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
		}
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력(0~2 숫자만) : ");
		int num2 = sc.nextInt();
		
		switch(num2) {
		case 0:
			System.out.println("0입력함");
			break;
		case 1:
			System.out.println("1입력함");
			break;
		case 2:
			System.out.println("2입력함");
			break;
		default :
			System.out.println("잘못입력");
		}
*/
		char ch = 'l';  // k, l, p
		switch(ch) {
		case 'k':
			System.out.println("김씨입니다");
			break;
		case 'l':
			System.out.println("이씨입니다");
			break;
		case 'p':
			System.out.println("박씨입니다");
			break;
		default :
			System.out.println("성이 김,이,박씨가 아닙니다");
		}
		
		System.out.println("-------------------------");
		
		switch(ch) {
		case 'k':
			System.out.println("김씨입니다");
		case 'l':
			System.out.println("이씨입니다");
		case 'p':
			System.out.println("박씨입니다");
		default :
			System.out.println("성이 김,이,박씨가 아닙니다");
		}
		
		System.out.println("-------------------------");
		
		int month = 2;
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
		}
		
		// 문1. 사용자로부터 2수와 연산자를 입력받아 연산결과를 출력
		// 3 + 1
		Scanner scan = new Scanner(System.in);
		System.out.print("연산할 두 숫자와 연산자 입력( ex] 3 + 7) : ");
		int num3 = scan.nextInt();
		String op = scan.next();
		// char op = scan.next().charAt(0);  ->  case '+':  외따옴표로
		int num4 = scan.nextInt();
		
		switch(op) {
		case "+":
			System.out.println(num3 + "+" + num4 + "=" + (num3+num4));
			break;
		case "-":
			System.out.println(num3 + "-" + num4 + "=" + (num3-num4));
			break;
		case "*":
			System.out.println(num3 + "*" + num4 + "=" + (num3*num4));
			break;
		case "/":
			// System.out.println(num3 + "/" + num4 + "=" + (double)num3/num4);
			System.out.printf("%d%s%d=%.2f\n",num3,op,num4,(double)num3/num4);
			break;
		case "%":
			System.out.println(num3 + "%" + num4 + "=" + (num3%num4));
		}
	}

}
