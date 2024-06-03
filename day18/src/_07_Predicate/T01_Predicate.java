package _07_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class T01_Predicate {
	// 클래스 변수
	static List<Student> list = Arrays.asList(
			new Student("홍길동", "남", 100),
			new Student("박길동", "남", 89),
			new Student("아무개", "여", 93),
			new Student("김나래", "여", 47),
			new Student("BTS", "남", 100)
	);
	
	// 남,여별 평균 구하기
	static double avg(Predicate<Student> predicate) {
		int sum = 0, count=0;
		for(Student student : list) {
			if(predicate.test(student)) {
				sum += student.getCom();
				++count;
			}
		}
		return (double)sum / count;
	}
			
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getGender().equals("남"));
		System.out.printf("[남자 평균 점수] = %.2f\n", maleAvg);
		
		double femaleAvg = avg(t -> t.getGender().equals("여"));
		System.out.printf("[여자 평균 점수] = %.2f", femaleAvg);
	}

}
