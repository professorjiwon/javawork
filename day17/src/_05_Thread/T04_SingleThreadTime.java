package _05_Thread;

public class T04_SingleThreadTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<500; i++) {
			System.out.println("&");
		}
		System.out.println();
		System.out.println("소요시간 : " + (System.currentTimeMillis()-startTime));
		
		for(int i=0; i<500; i++) {
			System.out.println("#");
		}
		System.out.println();
		System.out.println("총 소요시간 : " + (System.currentTimeMillis()-startTime));
	}

}
