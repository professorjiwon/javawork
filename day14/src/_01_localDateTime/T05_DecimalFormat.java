package _01_localDateTime;

import java.text.DecimalFormat;
import java.text.ParseException;

public class T05_DecimalFormat {

	public static void main(String[] args) {
		double number = 1234567.89;
		double number2 = 3.0;
		// DecimalFormat df = new DecimalFormat("#,###");
		// 0이면 무조건 자리차지, # 있으면 자리차지 없음 출력안함
		System.out.println(new DecimalFormat("0").format(number));	// 정수출력 소수점은 반올림
		System.out.println(new DecimalFormat("#").format(number));
		
		System.out.println(new DecimalFormat("0.0").format(number));
		System.out.println(new DecimalFormat("#.#").format(number));
		
		System.out.println(new DecimalFormat("0000000000.0000").format(number));
		System.out.println(new DecimalFormat("##########.####").format(number));
		System.out.println("--------------------------------");
		
		System.out.println(new DecimalFormat("#,###.##").format(number));
		System.out.println("--------------------------------");
		
		String stNum = "1,234,567.89";
		DecimalFormat df = new DecimalFormat("#,###.##");
		try {
			Number num = df.parse(stNum);
			System.out.println(num); // Number는 객체라서 연산할 수 없음
			
			double d = num.doubleValue();	// 실수형으로 변환
			System.out.println(d*2);
			
			System.out.println((new DecimalFormat("#,###.##").parse(stNum).doubleValue())*2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
