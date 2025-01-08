package _05_super;
class Parent3 {
	void show() {
		System.out.println("부모클래스 메소드");
	}
}
class Child3 extends Parent3 {
	void show() {
		System.out.println("자식 클래스 메소드");
	}
	void display() {
		show();
		super.show();
	}
}
public class T03_superMethod_main {
	public static void main(String[] args) {
		Child3 child = new Child3();
		child.show();
		child.display();

	}

}
