package _02_ExecutionControl;

public class T01_Yield_main {
	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		
		// 0.5초 동안 A,B 번갈아가면서 작업
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thA.work = false;  // 0.5초 후에는 B작업만
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thA.work = true;	// 0.5초 후에는A,B 번갈아가면서 작업
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thA.stop = true;
		thB.stop = true;
	}
}
