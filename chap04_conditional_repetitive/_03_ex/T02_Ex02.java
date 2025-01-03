package _03_ex;

import java.util.Scanner;

public class T02_Ex02 {

	public static void main(String[] args) {
		// 1.
		
		Scanner sc = new Scanner(System.in);
		/*
		// 1~6 정수
		int ran1 = (int)(Math.random()*6) + 1;
		int user;
		do {
			System.out.print("주사위의 숫자를 맞춰보세요 : ");
			user = sc.nextInt();
			
			if(ran1 == user)
				System.out.println("축하합니다. 맞췄습니다");
			else
				System.out.println("틀렸습니다. 다시 입력하세요");
		} while(ran1 != user);
		System.out.println("-------------------------");
		*/
		//2.
		System.out.println("구구단 출력");
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%2d\t",dan,i,dan*i);
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		// p111 1. 1~100 5의 배수의 합계
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%5 == 0)
				sum += i;
		}
		System.out.println("1~100까지 5의 배수의 합계 : " + sum);
		
		sum = 0;
		for(int i=5; i<=100; i+=5) {
			sum += i;
		}
		System.out.println("1~100까지 5의 배수의 합계 : " + sum);
		System.out.println("-------------------------");
		
		// p111 2. 
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		System.out.println("짝수의 합계 : " + evenSum);
		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("-------------------------");
		
		// p112 3.
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == 6) 
					System.out.println("(" + i + "," + j + ")");
			}
		}
		System.out.println("-------------------------");
		
		// p112 4.
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		// p112 5.
		for(int i=5; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		// p112 6.
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int z=1; z<=i*2+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		// p112 7.
		int count = 1;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("추출한  숫자" + num);
			
			if(num == 6) {
				break;
			}
			
			count++;
		}
		System.out.println("주사위가 6이나올때까지 총 횟수 : " + count);
	}
}
