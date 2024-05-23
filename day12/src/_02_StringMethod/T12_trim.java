package _02_StringMethod;

public class T12_trim {

	public static void main(String[] args) {
		// 문자의 맨앞과 맨뒤의 공백 제거
		String str = "     리액트   프로그램     ";
		System.out.print(str + ";\n");
		System.out.println(str.trim() + ";");
	}
}
