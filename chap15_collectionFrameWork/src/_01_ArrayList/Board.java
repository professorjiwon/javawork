package _01_ArrayList;

public class Board {
	private String subject;
	private String writer;
	private int price;
	
	Board() {
	}
	
	Board(String subject, String writer, int price) {
		this.subject = subject;
		this.writer = writer;
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "제목 : " + subject + ", 글쓴이 : " + writer + ", 가격 : " + price;
	}
}
