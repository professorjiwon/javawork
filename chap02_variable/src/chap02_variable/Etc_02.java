package chap02_variable;

public class Etc_02 {

	public static void main(String[] args) {
		double pi = 3.14;
		char ch = 'A';		// char은 1글자만 넣을 수 있음. 반드시 외따옴표로
		String str = "abcdf";
		boolean bool = false;
		
		String str2 = "";	// String은 문자를 안넣어도 되고, 한글자만 넣어도됨
		char ch2 = ' '; // spacebar의 유니코드가 들어감.  '' -> 아무것도 안넣으면 오류
		
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
	}
}
