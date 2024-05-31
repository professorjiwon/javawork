package _01_generics;
class Delivery<T> {
	private T t;
	void set(T t) {
		this.t = t;
	}
	T get() {
		return t;
	}
}
class Gmarket<T> {  }

public class T02_Generic {
	public static void main(String[] args) {
		Delivery<String> del = new Delivery<>();
		del.set("program");
		String str = del.get();
		
		Delivery<Integer> del2 = new Delivery<>();
		del2.set(7);
		int value = del2.get();
		
		Delivery<Gmarket> del3 = new Delivery<>();
		del3.set(new Gmarket());
		Gmarket g = del3.get();
		
		/*Delivery<Gmarket> del4 = new Delivery<>();
		del4.set(new String());
		Gmarket g1 = del4.get();*/
	}
}



