package _06_ex;

import java.util.Scanner;

public class Book_main_array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[3];
		
		for(int i=0; i<books.length; i++) {
			System.out.print("책 제목 입력 : ");
			String title = sc.next();
			System.out.print("책 저자 입력 : ");
			String author = sc.next();
			System.out.print("책 가격 입력 : ");
			int price = sc.nextInt();
			System.out.print("책 출판사 입력 : ");
			String publisher = sc.next();

			books[i] = new Book(title, author, price, publisher);
		}
		
		for(Book book : books) {
			System.out.println(book.getInfo());
		}
		System.out.println();
		
		// 책 제목 검색
		System.out.print("검색할 책 제목 입력 : ");
		String search = sc.next();
		
		boolean flag = false;
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle())) {
				System.out.println(books[i].getInfo());
				flag = true;
			}
		}
		if(!flag)
			System.out.println("책이 없습니다");
	}
}