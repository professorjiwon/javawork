package _02_LocalDateTime;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear() + "년");
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue() + "월");
		System.out.println(today.getDayOfMonth() + "일");
		System.out.println("365일중 " + today.getDayOfYear() + "일");
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());  // 1: 월요일
		
		System.out.println("이달은 총 " + today.lengthOfMonth() + "일까지 이다");
		System.out.println("올해는 총 " + today.lengthOfYear() + "일까지 이다");
		
		System.out.println("올해는 윤년인가? " + today.isLeapYear());
		System.out.println("-------------------------------------------");
		
		LocalDate day = LocalDate.of(2028, 5, 7);
		System.out.println("2028년은 윤년인가? " + day.isLeapYear());
		System.out.println("2028년은 총 " + day.lengthOfYear() + "일까지 이다");
	}
}