package _01_ArrayList;

public class Board {
	private String subject;
	private String writer;
	private String content;
	
	Board() {
	}
	
	Board(String subject, String writer, String content) {
		this.subject = subject;
		this.writer = writer;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "제목 : " + subject + ", 글쓴이 : " + writer + ", 가격 : " + content;
	}
}
