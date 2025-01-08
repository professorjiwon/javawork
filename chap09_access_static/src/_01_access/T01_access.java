package _01_access;

public class T01_access {
	int num = 5;	// 같은 패키지 안에서 접근 가능
	final double PI = 3.14;	// 상수(변수명을 대문자)
	private String name = "홍길동";	// 이 클래스 에서만 접근가능. 다른 클래스 에서는 접근 불가
	
	/*
	 * setter, getter 메서드
	   : 변수 앞에 private에 접근 할 수 있도록 메서드 정의
	   - setter 메소드 : private가 붙은 변수에 값을 넣을 때
	     반환형 set변수명(자료형 변수명) { 
	     	this.변수명 = 변수명
	     }
	   - getter 메소드 : private가 붙은 변수의 값을 리턴
	     반환형 get변수명() {
	     	return 변수명;
	     }
	*/

	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	/*
	 * final : 마지막
	   final 변수 -> 상수
	   final 메서드 -> 오버라이딩 불가
	   final 클래스 -> 상속 불가
	 */
}
