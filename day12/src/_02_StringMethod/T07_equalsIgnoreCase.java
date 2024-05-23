package _02_StringMethod;

public class T07_equalsIgnoreCase {

	public static void main(String[] args) {
		String str = "hello";
		
		// equals : 대소문자를 가림
		System.out.println(str.equals("Hello"));
		// equalsIgnoreCase : 대소문자를 가리지 않음
		System.out.println(str.equalsIgnoreCase("Hello"));

	}

}
