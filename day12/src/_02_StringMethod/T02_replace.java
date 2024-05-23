package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {
		// replace : 글자 치환
		String str = "javaprogram java awsjava dajava";
		String newStr = str.replace('j', 'i');
		newStr = str.replace("j", "자바");
		
		System.out.println(str);
		System.out.println(newStr);
		System.out.println("------------------------");
		
		String str2 = "javaprogram jeava awsjava dajva";
		newStr = str2.replace("java", "자바");
		System.out.println(newStr);
		
		newStr = str2.replaceAll("java", "자바");
		System.out.println(newStr);
		
		// replaceFirst
		newStr = str.replaceFirst("java", "자바");
		System.out.println(newStr);
	}
}
