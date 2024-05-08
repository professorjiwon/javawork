package _01_casting;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1;
		
		int int1 = b1;
		int1 = s1;
		
		char ch1 = '김';
		int inch = ch1;
		System.out.println("'김'의 유니코드 : " + inch);
		System.out.println(ch1);
		
		double d1 = int1;  
		System.out.println(d1);
		d1 = s1+1;
		System.out.println(d1);
		d1 = b1+2;
		System.out.println(d1);
	}
}
