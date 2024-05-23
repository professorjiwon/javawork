package _02_StringMethod;

public class T06_startsWith_endsWith {

	public static void main(String[] args) {
		// startsWith : 맨 앞에 문자로 시작하는지
		String starts = "springjavahtmlsql";
		System.out.println(starts.startsWith("java"));
			
		// endsWith : 맨 끝에 문자가 포함되어 있는지
		String[] str = {"img.png","abc.java","ddd.txt"};
		
		for(int i=0; i<str.length; i++) {
			if(str[i].endsWith("png"))
				System.out.println(str[i] + "는 그림 파일");
			else
				System.out.println(str[i] + "는 그림 파일이 아님");
		}
	}
}