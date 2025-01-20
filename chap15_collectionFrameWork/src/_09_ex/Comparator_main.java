package _09_ex;

import java.util.TreeSet;

public class Comparator_main {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new Descending());
		treeSet.add(new Fruit("포도", 7000));
		treeSet.add(new Fruit("딸기", 10000));
		treeSet.add(new Fruit("사과", 5000));
		
		System.out.println(treeSet);
	}
}