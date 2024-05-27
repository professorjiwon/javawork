package _03_calendar_date;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2024, 12-1, 7);
		int month = date1.get(Calendar.MONTH);
		System.out.println("월 : " + (month+1));

	}

}
