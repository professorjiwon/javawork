package _02_repetitive;

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
	}

}
