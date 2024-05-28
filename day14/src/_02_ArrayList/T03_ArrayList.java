package _02_ArrayList;

import java.util.*;

public class T03_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			int random = (int)(Math.random()*10);
			list.add(random);
		}
		System.out.println(list.toString());
		
		List<Integer> list2 = new ArrayList<Integer>(list.subList(3, 6));
		System.out.println(list2.toString());
		
		Collections.sort(list);
		
		System.out.println(list);
		
		// list는 list2의 요소를 모두 가지고 있는가?
		System.out.println("list는 list2의 요소를 모두 가지고 있는가?" + list.containsAll(list2));

		// list와 list2의 요소중 교집합만 남기고 모두 삭제
		System.out.println("교집합 : " + list.retainAll(list2));
		System.out.println(list);
		System.out.println(list2);
		
	}

}
