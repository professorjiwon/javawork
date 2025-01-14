package _02_userException;
// 사용자 정의 예외 클래스는 반드시 Exception 상속받아 사용

public class UserException extends Exception{
	UserException() { }
	UserException(String message) {
		super(message);
	}
}
