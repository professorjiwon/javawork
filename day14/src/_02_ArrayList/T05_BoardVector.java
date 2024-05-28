package _02_ArrayList;

import java.util.*;

public class T05_BoardVector {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(1);
		
		for(Board b : list) {
			System.out.println(b.getTitle()+ ", " + b.getContent() + ", " + b.getWriter());
		}
	}
}
