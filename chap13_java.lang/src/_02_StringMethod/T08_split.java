package _02_StringMethod;

import java.util.Arrays;

// split(기준문자) : 기준문자를 기준으로 문자열을 나누어서 배열로 반환
public class T08_split {

	public static void main(String[] args) {
		String names = "홍길동-아무개-이순신-강감찬";
		String[] name = names.split("-");
		System.out.println(Arrays.toString(name));
		/*for(String n : name) {
			System.out.println(n);
		}*/
		
		// 정규표현식에서 | 는 or를 의미
		String names2 = "홍길동-아무개/이순신,강감찬@김한솥";	
		String[] name2 = names2.split("-|/|,|@");
		System.out.println(Arrays.toString(name2));;
	}
}
