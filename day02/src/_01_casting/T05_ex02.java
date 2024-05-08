package _01_casting;

import java.util.Scanner;

public class T05_ex02 {

	public static void main(String[] args) {
		// 1.
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("성별 입력(남/여) : ");
		String gender = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("키 입력(cm) : ");
		double key = scan.nextDouble();
		
		System.out.println("키 " + key + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
		System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다^^", key, age, gender, name);
		
		// 2.
		System.out.print("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println("더하기한 결과 : " + (num1 + num2));
		System.out.println("빼기한 결과 : " + (num1 - num2));
		System.out.println("곱하기한 결과 : " + num1 * num2);
		System.out.println("나눈 몫의 결과 : " + num1 / num2);
		
		// 3.
		System.out.print("가로 : ");
		double width = scan.nextDouble();
		System.out.print("세로 : ");
		double height = scan.nextDouble();
		
		double area = width * height;
		double cir = (width + height) * 2;
		System.out.println("면적 : " + area);
		System.out.println("둘렉 : " + cir);

		// 4.
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));

		/*
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		*/
	}
}
