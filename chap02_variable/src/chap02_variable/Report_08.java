package chap02_variable;
import java.util.*;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로 부터 국어, 수학, 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점2째자리까지(반올림)) 출력
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("국어점수 입력 >> ");
		int kor = sc.nextInt();
		System.out.print("수학점수 입력 >> ");
		int math = sc.nextInt();
		System.out.print("컴퓨터점수 입력 >> ");
		int com = sc.nextInt();
		*/
		
		System.out.print("점수 입력(국어,수학,컴퓨터점수를 띄어쓰기로 넣기) >> ");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int com = sc.nextInt();
		
		int sum = kor + math + com;
		double avg = sum / 3.0;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
	}
}