package _01_StringBuffer_Builder;

public class T02_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb);
		
		sb.insert(4, "2");
		System.out.println(sb);
		
		sb.setCharAt(4, '7');
		System.out.println(sb);
		/*
		 * String(불변성) : 한번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
		 				   변하지 않는 문자열을 사용할 때(혹은 변경이 별로 없는 문자열일 때)
		 				   	
		 * StringBuffer : 추가, 삭제, 수정을 할수 있다. 동기화를 지원
		 				  자주 변경되는 문자열을 사용할 때, 멀티스레드 일 때 사용
		 				  
		 * StringBuilder : 추가, 삭제, 수정을 할수 있다. 동기화를 지원하지 않음
		 				  자주 변경되는 문자열을 사용할 때, 단일스레일 일 때 사용
		 				  StringBuffer보다 빠름
		 */
	}
}
