package _06_Function;

import java.util.*;
import java.util.function.*;

public class T02_Function {
	// 클래스 변수
	static List<Student> list = Arrays.asList(
			new Student("홍길동", 79, 100),
			new Student("박길동", 84, 89),
			new Student("아무개", 68, 93),
			new Student("김나래", 75, 47),
			new Student("BTS", 98, 100)
	);
	
	// 평균 출력 메서드
	static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		double engAvg = avg(t -> t.getEng());
		System.out.printf("[영어 평균 점수] = %.2f\n", engAvg);
		
		double comAvg = avg(t -> t.getCom());
		System.out.printf("[컴퓨터 평균 점수] = %.2f", comAvg);
	}
}





