package _01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T04_BoardArrayList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		Board board1 = new Board();
		board1.setSubject("java");
		board1.setWriter("이문열");
		board1.setContent("내용1");
		
		Board board2 = new Board("oracle", "오로라", "내용2");

		list.add(board1);
		list.add(board2);
		list.add(new Board("HTML", "김웹앱", "내용3"));
		list.add(new Board("JSP", "이제이", "내용4"));
		list.add(new Board("AWS", "박클라", "내용5"));
		
		// 저장된 총 객체의 수
		System.out.println("총 객체의 수 : " + list.size());
		
		// 특정 인덱스의 객체 가져오기
		Board boardRe = list.get(1);
		System.out.println("책 제목 : " + boardRe.getSubject());
		System.out.println("글쓴이 : " + boardRe.getWriter());
		System.out.println("가격 : " + boardRe.getContent());
		System.out.println("---------------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------------------");
		
		// 삭제
		list.remove(board1);
		list.remove(2);
		
		for(Board b : list) {
			System.out.println(b);
		}	
	}
}