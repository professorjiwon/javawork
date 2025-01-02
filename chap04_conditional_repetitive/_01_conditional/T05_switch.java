package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch ~ case문
		/*
		 switch(변수) {
		 	case 1 :
		 		변수에 들어있는 값이 1일때 실행;
		 		break;
		 	case 2 :
		 		변수에 들어있는 값이 2일때 실행;
		 		break;
		 	defalut :
		 		변수에 들어있는 값이 1,2를 제외한 나머지 숫자일 때 실행;
		 } 
		 */
		
		int num = 2;
		switch(num) {
			case 1:
				System.out.println("1입니다");
				break;
			case 2:
				System.out.println("2입니다");
				break;
			case 3:
				System.out.println("3입니다");
				break;
			default:
				System.out.println("1,2,3을 제외한 다른 숫자");
		}
		System.out.println("----------------------------");
		
		// break가 없을 때
		char ch = 'l';
		switch(ch) {
			case 'k':
				System.out.println("김씨입니다");
			case 'l':
				System.out.println("이씨입니다");
			case 'p':
				System.out.println("박씨입니다");
			default:
				System.out.println("성이 김,이,박씨가 아닙니다");
		}
		
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 달을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
			case 2:
			case 12:
				System.out.println("겨울에 태어났군요");
				break;
			case 3: case 4: case 5:
				System.out.println("봄에 태어났군요");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름에 태어났군요");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을에 태어났군요");
				break;
			default:
				System.out.println("잘못입력");
		}
		System.out.println("----------------------------");
		
		// 문) 연산할 두 숫자와 연산자(+,-,*,/,%)를 입력받아
		//		연산한 결과 출력
		System.out.print("연산자(+,-,*,/,%) 입력 : ");
		char op = sc.next().charAt(0);
		
		System.out.print("연산할 두 숫자 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		switch(op) {
			case '+':
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
				break;
			case '-':
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
				break;
			case '*':
				System.out.println(num1 + "*" + num2 + "=" + num1*num2);
				break;
			case '/':
				// System.out.println(num1 + "/" + num2 + "=" + (double)num1/num2);
				System.out.printf("%d/%d=%.2f", num1, num2, (double)num1/num2);
				break;
			case '%':
				System.out.println(num1 + "%" + num2 + "=" + num1%num2);
				break;
			default:
				System.out.println("잘못입력");
		}
	}
}