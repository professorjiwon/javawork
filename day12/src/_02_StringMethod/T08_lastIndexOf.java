package _02_StringMethod;

public class T08_lastIndexOf {

	public static void main(String[] args) {	
		String str = "abcabcabca";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("abc"));
		
		// lastIndexOf(String, fromIndex)
		// formIndex는 index 앞을 보고, 문자열 걸쳐져 있으면 그 문자열도 찾는다
		System.out.println(str.lastIndexOf("abc", 6));
		System.out.println(str.lastIndexOf("abc", 4));
		System.out.println(str.lastIndexOf("abc", 5));
	}
}
