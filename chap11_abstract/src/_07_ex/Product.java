package _07_ex;

public interface Product {
	void power();
	int volume(int volume);
	
	static void aiSpeak(String str) {
		System.out.println(str);
	}
	
	default void search(String search) {
		System.out.println(search);
	}
}
