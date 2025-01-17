package _01_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T03_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(6);
		list.add(2);
		
		System.out.println("list : " + list);
		
		List list2 = new ArrayList(list.subList(1, 3));
		System.out.println("list2 : " + list2);
		System.out.println("-----------------------------------");
		
		// Collections.sort()
		Collections.sort(list);  // 반환형 void
		System.out.println("오름차순 정렬 : " + list);
		Collections.reverse(list);
		System.out.println("내림차순 정렬 : " + list);
		
		// contains(객체) : 객체를 포함하고 있는가?
		// containsAll(객체들) : 객체들(모두)를 포함하고 있는가?
		System.out.println("list는 list2의 모든 요소를 갖고 있는가? " + list.containsAll(list2)); 
		System.out.println("-----------------------------------");
		
		list2.add("B");
		list2.add("C");
		list2.add(1, "AA");
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("-----------------------------------");
		
		// retainAll(객체들) : 객체들에 있는것만 빼고 나머지 삭제
		System.out.println("list에서 list2와 겹치는 부분만 남기고 나머지 삭제 : " + list.retainAll(list2));
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		list2.add(1, 1);
		list2.add(4, 8);
		System.out.println("list2 : " + list2);

		// list2에서 list에 있는 것들만 삭제
		for(int i=0; i<list2.size(); i++) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
				i--;
			}
		}
		/*
		for(int i=list2.size()-1; i>=0; i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		*/
		System.out.println(list);
		System.out.println(list2);

	}
}
