package _07_treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T01_treeMap {

	public static void main(String[] args) {
		// 키를 기준으로 정렬
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		// 색인 apple는 10page
		treeMap.put("base", 60);
		treeMap.put("apple", 40);
		treeMap.put("guess", 90);
		treeMap.put("cherry", 30);
		treeMap.put("ever", 50);
		treeMap.put("description", 80);
		
		System.out.println("c~f 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap =  treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "페이지");
		}

	}

}
