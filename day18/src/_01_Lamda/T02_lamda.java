package _01_Lamda;

public class T02_lamda {

	public static void main(String[] args) {
		MyOneArgs02 mo = new MyOneArgs02() {
			@Override
			public void method(int x) {
				int result = x * 2;
				System.out.println(result);	
			}
		};
		mo.method(4);
		
		mo = (x) -> {
			int result = x * 3;
			System.out.println(result);
		};
		mo.method(4);
		
		mo = (x) -> System.out.println(x * 4);
		mo.method(4);
		
		mo = x -> System.out.println(x * 4);
		mo.method(4);
		

	}

}
