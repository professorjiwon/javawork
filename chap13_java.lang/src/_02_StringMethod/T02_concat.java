package _02_StringMethod;

// concat(String) : 2개의 문자열을 연결하여 하나의 문자열로 반환

public class T02_concat {
	public static void main(String[] args) {
		String str = "JAVA";
		
		String strCon = str.concat(" 화이팅!!!");
		System.out.println(strCon);
		
		System.out.println(str.concat(" 화이팅!!!"));
	}
}
