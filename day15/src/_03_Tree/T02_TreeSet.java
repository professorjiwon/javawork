package _03_Tree;

import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		while(ts.size() < 6) {
			ts.add((int)(Math.random()*45) + 1);
		}
		System.out.println(ts);
	}

}
