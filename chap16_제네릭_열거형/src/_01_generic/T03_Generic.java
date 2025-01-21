package _01_generic;

import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit"; }}	
class Apple extends Fruit {public String toString() {return "Apple"; }}
class Grape extends Fruit {public String toString() {return "Grape"; }}
class Tjoeun {public String toString() {return "Tjoeun"; }}
class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {list.add(item);}
	T get(int index) {return list.get(index);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

public class T03_Generic {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Tjoeun> tjoeunBox = new Box<>();
		
		fruitBox.add(new Fruit());  // 자신의 타입 넣음
		fruitBox.add(new Apple());	// 자식 타입이 부모타입으로 자동형변환이 되어 넣음
		fruitBox.add(new Grape());
		// fruitBox.add(new Tjoeun());  // 오류 : 타입이 맞지 않음
		
		appleBox.add(new Apple());	// Apple만 넣을 수 있다
		appleBox.add(new Apple());
		// appleBox.add(new Fruit());	// 오류 : 타입이 맞지 않음
		
		tjoeunBox.add(new Tjoeun()); // Tjoeun만 넣을 수 있다
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);
	}
}