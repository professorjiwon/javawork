package _05_ArrayListEx;

import java.util.ArrayList;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("김수연",23,"여"));
		lc.insertBook();
		System.out.println(lc.selectAll());
		/*
		ArrayList<Book> aList = lc.selectAll();
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		for(Book book : aList) {
			System.out.println(book);
		}
		*/
		lc.insertBook(new Book("리액트","이고잉","위키북스"));
		System.out.println(lc.selectAll());
		
		Book bookSe = lc.searchBook("java");
		if(bookSe == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println(bookSe);
		}
	}

}
