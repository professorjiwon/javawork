package _10_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int select;
		do {
			System.out.println();
			System.out.println("*********** 메뉴 ***********");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("0. 종료");
			System.out.print("- 메뉴 번호 선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
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
			case 0:
				System.out.println("도서 프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 선택했습니다. 다시 선택해 주세요");
			}
		} while(0 != select);	
	}
	
	void insertBook() {
		System.out.println("===== 추가할 도서 입력 =====");
		System.out.print("도서명 : ");
		String title = sc.next();
		System.out.print("저자명 : ");
		String author = sc.next();
		System.out.print("출판사명 : ");
		String publisher = sc.next();
		
		lc.insertBook(new Book(title, author, publisher));
	}
	
	void selectList() {
		ArrayList<Book> list = lc.selectAll();
		System.out.println("===== 도서 전체 목록 조회 =====");
		if(list.isEmpty()) {
			System.out.println("도서가 없습니다");
		} else {
			for(Book book : list) {
				System.out.println("\t" + book);
			}
		}
	}
	
	void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 입력 : ");
		String keyword = sc.next();
		
		ArrayList<Book> list = lc.searchBook(keyword);
		if(list.isEmpty()) {
			System.out.println("검색 결과가 도서가 없습니다");
		} else {
			for(Book book : list) {
				System.out.println("\t" + book);
			}
		}
	}
	
	void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서명 입력 : ");
		String title = sc.next();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.next();
		
		if(lc.deleteBook(title, author) == null) {
			System.out.println("삭제할 도서가 없습니다.");
		} else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
	}
	
	void ascBook() {
		int result = lc.ascBook();
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
