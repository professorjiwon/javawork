package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T11_Exception {

	public static void main(String[] args) {
		try {
			int[] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력");
			int sum = 0;
			for(int i=0; i<num.length; i++) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				num[i] = sc.nextInt();
				sum += num[i];
			}
			num[3] = 5;
			System.out.println("합계 : " + sum);
		} catch(Exception e) {  
			// Exception은 모든 예외클래스의 최상위 클래스
			// 모든 예외를 다 받을 수 있다
			System.out.println("예외 발생");
			e.printStackTrace();
			// System.out.println(e);
		} 
		
		
		// Exception을 쓸 때 주의점
		/*
		try {
			int[] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력");
			int sum = 0;
			for(int i=0; i<num.length; i++) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				num[i] = sc.nextInt();
				sum += num[i];
			}
			num[3] = 5;
			System.out.println("합계 : " + sum);
		} catch(Exception e) { // 맨 아래에 위치해야함 모든 예외는 다 들어오기 때문
			System.out.println("예외 발생");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어섬");
		} catch(InputMismatchException e) {
			System.out.println("정수만 넣으세요");
		} 
		*/
	}
}
