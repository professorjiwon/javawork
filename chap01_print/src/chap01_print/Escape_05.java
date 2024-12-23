package chap01_print;

public class Escape_05 {

	public static void main(String[] args) {
		// 이스케이프 문자(escape sequence)
		/*
		 * 문자조합으로 특수 기능을 수행(\와 함께 사용)
		   \n : 줄바꿈
		   \t : 탭만큼 띄우기
		   \" : 쌍따옴표 표시
		   \\ : 역슬래스(\) 표시 
		 */
		System.out.print("더조은 학원\n수강중\n");
		System.out.print("801호\t수업중\n");
		System.out.print("인포에서 얘기했습니다. \"결석은 안됩니다.\"라고 했습니다\n");
		System.out.print("java책 \\ 김지원저");
	}
}