package _01_array;

import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {
		// 자리바꿈
		int num1 = 10;
		int num2 = 20;
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		// 1차원 배열의 min값과 max값 가져오기
		int[] score = {8,4,9,2,6,1,3,5,7};
		
		int min = score[0];
		int max = score[0];
		for(int i=1; i<score.length; i++) {
			if(min > score[i])
				min = score[i];
			
			if(max < score[i])
				max = score[i];
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최대값 : " + max);
		
		// index번호 연산 가능
		int k=2;
		System.out.println(score[k]);
		System.out.println(score[k+5]);
		System.out.println(score[k*3]);
		System.out.println(score[k-1]);
		
		int arri[] = new int[10];
		for(int i=0; i<arri.length; i++) {
			arri[i] = (int)(Math.random()*10);
		}
		
		for(int i=0; i<arri.length; i++) {
			System.out.print(arri[i] + ", ");
		}
		System.out.println();
		
		// Arrays클래스 라이브러리(API)를 이용한 출력
		System.out.println(Arrays.toString(arri));
	}
}
