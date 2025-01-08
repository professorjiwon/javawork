package _04_staticEx;

public class Document_main {

	public static void main(String[] args) {
		Document d1 = new Document();		// 제목없음1.txt
		Document d2 = new Document("자바");	// 자바.txt
		Document d3 = new Document();		// 제목없음2.txt
		Document d4 = new Document("오라클");	// 오라클.txt
		Document d5 = new Document("HTML");	// HTML.txt
		Document d6 = new Document();		// 제목없음3.txt
	}
}
