package _02_exception;

public class T12_throw {

	public static void main(String[] args) {
		// throw : 강제로 예외발생 시킬때
		// throws : 메소드를 호출하여 사용할 때 발생할 수 있는 예외를 명시해 두고
		//			그 메소드를 사용할 때에 예외에 대한 대비를 반드시 해줘야 함
		try {
			Exception e = new Exception("강제로 예외발생 시킴");
			throw e;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}
