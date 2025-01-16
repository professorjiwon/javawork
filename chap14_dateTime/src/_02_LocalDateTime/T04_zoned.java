package _02_LocalDateTime;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T04_zoned {

	public static void main(String[] args) {
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		
		ZonedDateTime newYorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkDT);
		
		// 기준시간
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		// calendar 사용
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angles");
		Calendar now = Calendar.getInstance(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now.getTime()));
	}
}
