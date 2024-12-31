package chap02_ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("성별 입력(남/여) : ");
		String gender = scan.next();
		System.out.println("나이 입력 : ");
		int age = scan.nextInt();
		System.out.println("키 입력(cm) : ");
		double key = scan.nextDouble();
		
		System.out.println("키 " + key + "cm인 " + age 
				+ "살 " + gender + " " + name + "님 반갑습니다^^");
		
		System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다^^", key, age, gender, name);
		
		// 2.
		System.out.print("정수 2개 입력 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("더하기 결과 : " + (num1+num2));
		System.out.println("빼기 결과 : " + (num1-num2));
		System.out.println("곱하기 결과 : " + num1*num2);
		System.out.println("나누기 몫 결과 : " + num1/num2);
		System.out.println("나누기한 나머지 : " + num1%num2);
		
		// 3.
		System.out.print("가로와 세로값 입력(실수형) : ");
		double width = scan.nextDouble();
		double height = scan.nextDouble();
		
		double area = width * height;
		double cir = (width + height) * 2;
		
		System.out.printf("면적 : %.2f\n", area);
		System.out.println("둘레 : " + cir);
		
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		/*
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		*/
	}

}
