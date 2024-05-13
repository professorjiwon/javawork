package _01_array;

import java.util.Scanner;

public class T03_ex01 {

	public static void main(String[] args) {
		/*
		 사용자로부터 3사람의 국어,수학,컴퓨터 점수 입력
		 
		 번호  국어  수학  컴퓨터  총점  평균
		 ---------------------------------
		  1   90   100  100   290  96.67
		  2   90   100   90    280  95.00
		  3   90    80  100    270  90.00
		  */
		int score [][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("첫번째 학생 국어점수 입력 : ");
		score[0][0] = scan.nextInt();
		System.out.print("첫번째 학생 수학점수 입력 : ");
		score[0][1] = scan.nextInt();
		System.out.print("첫번째 학생 컴퓨터점수 입력 : ");
		score[0][2] = scan.nextInt();
		
		System.out.print("두번째 학생 국어점수 입력 : ");
		score[1][0] = scan.nextInt();
		System.out.print("두번째 학생 수학점수 입력 : ");
		score[1][1] = scan.nextInt();
		System.out.print("두번째 학생 컴퓨터점수 입력 : ");
		score[1][2] = scan.nextInt();
		*/
		/*
		System.out.print(1 + ".번째 학생 국어, 수학, 컴퓨터 점수 입력 : ");
		score[0][0] = scan.nextInt();
		score[0][1] = scan.nextInt();
		score[0][2] = scan.nextInt();
		
		System.out.print(2 + ".두번째 학생 국어, 수학, 컴퓨터 점수 입력 : ");
		score[1][0] = scan.nextInt();
		score[1][1] = scan.nextInt();
		score[1][2] = scan.nextInt();
		*/
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + ".번째 학생 국어, 수학, 컴퓨터 점수 입력 : ");
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = scan.nextInt();
			}
		}
			
		System.out.println("번호\t국어\t수학\t컴퓨터\t총점\t평균");
		System.out.println("------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1 + "\t");
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];			
			}
			System.out.print(sum+ "\t");  // 1 번째 학생의 총점이 들어있음
			System.out.printf("%.2f\n", (double)sum/score[i].length);
		}
	}
}
