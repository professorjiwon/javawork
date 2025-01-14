package _02_StringMethod;

// contains(String) : 문자열이 포함되어 있는지 boolean으로 반환

public class T03_contains {

	public static void main(String[] args) {
		String str = "java programming";
		boolean flag = str.contains("pro");
		
		if(flag) {
			System.out.println("프로입니다");
		} else {
			System.out.println("아마추어입니다");
		}
	}

}
