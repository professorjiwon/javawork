package _01_casting;

import java.util.Scanner;

public class T04_ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 
		System.out.print("문자 1개 입력 : ");
		char cha = scan.next().charAt(0);
		// String ch = scan.next();
		
		int chUni = cha;
		System.out.println(cha + "의 유니코드 : " + chUni);
		
		// 2.
		System.out.print("국어 점수 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		// 3.
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K'; 
	    
	    // 3.1
	    System.out.println(iNum1 + "/" + iNum2 + "의 몫 : " + iNum1/iNum2);

	    // 3.2
	    double result = iNum2 * dNum;
	    System.out.println(iNum2 + " * " + dNum + " = " + result);
	    
	    // 3.3
	    System.out.println((double)iNum1);
	    
	    // 3.4
	    double result2 = (double)iNum1 / iNum2;
	    System.out.println(result2);
	    
	    // 3.5
	    float float1 = iNum1 / fNum;
	    System.out.println((int)float1);
	    
	    int result3 = iNum1 / (int)fNum;
	    System.out.println(result3);
	    
	    // 3.6
	    double result4 = (double)iNum1 / fNum;
	    System.out.println(result4);
	    
	    // 3.7
	    int result5 = ch;
	    System.out.println(result5);
	    
	    // 3.8
	    //int result6 = ch + 1;
	    char result6 = (char)(ch + 1);
	    System.out.println(result6);
	}

}
