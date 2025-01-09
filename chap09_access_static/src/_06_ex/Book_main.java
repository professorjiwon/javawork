package _06_ex;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		// 객체 만들기 1. 기본생성자로 객체를 생성하고 setter메소드로 값을 넣기
		Book book1 = new Book();
		book1.setTitle("JAVA");
		book1.setAuthor("서민구");
		book1.setPrice(25000);
		book1.setPublisher("김앤북");
		
		// 객체 만들기 2. 매개변수가 있는 생성자를 이용하여 값 넣기
		Book book2 = new Book("ORACLE", "김오라", 30000,"한빛미디어");
		
		// 사용자로부터 입력받아 값 넣기
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목 입력 : ");
		String title = sc.next();
		System.out.print("책 저자 입력 : ");
		String author = sc.next();
		System.out.print("책 가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("책 출판사 입력 : ");
		String publisher = sc.next();
		
		Book book3 = new Book(title, author, price, publisher);
		
		System.out.println(book1.getInfo());
		System.out.println(book2.getInfo());
		System.out.println(book3.getInfo());
		
		// 책 제목 검색
		System.out.print("검색할 책 제목 입력 : ");
		String search = sc.next();
		
		if(search.equals(book1.getTitle())) {
			System.out.println(book1.getInfo());
		} else if(search.equals(book2.getTitle())) {
			System.out.println(book2.getInfo());
		} else if(search.equals(book3.getTitle())) {
			System.out.println(book3.getInfo());
		} else {
			System.out.println("책이 없습니다");
		}
	}
}