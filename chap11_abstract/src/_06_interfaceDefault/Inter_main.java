package _06_interfaceDefault;

public class Inter_main {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		
		System.out.println(ic.method());
		System.out.println(ic.method1());
		System.out.println(ic.method2());
		System.out.println("오버라이딩 안한 me() : " + ic.me());
		System.out.println("오버라이딩 안한 me2() : " + ic.me2());
		
		InterClass2 ic2 = new InterClass2();
		System.out.println("오버라이딩 한 me() : " + ic2.me());
		System.out.println("오버라이딩 한 me2() : " +ic2.me2());
	}
}
