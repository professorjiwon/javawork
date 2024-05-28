package _01_localDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T04_Zoned {

	public static void main(String[] args) {
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		
		ZonedDateTime berlinDT = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(berlinDT);
		
		ZonedDateTime newYorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkDT);
		
		// 기준시간
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		// calendar 사용
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now.get(Calendar.HOUR));
	}

}
