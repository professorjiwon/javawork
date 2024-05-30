package _02_comparable;

import java.util.*;

public class T03_FruitComparator {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitDescending());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 7000));
		
		Iterator<Fruit> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Fruit fruit = iter.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}
}