package ex01;

import java.util.*;

public class BookController {
	ArrayList<Book> list = new ArrayList<Book>();
	
	BookController() {
		list.add(new Book("자바 프로그래밍","서민구","컴퓨터",20000));
		list.add(new Book("요리는 소스빨","소연남","요리",17000));
		list.add(new Book("대화의 기술","다니엘","인문",17500));
		list.add(new Book("의료 AI입문","양형규","의료",9900));
	}
	void insertBook(Book b) {
		list.add(b);
	}
	ArrayList<Book> listAll() {
		return list;
	}
	
	// 여러권이 반환
	ArrayList<Book> searchBook(String title) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book book : list) {
			if(book.getTitle().contains(title))
				searchList.add(book);
		}
		return searchList;
	}
	
	// Book  책1권 반환
	Book searchTitle(String title) {
		for(Book book : list) {
			if(book.getTitle().equals(title))
				return book;
		}
		return null;
	}
	
	Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				removeBook = list.remove(i);
				break;
			}
		}
		return removeBook;
	}
	
	int ascBook() {
		list.sort(null); // sort()메소드는 compareTo()가 호출됨
		return 1;
	}	
}