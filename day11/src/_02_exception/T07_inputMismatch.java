package _02_exception;
import java.util.InputMismatchException;
// import 단축키 : ctrl + shift + o
import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum =0;
		for(int i=1; i<=3; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			try {
				int num = sc.nextInt();
				sum += num;
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다");
				sc.next();
				i--;
			}
		}
		System.out.println("합계 : " + sum);
	}

}
