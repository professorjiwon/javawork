package _03_calendar_date;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2024, 12-1, 7);
		int month = date1.get(Calendar.MONTH);
		System.out.println("월 : " + (month+1));
		
		date1.set(2024, 5-1, 27, 16, 53);
		System.out.println(date1.get(Calendar.HOUR)+ "시");
		
		date1.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(date1.get(Calendar.MONTH)+1 + "월");
	}
}