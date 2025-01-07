package _06_ex;

public class Book_main {

	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println("book1의 정보 : ");
		System.out.println(book1.name);
		System.out.println(book1.isbn);
		System.out.println(book1.price);
		System.out.println();
		
		Book book2 = new Book("oracle", 90879);
		System.out.println("book2의 정보 : ");
		System.out.println(book2.name);
		System.out.println(book2.isbn);
		System.out.println(book2.price);

	}

}
