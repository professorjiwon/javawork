package _01_thread;

class Thread3 extends Thread {
	public void run() {
		for(int i=0; i< 300; i++) {
			System.out.print("-");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class Thread4 extends Thread {
	public void run() {
		for(int i=0; i< 300; i++) {
			System.out.print("+");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

public class T06_Priority {

	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		System.out.println("우선순위가 가장 높은 값 : " + Thread.MAX_PRIORITY);    // 10 : 우선순위가 가장 높음
		System.out.println("우선순위가 가장 낮은 값 : " + Thread.MIN_PRIORITY);	// 1 : 우선순위가 가장 낮음
		System.out.println("우선순위 default값 : " + Thread.NORM_PRIORITY);	// 5 : default값
		System.out.println("");
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(1);
		System.out.println("우선순위(-) : " + t3.getPriority());
		System.out.println("우선순위(+) : " + t4.getPriority());
		
		t3.start();
		t4.start();
	}
}