package _02_StringMethod;

public class T05_contains {

	public static void main(String[] args) {
		// contains : 문자열 안에 찾고하는 문자열이 포함되어 있는지 검사
		String str = "HTML 프로그래밍";
		
		boolean result = str.contains("java");
		System.out.println(result);
		
		if(str.contains("HTML"))
			System.out.println("웹 페이지를 만드는 프로그램");
		else
			System.out.println("기타 프로그램");
	}

}
