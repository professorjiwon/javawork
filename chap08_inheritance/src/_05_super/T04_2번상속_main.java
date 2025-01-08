package _05_super;
class Parent4 {
	int x;
	int z;
	Parent4() {
		System.out.println("부모생성자 호출");
		x=10;
		z=10;
	}
}
class Child4 extends Parent4 {
	int x;
	int y;
	Child4() {
		System.out.println("자식생성자 호출");
		x = 10*10;
		y = 20*20;
	}
	
}
class GrandChild extends Child4 {
	int x;
	GrandChild() {
		System.out.println("손자생성자 호출");
		x = 10*10*10;
	}
}
public class T04_2번상속_main {

	public static void main(String[] args) {
		GrandChild gh = new GrandChild();
		System.out.println(gh.x);
		// System.out.println(gh.super.x);// super는 상속받은 곳에서만 사용가능
		System.out.println(gh.y);
		System.out.println(gh.z);
	}
}