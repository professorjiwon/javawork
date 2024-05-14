package _01_array;

import java.util.Arrays;

public class T07_향상된for문 {

	public static void main(String[] args) {
		// 향상된 for문 배열에서만 사용가능
		// 배열을 처음부터 끝까지 사용할 때
		int num[] = {1,2,3,4,5};
		
		for(int result : num) {
			System.out.println(result);
		}
		System.out.println("-------------------");
		
		String name[] = {"홍길동","아무개","김길동"};
		for(String result : name) {
			System.out.println(result);
		}
		System.out.println("-------------------");
		
		// 배열의 단점 : 배열의 크기 넣을 값보다 크기 메모리 낭비
		//			   배열의 크기가 적을 경우 나중에 늘리 수 없다
		
		// 배열의 크기가 적을 경우 copy하여 만들어야 함
		int[] oldScore = {98,67,48,100,94};
		int[] newScore = new int[10];
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i];
		}
		newScore[5] = 57;
		System.out.println(Arrays.toString(newScore));
		
		// 라이브러리(api) : arraycopy(복사할배열,복사할index번호,새배열,새배열의index번호(부터넣기),갯수)
		System.arraycopy(oldScore, 0, newScore, 6, 4);
		System.out.println(Arrays.toString(newScore));
		
		// 3개를 넣을 수 있는 문자열 배열만들어서 값을 넣기
		// 10개짜리 배열을 만들어서 복사하여 넣기 (index 5번부터 2개만 넣기)
		String[] oldStr = {"java","html","jsp"};
		
		String[] newStr = new String[10];
		
		// 라이브러리 사용
		System.arraycopy(oldStr, 0, newStr, 5, 2);
		
		// for문사용
		for(int i=0; i<oldStr.length-1; i++) {
			newStr[i+5] = oldStr[i];
		}
		
		// 향상된 for문 사용
		int index = 5;
		for(String str : oldStr) {
			newStr[index++] = str;
		}
		System.out.println(Arrays.toString(newStr));
	}
}







