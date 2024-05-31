package _03_WildcardGenerics;

public class Course {
	// 모든 사람이면 등록 가능
	static void registerCourse(Applicent<?> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 course에 등록함");
	}
	
	// 학생만 등록 가능
	static void registerCourse2(Applicent<? extends Student> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 course2에 등록함");
	}
	
	// 직장인 일반인 등록가능
	static void registerCourse3(Applicent<? super Worker> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 course3에 등록함");
	}
}
