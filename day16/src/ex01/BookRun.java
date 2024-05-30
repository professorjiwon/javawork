package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookRun {
	static BookController bc = new BookController();  //클래스 변수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println();
			System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.println();
            
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();
            
            switch(num) {
            case 1:
            	insertBook();
            	break;
            case 2:
            	listAll();
            	break;
            case 3:
            	searchBook();
            	break;
            case 4:
            	deleteBook();
            	break;
            case 5:
            	ascBook();
            	break;
            case 9:
            	System.out.println("프로그램을 종료합니다");
            	return;
            default :
            	System.out.println("잘못입력하였습니다. 다시 입력해 주세요");
            }
		}
	}
	
	static void insertBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 새 도서 추가 =========");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 = 인문 /자연과학 /컴퓨터 /요리 /기타 : ");
		String category = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(title, author, category, price));
	}
	
	static void listAll() {
		System.out.println("========= 도서 목록 조회 =========");
		ArrayList<Book> bookList = bc.listAll();
		if(bookList.isEmpty())
			System.out.println("도서가 하나도 없습니다.");
		else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}
	static void searchBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 도서 검색 =========");
		System.out.print("검색할 제목 입력 : ");
		String title = sc.nextLine();
		
		// 글자가 들어가져 있으면 다 검색
		ArrayList<Book> searchList = bc.searchBook(title);
		if(searchList.isEmpty()) {
			System.out.println("도서가 없습니다");
		} else {
			for(Book book : searchList) {
				System.out.println(book);
			}
		}
		
		// 정확하게 title과 일치하는것만 가져오기
		/*
		Book book = bc.searchTitle(title);
		if(book == null) {
			System.out.println("도서가 없습니다");
		} else {
			System.out.println(book);
		}
		*/
	}
	static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 도서 삭제 =========");
		System.out.print("삭제할 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.nextLine();
		
		Book delBook = bc.deleteBook(title, author);
		
		if(delBook==null) {
			System.out.println("찾는 도서가 없어서 삭제하지 못함");
		} else {
			System.out.println(delBook.getTitle() + "책을 삭제하였습니다.");
		}
	}
	static void ascBook() {
		int result = bc.ascBook();
		if(result == 1)
			System.out.println("정렬에 성공하였습니다.");
		else
			System.out.println("정렬에 실패하였습니다.");
	}
}