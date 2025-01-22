package _02_ExecutionControl;

public class T03_Bank_main {

	public static void main(String[] args) {
		Runnable r = new ThreadBank();
		/*
		Thread th = new Thread(r);
		
		Thread th2 = new Thread(r);
		Thread th3 = new Thread(r);
		
		th2.start();
		th3.start();
		*/
		new Thread(r).start();
		new Thread(r).start();
	}
}
