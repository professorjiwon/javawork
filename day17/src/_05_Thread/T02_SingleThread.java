package _05_Thread;

import java.awt.Toolkit;

public class T02_SingleThread {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println(i);
			
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
		for(int i=10; i<15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
}
