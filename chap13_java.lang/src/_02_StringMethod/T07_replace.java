package _02_StringMethod;

// replace(기존문자,바꿀문자) : 기존문자를 바꿀문자로 바꾸기
// replaceAll(기존문자,바꿀문자) : 기존문자를 바꿀문자로 바꾸기(정규표현식 때)
// replaceFirst(기존문자,바꿀문자) : 맨처음 나오는 문자열만 바꿀문자로 바꾸기

public class T07_replace {

	public static void main(String[] args) {
		String str = "javaprogramming java awsjava dajava";
		
		String reStr = str.replace("m", "abc");
		System.out.println(reStr);
		
		String str2 = "javapro jeava awsjava dajva";
		System.out.println(str2.replace("java", "자바"));
		System.out.println(str2.replaceAll("java", "자바"));
		System.out.println(str2.replaceFirst("java", "자바"));
	}

}
