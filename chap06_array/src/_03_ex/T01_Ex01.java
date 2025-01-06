package _03_ex;

import java.util.Arrays;
import java.util.Scanner;

public class T01_Ex01 {

	public static void main(String[] args) {
		// 1.
		int num1[] = new int[10];
		for (int i = 0; i < num1.length; i++) {
			num1[i] = i + 1;
			System.out.print(num1[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// 2.
		int num2[] = new int[10];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = 10 - i;
			System.out.print(num2[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// 3.
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("배열의 갯수 입력 : ");
		int arrCount = sc.nextInt();

		int[] num3 = new int[arrCount];
		for (int i = 0; i < num3.length; i++) {
			num3[i] = i + 1;
			System.out.print(num3[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// 4.
		String str[] = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(str[1]);
		System.out.println();
		
		// 5.
		문자열을 입력 받아 문자 하나하나를 배열에 넣고,
		   검색할 문자가 문자열에 몇 개 들어가 있는지
		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		System.out.print("문자열 입력 : ");
		String str1 = sc.next();
		System.out.print("찾을 문자 입력 : ");
		char search = sc.next().charAt(0);
		
		char[] chRe = new char[str1.length()];
		
		int count = 0;
		String index = "";
		
		for(int i=0; i<chRe.length; i++) {
			chRe[i] = str1.charAt(i);
			if(chRe[i] == search) {
				count++;
				index += i + " ";
			}
		}
		System.out.println(str1 + "에" + search + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(search + " 개수 : " + count);
		System.out.println();
		
		/* 5.2
			int count = 0;
			int[] index = new int[str1.length()];
			int z = 0;
			
			for(int i=0; i<chRe.length; i++) {
				chRe[i] = str1.charAt(i);
				if(chRe[i] == search) {
					count++;
					index[z++] = i;
				}
			}
			
			System.out.print(str1 + "에" + search + "가 존재하는 위치(인덱스) : ");
			for(int i=0; i<count; i++) {
				System.out.print(index[i] + " ");
			}
			System.out.println();
			System.out.println(search + " 개수 : " + count);
			System.out.println();
		

		// 6.
		char[] days = { '월', '화', '수', '목', '금', '토', '일' };
		System.out.print("0~6사이 숫자 입력 : ");
		int num6 = sc.nextInt();

		if (num6 >= 0 && num6 <= 6) {
			System.out.println(days[num6] + "요일");
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		System.out.println();
		
		
		// 7.
		System.out.print("배열의 크기 입력 : ");
		int num7 = sc.nextInt();
		
		int[] arr7 = new int[num7];
		
		int sum = 0;
		for(int i=0; i<arr7.length; i++) {
			System.out.print(i+1 + "번째 값 입력 : ");
			arr7[i] = sc.nextInt();
			sum += arr7[i];
		}
		System.out.println("합 : " + sum);
		System.out.println();
		 
		// 8.
		while(true) {
			System.out.print("3이상인 홀수의 정수 입력 : ");
			int num8 = sc.nextInt();
			
			if(num8 >= 3 && num8%2 == 1) { 
				int value = 1;
				int[] arr8 = new int[num8];
				for(int i=0; i<arr8.length; i++) {
					if(i < num8/2) {
						arr8[i] = value++;
					} else {
						arr8[i] = value--;
					}
					
					if(i < arr8.length-1)
						System.out.print(arr8[i] + ", ");
					else
						System.out.print(arr8[i] + "\n");
				}
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		System.out.println();

		// 9.
		String[] chickens = {"후라이드", "양념", "파닭", "허니버터"};
		System.out.print("치킨 이름 입력 : ");
		String menu = sc.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println(menu + "치킨은 배달 가능");
		else
			System.out.println(menu + "치킨은 없는 메뉴입니다");
		System.out.println();
		*/
		
		// 11.  버블정렬
		int bubble[] = {68, 15, 35, 57, 23, 4};

		for(int i=0; i<bubble.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<bubble.length-i-1; j++) {
				if(bubble[j] > bubble[j+1]) {
					int tmp = bubble[j];
					bubble[j] = bubble[j+1];
					bubble[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(bubble));
		
		
		
				
				
				
				
				
				
				
				
				

	}

}















