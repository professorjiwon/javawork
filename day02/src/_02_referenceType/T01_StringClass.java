package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println("주소가 같은가? " + (name == hobby));
		
		String str1 = "의료용";
		String str2 = "의료용";
		System.out.println("주소가 같은가? " + (str1 == str2));
		
		String myName = "홍길동";
		System.out.println("주소가 같은가? " + (name == myName));
		
		String str3 = new String("영상");
		String str4 = new String("영상");
		System.out.println("주소가 같은가? " + (str3 == str4));
		
		System.out.println("값이 같은가? " + str3.equals(str4));
	}
}
