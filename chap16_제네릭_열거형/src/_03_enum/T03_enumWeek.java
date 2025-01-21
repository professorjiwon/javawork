package _03_enum;

import java.util.Calendar;

public class T03_enumWeek {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		Week today = null;
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
		}
		
		if(today == Week.SUNDAY)
			System.out.println("일요일엔 짜파게티 먹는날");
		else
			System.out.println("아주 열심히 자바공부하는날");
	}
}