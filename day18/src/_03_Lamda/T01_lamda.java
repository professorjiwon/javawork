package _03_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		MyMethod mm;
		
		mm = (x, y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(mm.method(3, 5));
		
		mm = (x, y) -> {
			return x+y;
		};
		System.out.println(mm.method(5, 9));
		
		mm = (x, y) -> x+y;
		System.out.println(mm.method(3, 7));
		
		
		mm = (x, y) -> sum(x,y);
		/*
		mm = new MyMethod() {
			@Override
			public int method(int x, int y) {
				int result = sum(x, y);
				return result;
			}
		};
		*/
	}
	static int sum(int x, int y) {
		return x+y;
	}

}
