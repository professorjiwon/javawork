package _01_ArrayList;

import java.util.List;
import java.util.Vector;

public class T05_BoardVector {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("HTML", "김웹앱", "내용3"));
		list.add(new Board("JSP", "이제이", "내용4"));
		list.add(new Board("AWS", "박클라", "내용5"));
		
		list.remove(1);
		
		for(Board b : list) {
			System.out.println(b);
		}
	}
}