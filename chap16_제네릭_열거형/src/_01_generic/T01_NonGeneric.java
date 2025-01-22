package _01_generic;
class Box5 {
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Apple5 {
	int num = 10;
}

class Banana {
	boolean bool = true;
}

public class T01_NonGeneric {
	public static void main(String[] args) {

		Box5 box = new Box5();
		box.setObj("홍길동");
		Object obj = box.getObj();
		System.out.println(obj);  // String클래스는 toString을 오버라이딩 해놓은 상태
		
		box.setObj(new Apple5());
		Apple5 obj2 = (Apple5)box.getObj();
		System.out.println(obj2.num);
		
		box.setObj(new Banana());
		Banana b = (Banana)box.getObj();
		System.out.println(b.bool);
		
	}
}
