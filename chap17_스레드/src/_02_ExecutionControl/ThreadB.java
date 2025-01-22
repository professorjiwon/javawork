package _02_ExecutionControl;

public class ThreadB extends Thread{
	boolean stop = false;	// 스레드 종료시 사용
	boolean work = true;	// yield 메소드 호출한 시점을 알기위해 
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업하기");
			} else {
				Thread.yield();	// 작업을 하지 않을 때 다른스레드에게 양보
			}
		}
		System.out.println("ThreadB 종료");
	}
}
