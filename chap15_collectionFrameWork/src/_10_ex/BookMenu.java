package _10_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int select;
		do {
			System.out.println("*********** 메뉴 ***********");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			System.out.print("메뉴 번호 선택 : ");
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
				System.out.println();
				return;
			default :
				System.out.println("잘못 선택했습니다. 다시 선택해 주세요");
			}
		} while(0 != select);	
	}
	
	void insertBook() {
		
	}
	
	ArrayList<Book> selectList() {
		ArrayList<Book> list = new ArrayList<>();
		
		return list; 
	}
	
	ArrayList<Book> searchBook() {
		ArrayList<Book> list = new ArrayList<>();
		
		return list;
	}
	
	Book deleteBook() {
		Book book = null;
		
		return book;
	}
	
	int ascBook() {
		return 1;
	}
}
