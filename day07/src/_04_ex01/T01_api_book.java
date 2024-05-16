package _04_ex01;

public class T01_api_book {
	String bookName;
	int ISBN;
	int price;
	
	T01_api_book() {
		this("JAVA", 1234567, 35000);
	}
	T01_api_book(String bookName) {
		this(bookName, 2345678, 35000);
	}
	T01_api_book(String bookName, int ISBN) {
		this(bookName, ISBN, 35000);
	}
	T01_api_book(String bookName, int ISBN, int price) {
		this.bookName = bookName;
		this.ISBN = ISBN;
		this.price = price;
	}
}
