package _01_array;

public class T02_2차원배열 {

	public static void main(String[] args) {
		// 2차원 배열 : [행의index][열의index]
		int[][] score = {
						 { 1, 2, 3, 4, 5},	// [0]
						 { 6, 7, 8, 9,10},	// [1]
						 {11,12,13,14,15}	// [2]
					    //[0][1][2][3][4]
						};
		
		System.out.println(score[0][2]);  //3
		System.out.println(score[2][3]);  // 14
		
		System.out.println("행의 길이 : " + score.length);
		System.out.println("score[0]의 길이(열길이) : " + score[0].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();
		}
		
		int count = 1;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = count;
				System.out.print(score[i][j] + ", ");
				count += 2;
			}
			System.out.println();
		}
		
		int[][] iArr = {{1,2,3},
						{4,5},
						{6,7,8,9}};
		
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.print(iArr[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
