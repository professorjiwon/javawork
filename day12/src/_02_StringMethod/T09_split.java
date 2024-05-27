package _02_StringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		String text = "홍길동-아무개-이순신-강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));
		System.out.println(name[1]);
		
		String text2 = "홍길동-아무개/이순신,강감찬@이고잉";
		String[] name2 = text2.split("-|/|,|@");
		System.out.println(Arrays.toString(name2));
		
		// split(분리문자열, 배열의 갯수)
		String[] name3 = text.split("-", 2);
		System.out.println(Arrays.toString(name3));
	}
}
