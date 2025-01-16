package _02_LocalDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2024, 12, 30, 10, 0, 0);
		LocalDateTime endDay = LocalDateTime.of(2025, 7, 21, 18, 30, 0);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일 : " + dtf.format(startDay));
		System.out.println("종료일 : " + dtf.format(endDay));
		
		if(today.isBefore(endDay)) {
			System.out.println("수업중");
		} else if(today.isAfter(endDay)) {
			System.out.println("종료된 수업입니다");
		} else if(today.isEqual(endDay)) {
			System.out.println("오늘은 수업 종료날");
		}
		System.out.println("----------------------------------------");
		
		Duration duration = Duration.between(startDay, endDay);
		System.out.println(duration.getSeconds());
		System.out.println("----------------------------------------");
		System.out.println("종료일까지 " + today.until(endDay, ChronoUnit.MONTHS) + "개월 남음");
		System.out.println("종료일까지 " + today.until(endDay, ChronoUnit.DAYS) + "일 남음");
		System.out.println("종료일까지 " + today.until(endDay, ChronoUnit.HOURS) + "시간 남음");
		
		System.out.println("수업일 : " + startDay.until(endDay, ChronoUnit.DAYS) + "일");
		System.out.println("----------------------------------------");
		
		System.out.println(today.plusYears(3).format(dtf));
		System.out.println(today.plusMonths(5).format(dtf));
		System.out.println(today.plusDays(100).format(dtf));
		System.out.println("----------------------------------------");
		
		System.out.println(today.minusYears(5).format(dtf));
		System.out.println(today.minusMonths(5).format(dtf));
		System.out.println(today.minusDays(100).format(dtf));
	}
}
