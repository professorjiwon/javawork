package _04_overriding;
class Loading {
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}
class LoadingChild extends Loading {
	// 오버로딩 : 부모, 내자신의 메소드
	void show(int num) {
		System.out.println("자식클래스 메소드 : " + num);
	}
	void show(String str) {		// 부모하고는 오버라이딩
		System.out.println("자식클래스 메소드 : " + str);
	}
}
public class T02_로딩_라이딩비교_main {
	public static void main(String[] args) {
		LoadingChild lc = new LoadingChild();
		lc.show(7);
		lc.show("문자");
	}

}
