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
		ArrayList<Book> searchList = new ArrayList<>();
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다.");
			return null;
		}
		for(Book b : aList) {
			if(b.getTitle().contains(search)) {
				searchList.add(b);
			}
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
	
	/*
	 * 숫자를 중심으로 sort하면
	    this.price < other.price => -1
	    this.price == other.price => 0
	    this.price > other.price => 1
	 * 문자열
	   같은경우 => 0
	   그외에 => 0을제외한 정수
	 */
	int ascBook() {
		/*
		   sort(null) : null은 리스트요소들이 Comparable인터페이스를 구현하는 경우,
		    			compareTo 메소드에 기반하여 정렬을 함
		    		- 현재 Book 객체의 title을 가반으로 오름차순 정렬해줌	
		 */
		aList.sort(null);
		return 1;
	}
}