package _02_ExecutionControl;

public class T02_Join_main {

	public static void main(String[] args) {
		SumThread sumTh = new SumThread();
		sumTh.start();
		
		try {
			sumTh.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지 합 : " + sumTh.getSum());
	}
}
