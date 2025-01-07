package _02_method;

public class T01_main {

	public static void main(String[] args) {
		T01_api_method m1 = new T01_api_method();
		m1.print1();
		
		System.out.println();
		
		System.out.println(m1.print2());
		int result = m1.print2();
		System.out.println(result);
		
		System.out.println(m1.print3());
		
		System.out.println(m1.print4());
		
		m1.print5(8);
		
		int sum = m1.print6(3, 10);
		System.out.println(sum);
		
		System.out.println(m1.print6(10, 100));
		
		m1.print7("더조은", 100);
		
		System.out.println("===============");
		
		T01_api_op op = new T01_api_op();
		System.out.println(op.add(5, 7));
		System.out.println(op.add(17283, 483948));
		
		int result2 = op.minus(987, 45);
		System.out.println(result2);
		
		System.out.println(op.multiply(5, 7));
		
		System.out.println(op.remainder(7, 5));
		
		System.out.printf("%.1f", op.divide(7, 3));
	}
}
