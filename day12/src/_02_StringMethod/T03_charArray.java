package _02_StringMethod;

public class T03_charArray {

	public static void main(String[] args) {
		String str = new String("혼자 공부하는 SQL");
		
		char[] chArray = {'혼','자','J','S','P'};
		String str2 = new String(chArray);
		
		System.out.println(str2);
		
		char ch = str.charAt(3);
		System.out.println(ch);
	}
}
