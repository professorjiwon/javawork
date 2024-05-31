package _04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		// 요일 1~7
		int week = cal.get(cal.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.THURSDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.TUESDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY;
		}
		if(today == Week.SUNDAY) 
			System.out.println("일요일엔 짜파게티");
		else
			System.out.println("열심히 자바 공부를 한다");
	}
}
