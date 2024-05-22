package _01_anonymous;

class Parent {
	String method() {
		return "부모의 재산";
	}
}
class Child extends Parent {
	@Override
	String method() {
		return "자식의 재산";
	}
}

public class TestMain {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.method());
		
		// 익명 클래스 : 재사용할 필요가 없을 때 1번만 정의하여 사용
		//				1번만 사용하는데 클래스를 만드는것은 비효율적임
		Parent p2 = new Child() {
			int age = 25;
			@Override
			String method() {
				System.out.println(age);
				return "다 내꺼";
			}
		};
		System.out.println(p2.method());
	}
}
