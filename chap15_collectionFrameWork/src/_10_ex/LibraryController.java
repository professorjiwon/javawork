package _10_ex;

import java.util.ArrayList;

public class LibraryController {
	ArrayList<Book> aList = new ArrayList<>();
	
	LibraryController() {
		aList.add(new Book("java", "나자바", "한빛미디어"));
		aList.add(new Book("oracle", "오로라", "길벗"));
		aList.add(new Book("aws", "이고잉", "더조은"));
	}
	
	void insertBook(Book book) {
		aList.add(book);
	}
	
	ArrayList<Book> selectAll() {
		return aList;
	}

	ArrayList<Book> searchBook(String search) {
		ArrayList<Book> searchList = null;
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다.");
			return null;
		}
		for(Book b : aList) {
			if(b.getTitle().contains(search))
				searchList.add(b);
		}
		/*
		for(int i=0; i<aList.size(); i++) {
			if(aList.get(i).getTitle().contains(search)) {
				searchList.add(aList.get(i));
			}
		}
		*/
		return searchList;
	}
	
	Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i=0; i<aList.size(); i++) {
			if(aList.get(i).getTitle().equals(title) && author.equals(aList.get(i).getAuthor())) {
				removeBook = aList.remove(i);
				break;
			}
		}
		return removeBook;
	}
}