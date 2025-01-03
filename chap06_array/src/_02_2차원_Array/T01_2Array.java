package _02_2차원_Array;

public class T01_2Array {

	public static void main(String[] args) {
		// 2차원 배열 : [행index번호][열index번호]
		// 배열을 선언하면서 값을 넣을 때
		int[][] score2 = {
							 {1, 2, 3, 4, 5},   // [0] 행의 index번호
							 {6, 7, 8, 9, 0},	// [1]
							 {7, 6, 5, 4, 9}	// [2]
						 };
		//		열의 index번호 [0][1][2][3][4]
		
		System.out.println(score2[2][3]);  // 4출력
		System.out.println(score2[0][1]);	// 2출력
		
		for(int row=0; row<score2.length; row++) {
			for(int column=0; column<score2[row].length; column++) {
				System.out.print(score2[row][column] + " ");
			}
			System.out.println();
		}

		// 배열을 선언만 할 때
		int[][] score3 = new int[4][3];
		
		// 배열의 길이
		int[][] score = {
							 {1, 2, 3, 4, 5},
							 {6, 7, 8},	
							 {7, 6, 5, 4}	
						 };
		
		System.out.println("score의 행의 길이 : " + score.length);
		System.out.println("score[0]의 열의 길이 : " + score[0].length);
		System.out.println("score[1]의 열의 길이 : " + score[1].length);
		System.out.println("score[2]의 열의 길이 : " + score[2].length);
		
		for(int row=0; row<score.length; row++) {
			for(int column=0; column<score[row].length; column++) {
				System.out.print(score[row][column] + " ");
			}
			System.out.println();
		}
	}
}
