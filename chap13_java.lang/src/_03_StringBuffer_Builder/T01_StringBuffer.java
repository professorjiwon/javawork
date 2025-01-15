package _03_StringBuffer_Builder;
/*
 * String(불변성) : 한번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
 					변하지 않는 문자열을 사용할 때
 					
 * StringBuffer : 추가, 삭제, 수정할 수 있다. 동기화를 지원
 					자주 변경되는 문자열을 사용할 때, 멀티스레드 사용시
 					
 * StirngBuilder : 추가, 삭제, 수정할 수 있다.
 					자주 변경되는 문자열을 사용할 때, 단일스레드 사용시
 					StringBuffer보다 빠르다
 										
 # StringBuffer와 StirngBuilder 메서드
   - append() : 문자열을 맨 뒤에 추가
   - insert() : 지정된 위치에 문자열을 삽입
   - delete() : 특정 범위의 문자열을 삭제
   - reverse() : 문자열을 반대로
 */
public class T01_StringBuffer {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		// equals()는 오버라이딩 되어있지 않음
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		System.out.println();
		
		// toSting()은 오버라이딩이 되어 있음
		System.out.println("sb1 = " + sb1);
		sb1.append("def");
		
		// append()
		System.out.println("def를 추가한 후 : " + sb1);
		sb1.append(true);
		System.out.println("true를 추가한 후 : " + sb1);
		System.out.println("----------------------------------------");
		
		// delete()
		sb1.delete(3, 6);
		System.out.println("(index)3~5번까지 삭제한 후 : " + sb1);
		sb1.deleteCharAt(1);
		System.out.println("(index)1번 삭제한 후 : " + sb1);
		// index위치부터 끝까지 삭제
		sb1.delete(3, sb1.length());
		System.out.println("(index)3번부터 삭제한 후 : " + sb1);
		System.out.println("----------------------------------------");
		
		// insert(얼마큼떨어져서, 문자열)
		sb1.insert(1, "java");
		System.out.println("1글자 뒤에 java 삽입 : " + sb1);
		sb1.insert(5, "김");
		System.out.println("5글자 뒤에 김 삽입 : " + sb1);
		System.out.println("----------------------------------------");
		
		// replace()
		sb1.replace(5, sb1.length(),"pro");
		System.out.println("index5번부터 끝까지를 pro대체 : " + sb1);
		System.out.println("sb1의 글자를 반대로 : " + sb1.reverse());
		System.out.println("----------------------------------------");
		
		// capacity() : StringBuffer의 크기
		//				객체가 생성될때 기본버퍼의 크기는 16Byte + 문자크기
		StringBuffer sb3 = new StringBuffer();
		System.out.println("sb3 버퍼의 크기 : " + sb3.capacity());
		
		StringBuffer sb4 = new StringBuffer("a");
		System.out.println("sb4 버퍼의 크기 : " + sb4.capacity());
		
		StringBuffer sb5 = new StringBuffer("김");
		System.out.println("sb5 버퍼의 크기 : " + sb5.capacity());
		System.out.println("----------------------------------------");
		
		// 버퍼의 크기 지정
		StringBuffer sb6 = new StringBuffer(32);
		System.out.println("sb6 버퍼의 크기 : " + sb6.capacity());
	}
}
