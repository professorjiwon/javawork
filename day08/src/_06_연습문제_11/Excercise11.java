package _06_연습문제_11;

class Math {
	int max(int[] intArray) {
		int max = intArray[0];
		for(int i=1; i<intArray.length; i++) {
			if(max < intArray[i]) 
				max = intArray[i];
		}
		return max;
	}
	
	int min(int[] intArray) {
		int min = intArray[0];
		for(int num : intArray) {
			if(min > num)
				min = num;
		}
		return min;
	}
}

public class Excercise11 {
	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13,3,21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최대값 : " + min);
	}
}
