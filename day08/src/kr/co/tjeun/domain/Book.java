package kr.co.tjeun.domain;

// 자바빈 파일
//  속성, 생성자, getter/setter 로 이루어져 있음
//  속성에 데이터를 담거나 보내주는 역할을 담당
public class Book {
	// 도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = title;
	}
	
	// 모든 필드의 값을 하나의 문자열로 반환해주는 메소드
	public String information() {
		return title + " / " + author + " / " + price + " / " + publisher;
	}
}







