package _02_StringMethod;

public class T10_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		// substring(index) : 문자열에서 index번호부터 끝까지 얻어옴
		System.out.println(str.substring(7)); 
		
		// substring(index,lastIndex) : 
		//			문자열에서 index번호부터 lastIndex번호(포함안함) 이전까지 얻어옴
		System.out.println(str.substring(7, 10));
	}
}
