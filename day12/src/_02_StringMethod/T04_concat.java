package _02_StringMethod;

public class T04_concat {

	public static void main(String[] args) {
		// concat : 2개의 문자열을 연결하여 하나의 문자열로 반환
		String str1 = "혼자 공부하는 ";
		String conStr = str1.concat("React");
		System.out.println(conStr);
		
		System.out.println(str1.concat("Spring"));
	}
}
