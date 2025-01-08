package _02_static;

public class T01_static_main {

	public static void main(String[] args) {
		T01_static ts1 = new T01_static();
		ts1.num = 10;
		ts1.numSt = 100;
		System.out.println(ts1.num);
		System.out.println(ts1.numSt);
		ts1.printIn();
		ts1.printSt();
		
		T01_static ts2 = new T01_static();
		System.out.println(ts2.num);
		System.out.println(ts2.numSt);
		ts2.printIn();
		ts2.printSt();
			
		// 정적 필드는 객체를 생성하지 않고도 사용가능
		System.out.println(T01_static.numSt);
		System.out.println(T01_static.nameSt);
		T01_static.printSt();
	}
}