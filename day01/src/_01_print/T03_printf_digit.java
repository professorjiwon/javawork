package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n", 3200);
		System.out.println("--------------------");
		
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 320000);
		System.out.printf("%07d\n", 3200);
		System.out.println("--------------------");
		
		System.out.printf("[%10s]\n", "abcdefg");
		System.out.printf("[%-10s]\n", "abcdefg");
		System.out.printf("[%s]\n", "abcdefg");
		System.out.println("--------------------");
		
		System.out.printf("%6.2f\n", 13.456);
		System.out.printf("%.3f\n", 26237.74837445);
		
		System.out.format("%.3f", 26237.74837445);
	}
	

}
