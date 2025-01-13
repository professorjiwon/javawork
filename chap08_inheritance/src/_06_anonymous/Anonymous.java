package _06_anonymous;
/*
  * 익명 클래스 : 이름이 없는 클래스
    			1번만 정의하여 사용할 때
*/
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

public class Anonymous {
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.method());
		
		Parent p2 = new Child() {
			int age = 25;
			@Override
			String method() {
				System.out.println("나이 : " + age);
				return "다 내꺼";
			}	
		};
		System.out.println(p2.method());
		
		Parent p3 = new Child();
		Parent p4 = new Parent();
		
		// 기존의 익명클래스 객체의 주소를 사용할 수는 있어도
		// 똑같은 익명클래스의 객체를 만들 수 없음.
		Parent p5 = p2;
		


	}
}
