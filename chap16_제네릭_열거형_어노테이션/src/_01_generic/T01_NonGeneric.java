package _01_generic;
/*
class Box {
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Apple {
	int num = 10;
}

class Banana {
	boolean bool = true;
}
public class T01_NonGeneric {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("홍길동");
		Object obj = box.getObj();
		System.out.println(obj);  // String클래스는 toString을 오버라이딩 해놓은 상태
		
		box.setObj(new Apple());
		Apple obj2 = (Apple)box.getObj();
		System.out.println(obj2.num);
		
		box.setObj(new Banana());
		Banana b = (Banana)box.getObj();
		System.out.println(b.bool);
	}
}
*/