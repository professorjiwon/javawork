package _02_StringMethod;
// charAt(index) : index 번호에 해당하는 문자1개 반환

public class T01_charAt {
	public static void main(String[] args) {
		String sn = "980203-3728394";
		char s = sn.charAt(7);
		
		switch(s) {
			case '1': case '3':
				System.out.println("남자");
				break;
			case '2': case '4':
				System.out.println("여자");
		}

	}

}
