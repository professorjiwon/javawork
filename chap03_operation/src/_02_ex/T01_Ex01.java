package _02_ex;

import java.util.Scanner;

public class T01_Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		String re1 = num1 > 0 ? "양수" : "양수가 아님";
		System.out.println(re1);
		System.out.println(num1 > 0 ? "양수" : "양수가 아님");  // 바로 출력해도됨
		
		
		// 2.
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		
		String re2 = num2 > 0 ? "양수" : num2 == 0 ? "0" : "음수";
		// String re2 = num2 > 0 ? "양수" : num2 < 0 ? "음수" : "0" ;
		System.out.println(re2);
		
		
		// 3.
		System.out.print("정수 입력 : ");
		int num3 = scan.nextInt();
		
		String re3 = num3 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(re3);
		
		
		// 4.
		System.out.print("인원수와 사탕의 갯수 입력 : ");
		int person = scan.nextInt();
		int candy = scan.nextInt();
		
		int re4 = candy / person;
		int re4_1 = candy % person;
		
		System.out.println("1인당 사탕 개수 : " + re4);
		System.out.println("남은 사탕 개수 : " + re4_1);
		
		
		// 5.
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		System.out.print("학년 입력(숫자만) : ");
		int grade = scan.nextInt();
		
		System.out.print("반 입력(숫자만) : ");
		int gradeClass = scan.nextInt();
		
		System.out.print("번호 입력(숫자만) : ");
		int classNum = scan.nextInt();
		
		System.out.print("성별 입력(M/F) : ");
		char gender = scan.next().charAt(0);
		
		System.out.print("성적 입력(소수점 둘째 짜리까지) : ");
		double score = scan.nextDouble();
		
		char genderRe = gender == 'M' ? '남' : '여';
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.",
						   grade, gradeClass, classNum, name, genderRe, score);
		
		
		// 6.
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		String re6 = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
		System.out.println(re6);
		
		String re6_1 = age <= 13 ? "어린이" : age >= 14 && age <= 19 ? "청소년" : "성인";
		System.out.println(re6);
		
		
		// 7.
		System.out.print("국어, 영어, 수학 점수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		String re7 = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(re7);
		
		
		// 8.
		System.out.print("주민번호 입력(-포함) : ");
		
//		String regidentNum = scan.next();
//		char gen = regidentNum.charAt(7);
		
		char regidentNum = scan.next().charAt(7);
		
		String gen = regidentNum == '1' || regidentNum == '3' ? "남자" : "여자";
		System.out.println(gen);
		
		
		// 9.
		System.out.print("2개의 정수 입력(첫번째 정수는 두번째 정수보다 작은 숫자이여야 함) : ");	
		int num8 = scan.nextInt();
		int num9 = scan.nextInt();
		
		System.out.print("정수 입력 : ");
		int num10 = scan.nextInt();
		
		boolean re9 = num10 <= num8 || num10 > num9;
		System.out.println(re9);
		
		// 10.
		System.out.print("3개의 정수 입력 : ");
		int num11 = scan.nextInt();
		int num12 = scan.nextInt();
		int num13 = scan.nextInt();
		
		boolean re10 = num11 == num12 && num11 == num13;
		System.out.println("3개의 숫자가 모두 같은가? " + re10);
	}
}