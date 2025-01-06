package _04_arrayFor;

public class T01_arrayFor {

	public static void main(String[] args) {
		// 향상된 for문 : 배열에서만 사용
		// 배열의 처음부터 끝까지 순환할 때 사용
		
		int num[] = {1,2,3,4,5};
		for(int result : num) {
			System.out.println(result);
		}
		System.out.println("---------------");
		
		String str[] = {"홍길동","아무개","김남이"};
		for(String result : str) {
			System.out.println(result);
		}
		System.out.println("---------------");
		
		String newStr[] = new String[3];
		int index = 0;
		for(String result : str) {
			newStr[index++] = result;
			System.out.println(newStr[index-1]);
		}
		// System.out.println(Arrays.toString(newStr));
	}

}
