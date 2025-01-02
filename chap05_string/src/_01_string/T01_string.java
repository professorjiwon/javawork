package _01_string;

import java.util.Scanner;

public class T01_string {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1==name2);
		
		String name3 = name1;
		System.out.println(name1 == name3);
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println("주소가 같은가?" + str1==str2);
		System.out.println("그안의 값이 같은가?" + str2.equals(str1));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주소 입력(시또는 도만) : ");
		String city = sc.next();
		
		// if(city == "경기도")  -> city의 저장된 주소와 "경기도"가 같은가?
		if(city.equals("경기도")) {
			System.out.println("경기도사람");
		}
		System.out.println("종료");
	}
}
