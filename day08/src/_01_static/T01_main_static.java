package _01_static;

public class T01_main_static {
	int a;
	static int b;
	
	public static void main(String[] args) {
		int c;
		// System.out.println(a); 인스턴스변수는 반드시 객체를 생성해야만 사용가능
		// System.out.println(c); 지역변수를 초기화하지 않고 출력했기 때문
		
		// 클래스 변수, 클래스 메소드는 객체 생성 하지 않아도 사용가능
		System.out.println(b);
		System.out.println(T01_api_static.nameSt);
		System.out.println(T01_api_static.sMe4());
		System.out.println("----------------------------");
		
		// 인스턴스 변수, 인스턴스 메소드는 반드시 객체를 생성해야 사용가능
		T01_api_static s1= new T01_api_static();
		System.out.println(s1.nameIn);
		System.out.println(s1.me2());
		// 객체에서도 클래스 변수, 클래스 메소드도 사용가능
		System.out.println(s1.numSt);
		System.out.println(s1.sMe4());	
	}
}




