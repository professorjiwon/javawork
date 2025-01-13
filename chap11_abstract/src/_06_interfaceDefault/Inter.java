package _06_interfaceDefault;
/*
 * default, static 메소드
   - JDK 8버전부터 추가된 메소드
   - 단점을 보완하기 위해 만들어짐
     : interface를 만들어서 implements한 클래스가 여러개였을 때
     나중에 interface에 추상메서드를 추가하면 implements한 모든 클래스에서
     추상메서드를 모두 구현해야 하는 단점 발생.
     
   * default 메소드 : 구현부가 있다
     - 오버라이딩이 필요하면 해도 되고, 안해도 됨 
   * static 메소드 : 구현부가 있다
     - 오버라이딩을 할 수 없다
 */
interface Inter1 {
	int method1();
	static String stMe() {
		return "static 메소드";
	}
}
interface Inter2 {
	int method2();
	default String me2() {
		return "default 메소드2";
	}
}

public interface Inter extends Inter1, Inter2 {
	int method();
	default String me() {  		// public 생략 가능
		return "default 메소드";
	}
}
