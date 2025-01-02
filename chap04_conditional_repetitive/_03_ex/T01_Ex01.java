package _03_ex;

import java.util.Scanner;

public class T01_Ex01 {

	public static void main(String[] args) {
		
		// 1.
		Scanner sc = new Scanner(System.in);
	
		System.out.print("국어, 영어, 수학 점수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		double avg = (kor+eng+math) / 3.0;
		
		if(kor >= 40 && eng >=40 && math >=40 && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
			
		// 2. 
		int id = 12345;
		int pw = 9876;
		
		System.out.print("아이디와 비밀번호 입력(숫자만) : ");
		int userId = sc.nextInt();
		int userPw = sc.nextInt();
		
		if(id == userId) {
			if(pw == userPw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("ID가 틀렸습니다");
		}
		
		if(id == userId && pw == userPw) 
			System.out.println("로그인 성공");
		else if(id != userId)
			System.out.println("ID가 틀렸습니다");
		else
			System.out.println("비밀번호가 틀렸습니다");
		
		
		// 3.
		System.out.print("키와 몸무게 입력 : ");
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double heightM = height / 100;
		double bmi = weight / (heightM * heightM);
		System.out.println("당신의 BMI는 " + bmi);
		
		if(bmi < 18.5)
			System.out.println("저체중");
		else if(bmi < 23)
			System.out.println("표준체중");
		else if(bmi < 25)
			System.out.println("과체중");
		else if(bmi < 30)
			System.out.println("비만");
		else
			System.out.println("고도비만");
		 
		// 4.
		System.out.print("중간고사, 기말고사 점수 입력 : ");
		int middleScore = sc.nextInt();
		int finalScore = sc.nextInt();
		
		System.out.print("과제 점수 입력 : ");
		int report = sc.nextInt();
		
		System.out.print("출석 횟수 입력(총20회) : ");
		int attendScore = sc.nextInt();
		
		double mScore = middleScore * 0.2;
		double fScore = finalScore * 0.3;
		double rScore = report * 0.3;
		double result = mScore + fScore + rScore + attendScore;
		System.out.println("-----------------------------");
		
		System.out.println("중간고사 점수" + middleScore);
		System.out.println("기말고사 점수" + finalScore);
		System.out.println("과제 점수" + report);
		System.out.println("출석 점수" + attendScore);
		System.out.println("============ 결 과 ===========");
		
		if(attendScore < 20*0.7) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]\n", attendScore);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fScore);
			System.out.printf("과제 점수(30) : %.1f\n", rScore);
			System.out.printf("출석 점수(20) : %d\n", attendScore);
			System.out.printf("총점 : %.1f\n", result);
			if(result >= 70)
				System.out.println("PASS");
			else
				System.out.println("FAIL [점수 미달]");
		}
	}
}
