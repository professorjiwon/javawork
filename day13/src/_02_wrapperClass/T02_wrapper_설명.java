package _02_wrapperClass;

public class T02_wrapper_설명 {

	public static void main(String[] args) {
		/*
		 * valueOf() : Integer객체에서 int형 값을 뽑아내는 메소드
		               Integer -> 언박싱 -> int 변환
		   - 언박싱(unboxing) : 참조자료형 -> 기본자료형 변환
		   - 박싱(boxing) : 기본자료형 -> 참조자료형으로 변환
		 */
		
		// autoUnboxing
		Integer num = Integer.valueOf(100);
		int num1 = num;
		
		Character ch = 'z';
		char c = ch;
		
		int num2 = Integer.parseInt("100");
		Integer num3 = Integer.valueOf("100");
		
		// boxing
		int num4 = 10;
		Integer num5 = Integer.valueOf(num4);
		
		String str = "10";
		Integer num6 = Integer.valueOf(str);
		
		double b = 1.3;
		Double d = Double.valueOf(b);
	}

}
