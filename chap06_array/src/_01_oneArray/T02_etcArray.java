package _01_oneArray;

import java.util.Arrays;
import java.util.Scanner;

public class T02_etcArray {

	public static void main(String[] args) {
		char chArr[] = {'a', 'b','c','d'};
		double dArr[] = {3.14, 5.87, 297.8};
		boolean bArr[] = {true, false, false, true};
		String sArr[] = {"김지원","홍길동","*&^%"};
		
		String sArr2[] = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<sArr2.length; i++) {
			System.out.print((i+1) + "번째 팀원 이름 입력 : ");
			sArr2[i] = sc.next();
		}
		System.out.println();
		
		for(int i=0; i<sArr2.length; i++) {
			System.out.print(sArr2[i] + ", ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println(Arrays.toString(sArr2));
		System.out.println("chArr : " + chArr);
		System.out.println("doubleArr : " + dArr);
		System.out.println(Arrays.toString(dArr));
		
	}

}
