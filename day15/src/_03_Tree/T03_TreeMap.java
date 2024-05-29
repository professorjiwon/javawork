package _03_Tree;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T03_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", 1000);
		treeMap.put("banana", 3000);
		treeMap.put("cherry", 2000);
		treeMap.put("grape", 5000);
		treeMap.put("mango", 1000);
		treeMap.put("orange", 500);
		treeMap.put("peach", 1000);
		treeMap.put("watermelon", 10000);
		
		System.out.println("[c~n 사이의 단어 검색]");
		NavigableMap<String, Integer> raviMap = treeMap.subMap("c", true, "n", true);
		// System.out.println(raviMap);
		for(Entry<String, Integer> entry  : raviMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}	
	}
}
