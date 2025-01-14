package _02_StringMethod;
// 오버로딩 되어있음. 찾는 문자(문자열)가 없으면 -1반환
/*
 * indexOf() : 앞에서부터 살펴봄
	indexOf(char) : 글자의 index번호 반환
	indexOf(char, fromIndex) : fromIndex번호부터 글자가 있나 확인후 index번호 반환
	indexOf(String) : 문자열의 시작 index번호 반환
	indexOf(String, fromIndex) : fromIndex번호부터 문자열이 있나 확인후 index번호 반환
	
 * lastIndexOf() : 뒤에서부터 살펴봄
    lastIndexOf(char) : 뒤에서 부터 글자의 index번호 반환
	lastIndexOf(char, fromIndex) : fromIndex번호부터 앞으로 가면서 글자가 있나 확인후 index번호 반환
	lastIndexOf(String) : 뒤에서 부터 문자열의 시작 index번호 반환
	lastIndexOf(String, fromIndex) : fromIndex번호부터 앞으로 가면서 문자열이 있나 확인후 index번호 반환
	
*/
public class T06_indexOf {

	public static void main(String[] args) {
		String str = "java programming vaja";
		int index = str.indexOf('a');
		System.out.println("a의 index번호 : " + index);
		index = str.indexOf('a', 5);
		System.out.println("5번 index 이후에 나오는 a의 index번호 : " + index);
		
		index = str.indexOf("gra");
		System.out.println("gra의 index번호 : " + index);
		index = str.indexOf("va", 5);
		System.out.println("va의 index번호 : " + index);
		
		if(str.indexOf("java") < 0)
			System.out.println("자바 프로그램이 아닙니다");
		else
			System.out.println("자바 프로그램입니다");
		
		System.out.println("-----------------------------------------");
		
		System.out.println(str.lastIndexOf('j'));
		System.out.println(str.lastIndexOf("va"));
		System.out.println(str.lastIndexOf('g',10));
		System.out.println(str.lastIndexOf("va",10));
	}
}
