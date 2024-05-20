package _04_super;

class Parent3 {
	int x;
	int z;
	Parent3() {
		System.out.println("부모생성자 호출");
		x = 10;
		z = 10;
	}
}
class Child3 extends Parent3{
	int x;
	int y;
	Child3() {
		System.out.println("자식생성자 호출");
		x = 10*10;
		y = 10*10;
	}
}
class GrandChild extends Child3{
	int x;
	GrandChild() {
		System.out.println("손자생성자 호출");
		x = 10*10*10;
	}
}
public class T03_SuperRun {
	public static void main(String[] args) {
		GrandChild child = new GrandChild();
		System.out.println(child.x);
		// System.out.println(child.super.x);  super는 상속받은 곳에서만 사용
		System.out.println(child.y);
		System.out.println(child.z);
	}
}
