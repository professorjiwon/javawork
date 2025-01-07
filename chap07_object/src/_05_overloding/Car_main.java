package _05_overloding;

public class Car_main {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.add()); 
		
		System.out.println(car1.add(8));
		
		System.out.println(car1.add(5, 7));
		
		System.out.println(car1.add("홍길동"));
		
		System.out.println(car1.add(5, 4.567));
		
		

	}

}
