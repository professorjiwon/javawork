package _01_localDateTime;

import java.text.DecimalFormat;

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

		String stNum = "1,234,567.89";

	}
}
