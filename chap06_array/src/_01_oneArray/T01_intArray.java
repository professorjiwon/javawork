package _01_oneArray;

public class T01_intArray {

	public static void main(String[] args) {
		/*
		 * 배열 : 같은 자료형을 연속된 저장공간에 저장
		 * 특징 
		   1. 배열의 길이를 지정하면 늘리거나 줄일 수 없다
		   2. 배열에서 각각의 값을 가져오거나 넣을때는 index번호 사용
		      index번호는 무조건 0부터 시작
		   
		 * 사용법
		   - 저장공간만 확보하고 나중에 값을 넣을 때
		      int[] 변수명 = new int[갯수];
		      int 변수명[] = new int[갯수];
		      
		   - 배열을 만들면서 값을 바로 넣을 때
		      int[] 변수명 = {1,2,3,4};   
		 */
		
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];
		
		int[] arrayInt3 = {1,2,3,4,5};
		System.out.println("index번호 3번의 값 : " + arrayInt3[3]);
		System.out.println("index번호 0번의 값 : " + arrayInt3[0]);
		
		arrayInt3[0] = 20;
		System.out.println("index번호 0번의 값 : " + arrayInt3[0]);
		
		System.out.println("----------------------------");
		for(int i=0; i<5; i++) {
			System.out.println(arrayInt3[i]);
		}		
		
		System.out.println("----------------------------");
		for(int i=0; i<5; i++) {
			arrayInt3[i] = i*2;
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("----------------------------");
		for(int i=0; i<10; i++) {
			System.out.println(arrayInt[i]);
		}
		
		System.out.println("----------------------------");
		// length : 배열의 길이
		int int1[] = {4,6,7,8,3,6,7};
		int int2[] = new int[5];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		
		for(int i=0; i<int1.length; i++) {
			System.out.println(int1[i]);
		}
		
		/*
		 1. 배열의 길이가 5인 배열 만들기
		 2. 1번 배열에 for문으로 0,3,6,9,12 값 넣기
		 3. 1번 배열 돌면서 합계 구하여 출력하기
		 */
		
		int[] num = new int[5];
		int sum1 = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = i*3;
			if(i == num.length-1)
				System.out.print(num[i] + "\n");
			else
				System.out.print(num[i] + ", ");
			sum1 += num[i];
		}
		System.out.println(sum1);
		
		/*
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		*/
		
	}

}
