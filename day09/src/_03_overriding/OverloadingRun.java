package _03_overriding;
class Loading {
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}
class LoadingChild extends Loading {
	// 오버로딩 : 매개변수의 자료형이 다름
	void show(int price) {
		System.out.println("자식클래스 메소드 : " + price);
	}
}
public class OverloadingRun {
	public static void main(String[] args) {
		LoadingChild lChild = new LoadingChild();
		lChild.show(25000);
		lChild.show("리액트");
	}
}
