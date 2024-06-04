package _06_Function;

import java.util.*;
import java.util.function.*;

public class T01_Function {
	// 클래스 변수
	static List<Student> list = Arrays.asList(
			new Student("홍길동", 79, 100),
			new Student("박길동", 84, 89)
	);
	
	// 출력메소드
	static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student));
		}
		System.out.println();
	}
	
	static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEng());
		
		System.out.println("[컴퓨터 점수]");
		printInt(t -> t.getCom());
	}
}
