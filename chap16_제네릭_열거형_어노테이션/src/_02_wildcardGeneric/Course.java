package _02_wildcardGeneric;

public class Course {
	// 모든 사람이 등록 가능
	static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	// 학생만 등록 가능
	
	
	// 직장인 및 일반인 등록 가능

}