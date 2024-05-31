package _05_Thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		setName("my쓰레드");
		for(int i=0; i<500; i++) {
			System.out.println(getName());
		}
	}
}
class Thread2 implements Runnable {
	@Override
	public void run() {
		Thread.currentThread().setName("imple쓰레드");
		for(int i=1000; i<1500; i++) {
			System.out.println(i);
		}
	}
}
public class T01_Thread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());
		
		t1.start();
		t2.start();
	}
}
