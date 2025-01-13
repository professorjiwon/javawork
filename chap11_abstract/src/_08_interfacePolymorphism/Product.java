package _08_interfacePolymorphism;

public interface Product {
	/* public abstract */ void power();
	/* public abstract */ int volume(int volume);
	
	static void aiSpeak(String str) {
		System.out.println(str);
	}
	
	default void search(String search) {
		System.out.println(search);
	}
}
