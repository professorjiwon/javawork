package _04_ex01;

public class T01_main_book {
	int instanceValue;
	
	public static void main(String[] args) {
		T01_api_book book1 = new T01_api_book("python");
		T01_api_book book2 = new T01_api_book("springBoot",987654);
		T01_api_book book3 = new T01_api_book();
		T01_api_book book4 = new T01_api_book("JSP",7654321,32000);
		
		System.out.println("book1 : " + book1.bookName);
		
		System.out.println("book2 : " + book2.bookName);
		System.out.println("book2 : " + book2.ISBN);
		
		System.out.println("book3 : " + book3.bookName);
		System.out.println("book3 : " + book3.ISBN);
	}

}
