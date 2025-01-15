package _01_calendar;

import java.util.Calendar;

public class T02_set_calender {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2025, 3-1, 15);
		System.out.println("월 : " + (date1.get(Calendar.MONTH) + 1));
		
		System.out.println("이달의 몇번째 주 : " + date1.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올해의 몇번째 주 : " + date1.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("몇일 : " + date1.get(Calendar.DAY_OF_MONTH));
		System.out.println("365일 중 몇일 : " + date1.get(Calendar.DAY_OF_YEAR));
		
		date1.set(2025, 4-1, 20, 11, 15, 55);
		System.out.println(date1.get(Calendar.HOUR) + "시");
	}
}
