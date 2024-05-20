package _04_super;

class Parent {
	int x = 10;
}
class Child extends Parent{
	int x = 20;
	void show() {
		int x = 30;
		System.out.println("x=" + x); // 지역변수 -> 인스턴스 변수 -> 부모 변수
		System.out.println("this.x=" + this.x);	// 인스턴스 변수 -> 부모 변수
		System.out.println("super.x=" + super.x);  // 부모변수
	}
}
public class T01_SuperRun {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}
}
