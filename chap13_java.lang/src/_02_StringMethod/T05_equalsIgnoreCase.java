package _02_StringMethod;

// equals : 대소문자 가림
// equalsIgnoreCase : 대소문자 안가림
public class T05_equalsIgnoreCase {

	public static void main(String[] args) {
		String str = "JAVA";
		
		System.out.println(str.equals("JAVA"));
		System.out.println(str.equals("java"));
		
		System.out.println(str.equalsIgnoreCase("java"));
	}
}
