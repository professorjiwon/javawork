package _02_variable;

public class T04_String {

	public static void main(String[] args) {
		String str1 = "801호";
		String str2 = "의료용 디지털 영상 표준활용";
		System.out.println(str1 + " " + str2);
		
		// escape sequence(이스케이프 문자)
		/*
		 \ + 문자 조합으로 특수 기능 수행
		 \n : 줄바꿈
		 \t : 탭만큼 띄우기
		 \" : 쌍따옴표 출력
		 \\ : 역슬래시(\) 출력
		*/
		System.out.println("강의실 : 801호\n강좌명 : \"의료용 디지털 영상 표준활용\" ");
		System.out.println("강의실 : 801호\t강좌명 : 의료용 디지털 영상 표준활용");

		/*
		 * 강의실 : "801호" 
		 * 강좌명 : "의료용 디지털 영상 표준활용"
		 */
		System.out.println("강의실 : \"801호\"\n강좌명 : \"의료용 디지털 영상 표준활용\"");
		System.out.println("강의실 : \"801호\" \\ 강좌명 : \"의료용 디지털 영상 표준활용\"");
	}

}
