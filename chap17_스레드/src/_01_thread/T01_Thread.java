package _01_thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		setName("첫번째 스레드");  // 스레이드 이름 변경
		for(int i=1; i<=5; i++) {
			System.out.println(getName());  // 조상인 Thread의 이름 호출
		}
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		// setName() : Thread클래스에 있는 메소드. setName("두번째 스레드") 안됨
		// currentThread() : 현재 실행되고 있는 스레드 얻어오기
		Thread.currentThread().setName("두번째 스레드");
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class T01_Thread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		
		
		Runnable r = new Thread2();
		Thread t2 = new Thread(r);  // 생성자 : Thread(Runnable r)
		
		// new Thread2()객체가 Runnable인 부모타입으로 자동형변환이 되었기 때문
		Thread t3 = new Thread(new Thread2());

		t2.start();
		t1.start();  // t1스레드 실행
	}
}