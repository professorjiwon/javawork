package _01_operation;

import java.util.Scanner;

public class T06_Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		String result = num1 > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
		
		
		// 2.
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		String result2 = num2 > 0 ? "양수다" : num2 == 0 ? "0이다" : "음수다";
		System.out.println(result2);
			
		// 3.
		System.out.print("정수 입력 : ");
		int num3 = sc.nextInt();
		
		String result3 = num3 % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result3);
		
		// 4.
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 갯수 : ");
		int candy = sc.nextInt();
		
		int share = candy / person;
		int remainder = candy % person;
		System.out.println("1인당 사탕 갯수 : " + share);
		System.out.println("남은 사탕 갯수 : " + remainder);
		
		
		// 5.
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int gradeClass = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int classNum = sc.nextInt();
		
		// String 참조자료형을 받을 때( == 주소가 같은가?)
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String genderRe = gender.equals("M") ? "남학생" : "여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",
						  grade,gradeClass,classNum,name,genderRe,score);
		
		/*
		// 5.
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int gradeClass = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int classNum = sc.nextInt();
		
		// char 기본자료형을 받을 때 ( ==  값이 같은가? )
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String genderRe = gender == 'M' ? "남학생" : "여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",
						  grade,gradeClass,classNum,name,genderRe,score);
		*/
		// 6. 
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result6 = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
		// String result6 = age <= 13 ? "어린이" : age > 13 && age <= 19 ? "청소년" : "성인";
		System.out.println(result6);
		
		// 7.
		System.out.print("국어, 영어, 수학 점수 입력(공백으로 분리) : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String result7 = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
			
		System.out.println(result7);
		
		// 8.
		System.out.print("주민번호 입력(-포함) : ");
		char num8 = sc.next().charAt(7);
		
		String result8 = num8 == '1' || num8 == '3' ? "남자" : "여자";
		System.out.println(result8);
		
		// 9.
		System.out.print("정수 3개 입력(공백으로 분리) : ");
		int num9 = sc.nextInt();
		int num10 = sc.nextInt();
		int num11 = sc.nextInt();
		
		boolean result9 = num11 <= num9 || num11 > num10;
		System.out.println(result9);
		
		// 10.
		boolean result10 = num9 == num10 && num10 == num11;
		System.out.println("세개의 숫자가 모두 같은가? " + result10);
	}
}
