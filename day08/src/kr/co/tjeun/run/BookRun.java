package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookRun {

	public static void main(String[] args) {
		/*
		// 초기화 방법1. 기본생성자로 객체를 생성하여 getter/setter메소드로 값 초기화
		Book book = new Book();
		book.setTitle("JAVA");
		book.setAuthor("김지원");
		book.setPrice(35000);
		book.setPublisher("tjeun");
		System.out.println(book.information());
		
		// 초기화 방법 2. 매개변수가 있는 생성자 이용
		Book book2 = new Book("springBoot","이강도",27000,"저강도");
		System.out.println(book2.information());
		
		// 사용자로 부터 값을 입력받아 초기화 하여 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("책제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 입력 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 입력 : ");
		String publisher = sc.nextLine();
		
		Book book3 = new Book(title,author,price,publisher);
		
		Book book4 = new Book();
		System.out.print("책제목 입력 : ");
		book4.setTitle(sc.nextLine());
		
		System.out.print("저자 입력 : ");
		book4.setTitle(sc.nextLine());
		
		System.out.print("가격 입력 : ");
		book4.setPrice(sc.nextInt());
		sc.nextLine();
		
		System.out.print("출판사 입력 : ");
		book4.setPublisher(sc.nextLine());
		*/
		// 관리 해야 되는데 일반 변수 사용
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");

			System.out.print("책제목 입력 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 입력 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 입력 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 입력 : ");
			String publisher = sc.nextLine();
			
			if(i == 0)
				book1 = new Book(title, author, price, publisher);
			else if(i == 1)
				book2 = new Book(title, author, price, publisher);
			else
				book3 = new Book(title, author, price, publisher);			
		}
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.next();
		
		if(book1.getTitle().equals(search)) {
			System.out.println(book1.information());
		}
		if(book2.getTitle().equals(search)) {
			System.out.println(book2.information());
		}
		if(book3.getTitle().equals(search)) {
			System.out.println(book3.information());
		}
		
		if(!book1.getTitle().equals(search) && !book2.getTitle().equals(search) && !book3.getTitle().equals(search)) {
			System.out.println("그런 책 없어요");
		}
	}
}
