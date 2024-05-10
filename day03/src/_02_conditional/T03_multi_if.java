package _02_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score > 100)
			System.out.println("100점이상은 넣을 수 없습니다");
		else if(score >= 90) // 100~90
			System.out.println("A학점");
		else if(score >= 80) // 89~0중에서 89~80
			System.out.println("B학점");
		else if(score >= 70) // 79~0중에서 79~70
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else if(score > 0)
			System.out.println("F학점");
		else
			System.out.println("점수는 음수가 될 수 없습니다.");
		
//	  ...,103,102,101     -1,-2,-3 ...
		if(score > 100 || score < 0)
			System.out.println("점수를 잘못입력하였습니다");
		else if(score >= 90) // 100~90
			System.out.println("A학점");
		else if(score >= 80) // 89~0중에서 89~80
			System.out.println("B학점");
		else if(score >= 70) // 79~0중에서 79~70
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else 
			System.out.println("F학점");
	}
}
