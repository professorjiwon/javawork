package _06_ex;

public class Book {
	String name;
	int isbn;
	int price;
	
	Book() {
		this("java", 34567, 35000);
	}
	
	Book(String name) {
		this(name, 12345, 30000);
	}
	
	Book(String name, int isbn) {
		this(name, isbn, 30000);
	}
	
	Book(String name, int isbn, int price) {
		this.name = name;
		this.isbn = isbn;
		this.price = price;
	}
}
