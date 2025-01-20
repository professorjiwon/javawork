package _10_ex;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		
		lc.insertBook();
		System.out.println(lc.selectAll());
		
		lc.insertBook(new Book("springBoot", "박봄이", "위키북스"));
		System.out.println(lc.selectAll());
		
		Book book = lc.searchBook("java");
		if(book == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println("찾은 책 : " + book);
		}
	}
}

