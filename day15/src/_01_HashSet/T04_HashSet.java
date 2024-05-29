package _01_HashSet;

import java.util.*;

public class T04_HashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {	
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
			
		set.clear();
		
		for(int i=0; i<6; i++) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		// set은 순서가 없어 정렬하지 못함
		// 정렬을 하려면 List로 변환해야 함
		List list = new LinkedList(set); // ArrayList, Vector 모두 사용 가능
		Collections.sort(list);
		System.out.println(list);		
	}
}
