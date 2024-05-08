package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		// 총점과 평균을 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("컴퓨터 점수 입력 : ");
		int com = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = kor + com + math;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
	}
}
