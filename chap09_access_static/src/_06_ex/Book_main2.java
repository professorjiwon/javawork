package _06_ex;

import java.util.Scanner;

public class Book_main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;

		for(int i=0; i<3; i++) {
			
			System.out.print("책 제목 입력 : ");
			String title = sc.next();
			System.out.print("책 저자 입력 : ");
			String author = sc.next();
			System.out.print("책 가격 입력 : ");
			int price = sc.nextInt();
			System.out.print("책 출판사 입력 : ");
			String publisher = sc.next();
			
			if(i==0) {
				book1 = new Book(title, author, price, publisher);
			} else if(i==1) {
				book2 = new Book(title, author, price, publisher);
			} else {
				book3 = new Book(title, author, price, publisher);
			}
		}
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