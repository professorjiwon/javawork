package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookArrayRun {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력 : ");
			System.out.print("책제목 입력 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 입력 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 입력 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 입력 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
		}
		// 도서목록 조회
		for(Book book : books) {
			System.out.println(book.information());
		}
		System.out.println();
		/*
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		*/
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 도서명 : ");
		String search = sc.next();
		
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle()))
				System.out.println(books[i].information());
		}
	}
}
