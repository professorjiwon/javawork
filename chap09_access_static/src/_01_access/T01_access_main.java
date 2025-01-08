package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		
		ac.num = 10;
		System.out.println(ac.num);
		
		System.out.println(ac.PI);
		// ac.PI = 8.6789;  상수라서 값 변경 안됨
		
		// ac.name = "김지원";  // private라서 접근불가
		// System.out.println(ac.name);  // private라서 접근불가
		ac.setName("김지원");
		System.out.println(ac.getName());

	}

}
