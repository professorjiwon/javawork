package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("i="+ i + ", j=" + j);
			}
			System.out.println();
		}
		
		// 구구단
		/*
		 *** 2단 ***
		 2*1=2
		 2*2=4
		  ...
		 2*9=18
		  
		 *** 3단 *** 
		 3*1=3
		 3*2=6
		 3*3=9
		 ...
		 3*9=27		  
		 */

		for(int dan=2; dan<=9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
			System.out.println();
		}
		
		// 사용자로 부터 숫자를 입력받아 별 출력
		/*
		ex) 숫자입력 : 5
		*
		**
		***
		****
		*****
		
		ex) 숫자입력 : 4
		*
		**
		***
		****
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 구구단 옆으로 출력하기
		System.out.println(" 2단\t 3단\t 4단\t 5단\t 6단\t 7단\t 8단\t 9단");
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				//System.out.print(dan + "*" + i + "=" + dan*i + "\t");
				System.out.printf("%d*%d=%2d\t",dan,i,dan*i);
			}
			System.out.println();
		}
	}
}






