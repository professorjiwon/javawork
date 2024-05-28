package _01_StringBuffer_Builder;

public class T01_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		// equals()를 오버라이딩하지 않음(주소가 같은가?)
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		System.out.println();
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));
		System.out.println("--------------------------------------");
		
		// toString()은 오버라이딩 되어 있음(문자열 반환)
		System.out.println("sb1=" + sb1);
		sb1.append("def");
		System.out.println("sb1=" + sb1);
		sb1.append(123);
		System.out.println("sb1=" + sb1);
		sb1.append(true);
		System.out.println("sb1=" + sb1);
		System.out.println("--------------------------------------");
		
		sb1.deleteCharAt(8);
		System.out.println("sb1=" + sb1);
		sb1.delete(6, 12);
		System.out.println("sb1=" + sb1);
		System.out.println("--------------------------------------");
		
		// insert(얼마큼떨어뜨려서(offset), 문자열)
		sb1.insert(1, "java");
		System.out.println("sb1=" + sb1);
		System.out.println("--------------------------------------");
		
		sb1.replace(5, sb1.length(), " spring");
		System.out.println("sb1=" + sb1);
		System.out.println("sb1.reverse = " + sb1.reverse());
		System.out.println("--------------------------------------");
		
		// capacity() : StringBuffer의 객체가 생성될때 기본 버퍼의 크기는 16Byte+문자크기
		StringBuffer sb5 = new StringBuffer();
		StringBuffer sb6 = new StringBuffer("a");
		System.out.println("sb5의 버퍼크기 : " + sb5.capacity());
		System.out.println("sb6의 버퍼크기 : " + sb6.capacity());
		
		// 버퍼의 크기 지정가능
		StringBuffer sb7 = new StringBuffer(32);
		System.out.println("sb7의 버퍼크기 : " + sb7.capacity());
	}
}