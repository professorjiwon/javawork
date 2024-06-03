package _05_Thread;
class SumThread extends Thread {
	private int sum;
	public int getSum() {
		return sum;
	}
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			sum += i;
		}
		System.out.println("종료");
	}
}
public class T10_joinThread {
	public static void main(String[] args) {
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~1000까지 합 : " + sumT.getSum());
	}
}
