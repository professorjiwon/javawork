package _02_ExecutionControl;

public class SumThread extends Thread{
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	public void run() {
		for(int i=1; i<=1000; i++) {
			sum += i;
		}
		System.out.println("종료");
	}
}
