package _02_conditional;

public class T04_overlap_if {

	public static void main(String[] args) {
		// if문 안에 if문을 중첩으로 넣는다
		/*
		 if(조건식1){
		 	if(조건식2) {
		 		조건식2가 참일 때 실행
		 	} else {
		 		조건식2가 거짓일 때 실행
		 	}
		 } else {
		 	if(조건식3) {
		 		조건식3이 참일 때 실행
		 	} else {
		 		조건식3이 거짓일 때 실행
		 	}
		 }
		 */
		int num1 = 78;
		if(num1 > 100) {
			if(num1 > 200) {
				System.out.println("200보다 큰수");
			} else { // 101 ~ 200
				System.out.println("101~200사이의 숫자");
			}
		} else { // 100 ~ 음수 모두다
			if(num1 < 0) {
				System.out.println("음수");
			} else {  // 0~100
				System.out.println("0~100사이의 숫자");
			}
		}
	}
}
