package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T06_ex02 {

	public static void main(String[] args) {
		// 1.
		int[] iarr1 = new int[10];
		for(int i=0; i<iarr1.length; i++) {
			iarr1[i] = i+1;
			System.out.print(iarr1[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 2.1
		int[] iarr2 = new int[10];
		for(int i=0; i<iarr2.length; i++) {
			 iarr2[i] = 10-i;
			 System.out.print(iarr2[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 2.2
		int[] iarr22 = new int[10];
		for(int i=0; i<iarr22.length; i++) {
			iarr22[9-i] = i+1;
		}
		for(int i=0; i<iarr22.length; i++) {
			System.out.print(iarr22[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 2.3
		int[] iarr23 = new int[10];
		for(int i=iarr23.length-1; i>=0; i--) {
			iarr23[9-i] = i+1;
			System.out.print(iarr23[9-i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 2.4
		int[] iarr24 = new int[10];
		
		int count = 10;
		for(int i=0; i<iarr24.length; i++) {
			iarr24[i] = count--;
			System.out.print(iarr24[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 3.
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("배열의 갯수 입력 : ");
		int count2 = scan.nextInt();
		
		int[] iarr3 = new int[count2];
		for(int i=0; i<iarr3.length; i++) {
			iarr3[i] = i+1;
			System.out.print(iarr3[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 4.
		String sarr4[] = {"사과","귤","포도","복숭아","참외"};
		System.out.println(sarr4[1]);
		System.out.println();
		
		// 5.
		System.out.print("문자열 : ");
		String str = scan.next();
		System.out.print("찾을 문자 : ");
		char search = scan.next().charAt(0);
		
		char[] carr5 = new char[str.length()];
		int count5 = 0;
		String index = "";

		for(int i=0; i<str.length(); i++) {
			carr5[i] = str.charAt(i);
			if(carr5[i] == search) {
				index += i + " ";
				count5++;
			}
		}
		System.out.println(str + "에 " + search + "가 존재하는 위치(인덱스) :" + index);
		System.out.println(search + " 개수 : " + count5);
		System.out.println();
		
		
		// 6.
		char[] days = {'월','화','수','목','금','토','일'};
		System.out.print("0~6사이 숫자 입력 : ");
		int iarr6 = scan.nextInt();
	
		if(iarr6 >= 0 && iarr6 <= 6) {
			System.out.println(days[iarr6] + "요일");
		} else {
			System.out.println("잘못 입력하였습니다");
		}
		System.out.println();
		
		
		// 7.
		System.out.print("배열의 개수 입력 : ");
		int count7 = scan.nextInt();
		
		int[] iarr7 = new int[count7];
		int sum = 0;
		
		for(int i=0; i<iarr7.length; i++) {
			System.out.print(i+1 + "번째 값 입력 : ");
			iarr7[i] = scan.nextInt();
			sum += iarr7[i];
		}

		System.out.println(Arrays.toString(iarr7));
		System.out.println("합계 : " + sum);
		System.out.println();
		
		
		// 8.
		while(true) {
			System.out.print("정수 입력 : ");
			int num8 = scan.nextInt();
			
			if(num8 >= 3 && num8%2 == 1) {
				int iarr8[] = new int[num8];
				/*
				5 => {1,2,3,2,1}			=> 2인덱스까지 증가 그이후 감소  5/2 = 2---1 
				7 => {1,2,3,4,3,2,1}		=> 3인덱스까지 증가 그이후 감소  7/2 = 3---1
				9 => {1,2,3,4,5,4,3,2,1}	=> 4인덱스까지 증가 그이후 감소  9/2 = 4---1
				*/
			/*	int value = 1;
				for(int i=0; i<iarr8.length; i++) {
					if(i < num8/2)
						iarr8[i] = value++;
					else
						iarr8[i] = value--;

					if(i < iarr8.length-1)
						System.out.print(iarr8[i] + ", ");
					else
						System.out.print(iarr8[i]);
				}
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		System.out.println();
		
		
		// 9.
		String[] chickens = {"양념","후라이드","파닭","허니버터"};
		System.out.print("치킨 이름 입력 : ");
		String menu = scan.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println(menu + "치킨 배달 가능");
		else
			System.out.println(menu + "치킨은 없는 메뉴입니다");
		
		System.out.println();
		*/
		
		// 10.
		int[] iarr10 = new int[10];
		for(int i=0; i<iarr10.length; i++) {
			iarr10[i] = (int)(Math.random()*10)+1;
			System.out.print(iarr10[i] + " ");
		}
		System.out.println();
		
		int min = iarr10[0];
		int max = iarr10[0];
		
		for(int i=1; i<iarr10.length; i++) {
			if(min > iarr10[i])
				min = iarr10[i];
			
			if(max < iarr10[i])
				max = iarr10[i];
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
